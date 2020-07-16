package test;

import america.Child;
import america.Child2;
import korea.Parent;

public class Test2 {

	public static void main(String[] args) {
		
		// 다형성
		// 상위 클래스 : 지시, 후견
		// 하위 클래스 : 수행
		Parent work = new Child();
		
		// test 부모님꺼 나옴
//		System.out.println(work.name);

		//		Parent work2 = new Child2();
		work = new Child2();
		
//		System.out.println(work.name);
	}

}
