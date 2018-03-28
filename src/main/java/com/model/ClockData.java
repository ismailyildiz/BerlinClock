package com.model;

import java.io.Serializable;

public class ClockData implements Serializable {

	private static final long serialVersionUID = 695110581573881920L;

	private String secondCircle;
	private String firstHourRow;
	private String secondHourRow;
	private String firstMinuteRow;
	private String secondMinuteRow;

	public ClockData() {
		super();
	}

	public String getSecondCircle() {
		return this.secondCircle;
	}

	public void setSecondCircle(String secondCircle) {
		this.secondCircle = secondCircle;
	}

	public String getFirstHourRow() {
		return this.firstHourRow;
	}

	public void setFirstHourRow(String firstHourRow) {
		this.firstHourRow = firstHourRow;
	}

	public String getSecondHourRow() {
		return this.secondHourRow;
	}

	public void setSecondHourRow(String secondHourRow) {
		this.secondHourRow = secondHourRow;
	}

	public String getFirstMinuteRow() {
		return this.firstMinuteRow;
	}

	public void setFirstMinuteRow(String firstMinuteRow) {
		this.firstMinuteRow = firstMinuteRow;
	}

	public String getSecondMinuteRow() {
		return this.secondMinuteRow;
	}

	public void setSecondMinuteRow(String secondMinuteRow) {
		this.secondMinuteRow = secondMinuteRow;
	}

	@Override
	public String toString() {
		return "ClockData [secondCircle=" + this.secondCircle + ", firstHourRow=" + this.firstHourRow
				+ ", secondHourRow=" + this.secondHourRow + ", firstMinuteRow=" + this.firstMinuteRow
				+ ", secondMinuteRow=" + this.secondMinuteRow + "]";
	}

}
