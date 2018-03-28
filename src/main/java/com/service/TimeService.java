package com.service;

import org.springframework.stereotype.Service;

import com.model.Time;

@Service
public class TimeService {

	public Time getTimeFromUtc(String utcDate) {

		String time = utcDate.substring(utcDate.indexOf("T") + 1, utcDate.lastIndexOf(":"));

		int breakIndex = time.indexOf(":");

		Time hourMin = new Time(Integer.parseInt(time.substring(0, breakIndex)),
				Integer.parseInt(time.substring(breakIndex + 1, time.length())));

		return hourMin;
	}

}
