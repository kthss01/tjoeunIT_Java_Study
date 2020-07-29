package java_20200729_1;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class ChattingClient extends Frame implements ActionListener {

	Thread listenThread;
	Socket socket;
	BufferedReader reader;
	BufferedWriter writer;

	String server_msg;
	String client_msg;
	String name;

	TextArea ta;
	TextField tf;
	List list;
	Button b;
	Panel p1;
	Panel p2;

	// 생성자
	public ChattingClient(String userName, String HostIP, String HostPort) throws Exception {
		super("[" + userName + "] Client Window");
		this.name = userName;

		p1 = new Panel();
		p2 = new Panel();

		ta = new TextArea();
		tf = new TextField();

		tf.setColumns(50); // 채팅 입력창 크기 증가
		tf.addActionListener(this);

		list = new List();
		b = new Button("Exit");

//		p1.setLayout(new GridLayout(1, 2));
		p1.setLayout(new BorderLayout());

		p1.add(ta, BorderLayout.CENTER);
		p1.add(list, BorderLayout.EAST);
		p2.add(tf);
		p2.add(b);
		
		add(p1, "Center");
		add(p2, "South");

		name = userName;

		InetAddress realHost = InetAddress.getByName(HostIP);
		int realPort = Integer.parseInt(HostPort);

		socket = new Socket(realHost, realPort);

		reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		sendMessage("001" + userName + "\n");

		// 창닫기 이벤트 핸들러 시작
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});

		// Exit 버튼의 창닫기
		b.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

		// 끝
	}

	// 메시지를 감지하는 메소드
	public void listenMessage() {
		listenThread = new Thread() {
			@Override
			public void run() {

				try {

					while ((server_msg = reader.readLine()) != null) {

						System.out.println(server_msg);

						if (server_msg.startsWith("001")) {
							list.removeAll();

							StringTokenizer st = new StringTokenizer(server_msg.substring(3), "|");

							while (st.hasMoreTokens())
								list.add((String) st.nextToken()); // while(in)
						} else if (server_msg.startsWith("002")) {
							ta.append(server_msg.substring(3) + "\n");
						} // if
					} // while(out)

					// closeAll();
				} catch (Exception e) {
					System.out.println(e);
				} finally {
					closeAll();
				} // try
			} // run
		};

		listenThread.setDaemon(true);

		listenThread.start();
	}

	// Stream/socket Close 메소드
	public void closeAll() {

		try {
			reader.close();
			writer.close();
			socket.close();
			System.exit(0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// 메시지 전송 메소드
	public void sendMessage(String msg) {

		try {
			writer.write(msg + "\n");
			writer.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// 액션이 발생하면 불려지는 핸들러
	@Override
	public void actionPerformed(ActionEvent e) {
		sendMessage("002[" + name + "]" + tf.getText());
		tf.setText("");
	}

	// Main 메소드
	public static void main(String[] args) {

		String userName = "java";
		String HostIP = "localhost";
		String HostPort = "7777";

		HostPort = JOptionPane.showInputDialog("HostPort: ", HostPort);
		HostIP = JOptionPane.showInputDialog("HostIP: ", HostIP);
		userName = JOptionPane.showInputDialog("userName: ", userName);

		ChattingClient cl = null;

		try {
			cl = new ChattingClient(userName, HostIP, HostPort);

			cl.setBounds(200, 200, 600, 600); // 사각형 영역의 경계를 크기만큼 지정함
			cl.setVisible(true);

			cl.listenMessage();

		} catch (Exception e) {
			cl.closeAll();
		}
	} // main

}
