package korea;

public class Child extends Parent {

	String name = "홍길남";
	String address = "서울시 관악구 은천동";

	Child() {
//		Parent("충고/권면"); // (X)
//		new Parent("충고/권면"); // 이건 새로 생성하는거
//		System.out.println("생성자의 첫 문장은 생성자여야함"); // 이거 조심 super 맨위에 있어야함
		super("충고/권면");
//		super(); // 명시적으로 등장하려면 이렇게 하면 됨
//		System.out.println("자녀 생성자"); // 마찬가지로 this 맨 위에 있어야함
//		this("feedback");
		System.out.println("자녀 생성자");
	}
	
	Child(String msg) {
		System.out.println("자녀 생성자 : " + msg);
	}

	@Override
	public void print() {
	}

	// test 오버로딩된 method 오버라이딩 가능
//	@Override
//	void print(int a) {
//		
//	}

	public static void main(String[] args) {

		Child child = new Child();
	}
}
