package com.fco271292.appcontactlist.services

import com.fco271292.appcontactlist.domain.PhoneBook
import com.fco271292.appcontactlist.util.DateManager
import com.fco271292.appcontactlist.util.FileManager

import groovy.text.markup.AutoNewLineTransformer

class Operations {
	
	Scanner scanner = new Scanner(System.in)
	PhonebookAdministrator phoneBookAdministrator = new PhonebookAdministrator()
	PhoneBook phoneBook = new PhoneBook()
	FileManager fileManager = new FileManager()
	File file = fileManager.generateFile()
	
	void showOptions(){
		
		String option = ""
		while(option != "0"){
			String menu = '''Agenda de contactos \nSelecciona una opcion: \n1. Alta \t2. Buscar \t3. Actualizar \t4. Eliminar \t0. Salir\n'''
			println menu
			option = scanner.nextLine()
			manageCRUD(option)
		}

	}
	
	def manageCRUD(String option){
		switch(option){
			case "0":
				println "Cerrando..."
			break;
			case "1":
				PhoneBook phoneBook = captureForm()
				phoneBookAdministrator.createContact(file, phoneBook)
			break;
			default:
				println "Opcion invalida!"
			break;
		}
	}
	
	PhoneBook captureForm(){
		
		PhoneBook phoneBook = new PhoneBook()
		DateManager dateManager = new DateManager()
		
		String message = "\tAlta de contacto"
		println message
		println "Ingresa nombre"
		phoneBook.person.name = scanner.nextLine()
		println "Ingresa apellido"
		phoneBook.person.lastName = scanner.nextLine()
		
		println "Ingresa fecha de nacimiento dd/MM/yyyy"
		String birtDateInput = scanner.nextLine()
		phoneBook.person.birthDate = dateManager.convertStringToDate(birtDateInput)
		
		println "Ingresa email"
		phoneBook.email = scanner.nextLine()
		println "Ingresa numero telefonico"
		phoneBook.phoneNumbers << scanner.nextLine()
		println "Ingresa calle"
		phoneBook.address.street = scanner.nextLine()
		println "Ingresa colonia"
		phoneBook.address.colony = scanner.nextLine()
		println "Ingresa pais"
		phoneBook.address.country = scanner.nextLine()
		
		phoneBook
		
	}

}