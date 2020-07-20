package company.part1;

// 부장님
public interface Director {
//abstract public interface Director { // (O)

//	String name; // (X)
//	static String name = "영업부장님"; // (O)
//	final static String name = "영업부장님"; // (O)
//	static final String name = "영업부장님"; // (O)
	String name = "영업부장님"; // (O)
//	private String name = "영업부장님"; // (X)
//	protected String name = "영업부장님"; // (X)
	// 상수만 멤버 필드 허용
	// 인터페이스의 멤버들의 접근 제어자 => public
	
	// 일반 메서드 (X) , default 메서드는 가능
//	void work() {
//		
//	}
	
	// 생성자 (X)
//	public Director() {
//		
//	}
	
	// since 1.8 : default 메서드
	default void selfWorkByDirector() {
//		name = "기획부장님"; // (X) final field라 할당 안됨
	}

//	abstract void orderByDirector(); // abstract 적어도 똑같음 (O)
	void orderByDirector(); // abstract 적어도 똑같음 (O)
//	public void orderByDirector(); // (O)
//	protected void orderByDirector(); // (X)
//	private void orderByDirector(); // (X)
	
	// 이것도 since 1.8 이후 가능
	static void staticMethod() {
		System.out.println("부장님 정적 메서드");
	}
	
	// 정적 블럭 (X)
//	static {
//		
//	}
	
	// since 1.8부터 가능
	public static void main(String[] args) {
		System.out.println("인터페이스 실행");
	}
}
