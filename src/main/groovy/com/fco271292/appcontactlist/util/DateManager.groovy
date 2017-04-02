package com.fco271292.appcontactlist.util

class DateManager {

	Date convertStringToDate(String dateString){
		Date date = new Date()
		String patternDate =  /\d{2}.\d{2}.\d{4}/
		date = dateString =~ patternDate ? date.parse("dd/MM/yyyy", dateString) : date
	}
	
}
