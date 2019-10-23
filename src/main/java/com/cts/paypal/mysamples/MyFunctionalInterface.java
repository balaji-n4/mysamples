package com.cts.paypal.mysamples;

@FunctionalInterface
public interface MyFunctionalInterface {
	//only one method should be present as we are annotating with functionalInterface
	public void print();
	@Override
	public String toString();
	
	@Override
	public boolean equals(Object obj);
}
