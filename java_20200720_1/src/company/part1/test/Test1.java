package company.part1.test;

import company.part1.Clerk;
import company.part1.Manager;

public class Test1 {

	public static void main(String[] args) {
		
//		Clerk work = new Clerk();
		Manager work = new Clerk();
		// 추상 클래스는 중간 관리자라 직접 나서는게 아니고 지시를 해야함
//		Manager work = new Manager(); // (X)
//		Clerk work2 = new Manager(); // (X)
		work.orderByManager();
		
	}

}
