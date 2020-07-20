package company.part1;

// 인터페이스는 다중 상속 (O)
public interface Director extends Chairman, Chairman2{

	String name = "영업부장님";

	void orderByDirector(); // abstract 적어도 똑같음 (O)

	default void selfWorkByDirector() {
		System.out.println("selfWorkByDirector");
	}

}
