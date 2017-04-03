package com.fco271292.appcontactlist.util;

public class FileUtil {
	
	File generateFile(){
		String fileName = "Lista_Contactos_${new Date().format("YYYYMMdd")}.txt"
		new File(fileName)
	}
	
}
