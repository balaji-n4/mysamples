package com.cts.paypal.mysamples.Impl;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone {
	String os() default "symbian";
	String version() default "s40";

}

/*@Smartphone
class NokiaFeaturePhone {
	String model;
	int size;
	public NokiaFeaturePhone(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	

}*/

@Smartphone(version= "7.0", os="android")
class NokiaSmartPhone {
	String model;
	int size;
	public NokiaSmartPhone(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}

}


public class JavaTypeAnnotationsDemo {
	public static void main(String[] args) {
		NokiaSmartPhone nokia6 = new NokiaSmartPhone("nokia6", 5);
		Class c = nokia6.getClass();
		Annotation an = c.getAnnotation(Smartphone.class);
		Smartphone s = (Smartphone) an;
		System.out.println(s.os());
	}
}
