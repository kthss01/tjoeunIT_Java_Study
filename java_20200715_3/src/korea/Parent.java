package korea;

public class Parent {
	String name = "홍길동";
	double money = 3000000;
	String address = "서울시 종로구 무교동";

	Parent() {
		System.out.println("부모 생성자");
	}

	Parent(String msg) {
		System.out.println("부모 생성자 : " + msg);
	}

	protected void print() {
		System.out.println("print");
	}

//	void print(int a) {
//		
//	}

}
