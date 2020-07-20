package company.part1;

abstract public class Manager implements Director {

	@Override
	public void orderByDirector() {
		System.out.println("orderByDirector : Manager");
	}

	public Manager() {
		System.out.println("과장님 생성자");
	}

	abstract public void orderByManager();

	void work() {

	}

	@Override
	public void orderByChairMan() {
		// TODO Auto-generated method stub
		
	}
}
