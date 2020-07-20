package company.part1;

public class Clerk extends Manager {

	public Clerk() {
		System.out.println("사원의 생성자");
	}

	@Override
	public void orderByManager() {
		System.out.println("orderByManager");
	}

	@Override
	void work() {
		super.work();
	}

}
