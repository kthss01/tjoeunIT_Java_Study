package korea;

// final : 모든 멤버 상속 금지 (보안, 캡슐화, 은닉)
//final public class Parent {
//public final class Parent {
public class Parent { // extends Object {

	String name = "홍길동";
	// private : 자신의 클래스에서만 ㅏㅅ용
//	private double money = 100000000;
//	final double money = 3000000;
	// final 필드 -> 상수화(constant) : 캡슐화(보안, 보호)
	double money = 3000000;
	String address = "서울시 종로구 무교동";

	void print() {
	// final 메서드 -> 상속(X), 오버라이딩(X)
//	final void print() {
		System.out.println("print");
	}

}
