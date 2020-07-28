package com.javateam.jse;

public class DemoInterfaceImpl implements DemoInterface {

	@Override
	public void order() throws NullPointerException, Exception {
//	public void order() {// throws NullPointerException, Exception {
		try {

		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
