package america;

import korea.Parent;

public class Child extends Parent {

	String name = "홍길남";
	double moeny = super.money; // default는 한 패키지내에서만 참조 가능해서 default면 안됨
	String address = "서울시 관악구 은천동";

	@Override
	public void print() {
	}

	public static void main(String[] args) {

		Child child = new Child();
		System.out.println(child.money);
	}
}
