package company.part1;

// 과장님
//public abstract class Manager {
abstract public class Manager {
	
	String name;
	String job;
	
	public Manager() {
		System.out.println("과장님 생성자");
	}
	
	abstract public void orderByManager();
//	void orderByManager(); // (X)
	
	void work() {
		
	}
}
