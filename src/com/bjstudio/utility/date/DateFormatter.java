package com.bjstudio.utility.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * 
 * 
 * @author bwoo
 *
 */
public class DateFormatter {
	private static final Logger logger = Logger.getLogger(DateFormatter.class.getName());
		
	private final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
	
	private SimpleDateFormat dateFormat;

	public DateFormatter() {
		super();
		this.dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		this.dateFormat.setLenient(false);
	}
	
	public DateFormatter(String pattern) {
		super();
		this.dateFormat = new SimpleDateFormat(pattern);
		this.dateFormat.setLenient(false);
	}
	
	public DateFormatter(String pattern, Locale locale) {
		super();
		this.dateFormat = new SimpleDateFormat(pattern, locale);
		this.dateFormat.setLenient(false);
	}

	public String dateToString(Date date) {
		String s_date = this.getDateFormat().format(date);
		return s_date;
	}
	
	public String dateToString(java.sql.Date date) {
		String s_date = this.getDateFormat().format(date);
		return s_date;
	}
	
	public Date stringToDate(String date) throws ParseException {
		return this.getDateFormat().parse(date);
	}
	
	public java.sql.Date stringToSQLDate(String date) throws ParseException {
		return (java.sql.Date) this.getDateFormat().parse(date);
	}
	
	public Boolean validateDate(String date) {
		Boolean result = Boolean.FALSE;
		
		try {
			this.getDateFormat().parse(date);
			result = Boolean.TRUE;
		} catch (Exception e) {
			logger.info("Date is wrong - format: "+this.getDateFormat().toPattern() + ", input Date: "+date);
		}		
		return result;
	}

	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(SimpleDateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}
	
	public void setLenientOfDateFormat(boolean value) {
		this.getDateFormat().setLenient(value);		
	}
}
