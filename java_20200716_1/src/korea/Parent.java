package korea;

import america.Child;

public class Parent {
	
//	Child child;
	Thing thing;
	
	public String name = "홍길동";
//	public double money = 3000000;
	protected double money = 3000000; // 다른 패키지라도 상속되면 접근 가능
	String address = "서울시 종로구 무교동";

	public void print() {
		System.out.println("print");
	}

}
