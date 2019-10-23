package com.cts.paypal.mysamples.Impl;

import com.cts.paypal.mysamples.MyFunctionalInterface;

public class MyFunctionalInterfaceImpl implements MyFunctionalInterface {

	@Override
	public void print() {
		System.out.println("Implementing functional Interface");

	}
	public static void main(String[] args) {
		MyFunctionalInterfaceImpl myClass = new MyFunctionalInterfaceImpl();
		myClass.print();
	}

}
