package com.ms.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Timezone {
	private static final String DATE_FORMAT = "dd-LLL-yyyy hh:mm a";
	public String doEurope(String n1) {
		LocalDateTime ldt = LocalDateTime.parse(n1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
		ZonedDateTime indiaZonedDateTime = ldt.atZone(indiaZoneId);
		ZoneId eastusaZoneId = ZoneId.of("Europe/Luxembourg");
		ZonedDateTime euDateTime = indiaZonedDateTime.withZoneSameInstant(eastusaZoneId);
		DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
		String formattedString = euDateTime.format(format);
		return formattedString;
	}
	
	public String doIndia(String n1) {
		LocalDateTime ldt = LocalDateTime.parse(n1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
		ZonedDateTime indiaZonedDateTime = ldt.atZone(indiaZoneId);
		DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
		String formattedString = indiaZonedDateTime.format(format);
		return formattedString;
	}

	public String doAus(String n1) {
		LocalDateTime ldt = LocalDateTime.parse(n1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
		ZonedDateTime indiaZonedDateTime = ldt.atZone(indiaZoneId);
		ZoneId eastusaZoneId = ZoneId.of("Australia/Lord_Howe");
		ZonedDateTime euDateTime = indiaZonedDateTime.withZoneSameInstant(eastusaZoneId);
		DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
		String formattedString = euDateTime.format(format);
		return formattedString;
	}

	public String doEast(String n1) {
		LocalDateTime ldt = LocalDateTime.parse(n1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
		ZonedDateTime indiaZonedDateTime = ldt.atZone(indiaZoneId);
		ZoneId eastusaZoneId = ZoneId.of("US/Eastern");
		ZonedDateTime euDateTime = indiaZonedDateTime.withZoneSameInstant(eastusaZoneId);
		DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
		String formattedString = euDateTime.format(format);
		return formattedString;
	}
	
	public String doCentral(String n1) {
		LocalDateTime ldt = LocalDateTime.parse(n1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
		ZonedDateTime indiaZonedDateTime = ldt.atZone(indiaZoneId);
		ZoneId eastusaZoneId = ZoneId.of("US/Central");
		ZonedDateTime euDateTime = indiaZonedDateTime.withZoneSameInstant(eastusaZoneId);
		DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
		String formattedString = euDateTime.format(format);
		return formattedString;
	}
	
	public String doWest(String n1) {
		LocalDateTime ldt = LocalDateTime.parse(n1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
		ZonedDateTime indiaZonedDateTime = ldt.atZone(indiaZoneId);
		ZoneId eastusaZoneId = ZoneId.of("America/Noronha");
		ZonedDateTime euDateTime = indiaZonedDateTime.withZoneSameInstant(eastusaZoneId);
		DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
		String formattedString = euDateTime.format(format);
		return formattedString;
	}

}
