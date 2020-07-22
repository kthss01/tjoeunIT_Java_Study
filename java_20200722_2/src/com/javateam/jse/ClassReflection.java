package com.javateam.jse;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassReflection {
	String name;
	int age;

	void test() throws SecurityException, ClassNotFoundException {
		String thisMethodName = this.getClass().getDeclaredMethods().toString();

		String className = this.getClass().getName();
		Method[] methods = Class.forName(className).getDeclaredMethods();
		Field[] fields = Class.forName(className).getDeclaredFields();

//		String mName = this.getClass().getDeclaredMethods();

		System.out.println("this method : " + thisMethodName);

		System.out.println("-------methods-------");
		for (Method method : methods) {
			System.out.println(method.getName());
		} // for
		
		System.out.println("--------fields--------");
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println(this.getClass().getName());
	}
	
	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		ClassReflection cf = new ClassReflection();
		cf.test();
	}
}
