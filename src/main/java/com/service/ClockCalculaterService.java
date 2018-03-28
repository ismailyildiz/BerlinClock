package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.ClockData;
import com.model.Time;

@Service
public class ClockCalculaterService {

	@Autowired
	private TimeService timeService;

	public ClockData calculate(String utcDate) {

		Time clockTime = this.timeService.getTimeFromUtc(utcDate);

		ClockData clockData = new ClockData();

		clockData.setSecondCircle("Y");
		clockData.setFirstHourRow(this.rowStringGenerater(clockTime.getHour() / 5, "R"));
		clockData.setSecondHourRow(this.rowStringGenerater(clockTime.getHour() % 5, "R"));
		clockData.setFirstMinuteRow(this.rowStringGenerater(clockTime.getMinute() / 5, "Y"));
		clockData.setSecondMinuteRow(this.rowStringGenerater(clockTime.getMinute() % 5, "Y"));

		int qrt = (clockTime.getMinute() / 15);

		clockData.setFirstMinuteRow(clockData.getFirstMinuteRow()
				.replace(clockData.getFirstMinuteRow().substring(0, qrt * 3), this.minuteQuarter(qrt)));

		return clockData;
	}

	public String rowStringGenerater(int count, String color) {

		String rowStr = "";

		for (int i = 1; i <= count; i++) {
			rowStr = rowStr + color;
		}

		return rowStr;

	}

	public String minuteQuarter(int count) {

		String str = "";

		for (int i = 1; i <= count; i++) {
			str = str + "YYR";
		}

		return str;

	}

}
