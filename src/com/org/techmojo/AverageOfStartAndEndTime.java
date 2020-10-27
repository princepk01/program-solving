package com.org.techmojo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Transaction {
	private Date startTime;
	private Date endTime;
	private int transactionId;

	public Transaction(Date startTime, Date endTime, int transactionId) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.transactionId = transactionId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

}

public class AverageOfStartAndEndTime {

	public static void main(String[] args) throws ParseException {
		/*
		 * SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy HH:mm:ss a");
		 * 
		 * String dateInString = "22-01-2015 10:15:55 AM"; Date date =
		 * formatter.parse(dateInString); System.out.println("data : "+date); String
		 * formattedDateString = formatter.format(date);
		 * System.out.println("formattedDateString : "+formattedDateString);
		 */
		
		String input = "23/12/2014 10:22:12 PM";
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
		DateFormat outputFormat = new SimpleDateFormat("MM-dd-yyy HH:mm:ss");
		Date date = df.parse(input);
		System.out.println("Date : "+date);
		String outputDate = outputFormat.format(date);
		System.out.println("output :"+outputDate);
		DateFormat twentyFourHoursFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		Date twentyFour = twentyFourHoursFormat.parse(outputDate);
		System.out.println("twenty hours format : "+twentyFour);
		
	}

}
