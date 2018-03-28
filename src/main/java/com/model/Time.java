package com.model;

import java.io.Serializable;

/**
 * @author user
 *
 */
public class Time implements Serializable {

	private static final long serialVersionUID = 5317629133956636401L;

	private int hour;
	private int minute;

	public Time() {
		super();
	}

	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}

	public int getHour() {
		return this.hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	@Override
	public String toString() {
		return "Time [hour=" + this.hour + ", minute=" + this.minute + "]";
	}

}
