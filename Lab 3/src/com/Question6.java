package com;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Question6 {

	public void zonedDateTime (String zone) {
		ZoneId zoneId= ZoneId.of(zone);
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zone1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Kolkata"));
		ZonedDateTime zone2 = zone1.withZoneSameInstant(zoneId);
		System.out.println(zone2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Question6 q6 = new Question6();
		
		System.out.print("Enter Zone: ");
		String zone = sc.next();
		q6.zonedDateTime(zone);
		
	}

}
