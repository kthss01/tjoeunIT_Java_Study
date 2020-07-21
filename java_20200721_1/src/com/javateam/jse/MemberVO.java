package com.javateam.jse;

import java.util.Objects;

public class MemberVO {
	
	private String name;
	private String address;
	private int age;
	
	public MemberVO() {}
	
	public MemberVO(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	// 복사 생성자 : 다른 인스턴스 => 그 자신의 인스턴스 (객체)에 복사해주는 생성자
	public MemberVO(MemberVO member) {
		this.name = member.getName();
		this.address = member.getAddress();
		this.age = member.getAge();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("MemberVO [name=%s, address=%s, age=%s]", name, address, age);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name);
	}
	
}
