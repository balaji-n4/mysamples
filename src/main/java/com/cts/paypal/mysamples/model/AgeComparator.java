package com.cts.paypal.mysamples.model;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;

	}

}
