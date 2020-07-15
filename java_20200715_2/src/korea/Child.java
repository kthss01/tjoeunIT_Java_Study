package korea;

/*
 * 상속 (inheritance)
 * 클래스 간의 다중 상속 (X)
 * 참고) 인터페이스 간의 다중 상속 (O)
 */
public class Child extends Parent {
	
	String name = "홍길남";
//	double money = 5000;
	String address = "서울시 관악구 은천동";
	
	// 오버라이딩(over-riding)
	@Override
	void print() { // final 걸면 overriding 안됨
		super.money = 7000000; // final 필드면 접근 불가
		super.print(); // 부모 클래스의 메서드
		System.out.println(super.name); // 부모 클래스의 필드
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
//		System.out.println(child.money);
//		System.out.println(child.address);
		//child.print();
		
//		System.out.println(child.money); // 부모께 private이라 not visible (은닉화, 캡슐화)
		
		// 정적(static) 영역 => super.~ (X), this.~ (X)
		
		// test
//		Parent p = (Parent) child;
//		System.out.println(p.money);
//		System.out.println(p.address);
	}
}
