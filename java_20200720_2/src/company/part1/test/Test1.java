package company.part1.test;

import company.part1.Clerk;
import company.part1.Director;
import company.part1.Manager;

public class Test1 {

	public static void main(String[] args) {

		Director work1 = new Clerk();
		work1.orderByDirector();

		Manager work2 = new Clerk();
		work2.orderByManager();

	}

}
