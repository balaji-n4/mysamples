package com.cts.paypal.mysamples;

public interface MyDefaultInterface {
	default public void print() {
		System.out.println(" Printing default implementstion");
	}
}
