package america;

import korea.Parent;

public class Child2 extends Parent {

	String name = "홍길선";
	double moeny = super.money; // default는 한 패키지내에서만 참조 가능해서 default면 안됨
	String address = "서울시 노원구 상계동";

	@Override
	public void print() {
	}

	public static void main(String[] args) {

		Child2 child = new Child2();
		System.out.println(child.money);
	}
}
