package com.javateam.jse;

public class Test21 {

	public static void main(String[] args) {
		
		MemberVO member1 = new MemberVO();
		member1.setName("이순신");
		member1.setAddress("아산");
		member1.setAge(54);
		System.out.println(member1.getName());
		System.out.println(member1.getAddress());
		System.out.println(member1.getAge());
		System.out.println(member1);
		
		MemberVO member2 = new MemberVO("이순신", "아산", 54);
		System.out.println(member2);
		
		// 두 객체의 멤버 필드들 간의 비교
		System.out.println(member1.equals(member2));
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		
		// 복사 생성자
		MemberVO member3 = new MemberVO(member2);
		System.out.println(member3);
	}

}
