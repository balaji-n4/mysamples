package com.cts.paypal.mysamples.model;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {

		return s1.name.compareTo(s2.name);

	}

}
