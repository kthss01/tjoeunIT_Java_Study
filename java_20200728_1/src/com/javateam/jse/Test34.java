package com.javateam.jse;

public class Test34 {

	public static void main(String[] args) {

		int result = 0;
		int num1 = 10;
		int num2 = (int) (Math.random() * 10); // 0이 나올 수 잇음
		num2 += 1;

		String str = null;

		try {

			if (num2 == 0) {
				throw new ArithmeticException(); // 바로 catch 문으로 들어감 (점프해버림)
			} else {
				result = num1 / num2;
				System.out.println(str.charAt(2));
			}
		}

		// 여기만 처리되면 catch 넘어감 여기서 처리못하면 다음 catch로 넘어감
		catch (ArithmeticException e) {
			System.out.println("나누기 에러 발생");

			// 대응(대처) 구문
			num2 = 1;
			result = num1 / num2;
		}
		// e 인스턴스를 알아서 만들어줌
		catch (Exception e) {
//		catch (ClassCastException | NullPointerException e) {

			// 에러 메시징
			System.out.println("기타 오류 발생");
			System.out.println(e); // toString()
//			System.out.println(e.toString()); // toString()
			System.out.println("-------------");
			System.out.println(e.getMessage()); // msg만
			System.out.println("-------------");
			e.printStackTrace(); // 제일 자세하게 나옴

		} finally {
			System.out.println("마무리");
		}

		System.out.println("result : " + result);

	} //
}
