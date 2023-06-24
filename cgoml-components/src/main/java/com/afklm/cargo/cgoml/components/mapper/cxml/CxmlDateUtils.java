package com.afklm.cargo.cgoml.components.mapper.cxml;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class CxmlDateUtils {
	
	private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HHmm");

	/**
	 * get a local date from a xml date
	 */
	public static LocalDate toLocalDate(XMLGregorianCalendar calendar) {		
		XMLGregorianCalendar cloned = (XMLGregorianCalendar) calendar.clone();
		cloned.setTimezone(0);
		Date date = cloned.toGregorianCalendar().getTime();
		Instant instant = date.toInstant();
		OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.UTC);
		return offsetDateTime.toLocalDate();
	}
	
	/**
	 * get a local time from a xml date
	 */
	public static String toLocalTime(XMLGregorianCalendar calendar) {
		XMLGregorianCalendar cloned = (XMLGregorianCalendar) calendar.clone();
		cloned.setTimezone(0);
		Date date = cloned.toGregorianCalendar().getTime();
		Instant instant = date.toInstant();
		OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.UTC);
		return offsetDateTime.toLocalTime().format(timeFormatter);
	}
	
	/**
	 * get a UTC date from a xml date
	 */
	public static Date toUTCDate(XMLGregorianCalendar calendar) {
		XMLGregorianCalendar cloned = (XMLGregorianCalendar) calendar.clone();
		cloned.setTimezone(0);
		return cloned.toGregorianCalendar().getTime();
	}
	
	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) throws DatatypeConfigurationException {
		GregorianCalendar gregory = new GregorianCalendar();
		gregory.setTime(date);

		return DatatypeFactory.newInstance()
		        .newXMLGregorianCalendar(
		            gregory);
	}
}