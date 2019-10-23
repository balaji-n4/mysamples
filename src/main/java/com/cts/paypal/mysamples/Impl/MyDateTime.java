package com.cts.paypal.mysamples.Impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MyDateTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		LocalDate tomorrow = today.plusDays(1);
		System.out.println("today : " + today + " yesterday : " + yesterday + " tomorrow : " + tomorrow);

		LocalTime now = LocalTime.now();
		LocalTime before = now.minusHours(5);
		LocalTime after = now.plusMinutes(33);
		System.out.println("now : " + now + " before : " + before + " after : " + after);

		LocalDateTime presentDatetime = LocalDateTime.now();
		LocalDateTime yesterdayDatetime = presentDatetime.minusDays(1);
		LocalDateTime tomorrowDatetime = presentDatetime.plusDays(1);
		System.out.println("presentDatetime : " + presentDatetime + " yesterdayDatetime : " + yesterdayDatetime
				+ " tomorrowDatetime : " + tomorrowDatetime);
	}

}
