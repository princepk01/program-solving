package com.org.techmojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a"); 
        String str1 = "2020-03-05 03:16 PM";
        			//2020–03–05 03:16 PM
        			  // 2020–03–01 03:15 PM
        LocalDateTime dateTime1 = LocalDateTime.parse(str1, formatter);
        System.out.println("dateTime1 : "+dateTime1);
        String str2 = "2020-03-01 03:16 PM"; 
                       //2020–03–01 03:16 PM
        LocalDateTime dateTime2 = LocalDateTime.parse(str2, formatter);
        System.out.println("dateTime2 : "+dateTime2);
        long result = ChronoUnit.SECONDS.between(dateTime1, dateTime2);
        System.out.println("result : "+result);
        long avgInSecond = result/2;
        System.out.println("avgInSecond : "+avgInSecond);
        calculateTime(avgInSecond);
        
    }
    public static void calculateTime(long seconds) {
        int day = (int)TimeUnit.SECONDS.toDays(seconds);        
        long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) *60);

        System.out.println("Day : " + day + "\nHour : " + hours + "\nMinute : " + minute + "\nSeconds :" + second);

    }
}
