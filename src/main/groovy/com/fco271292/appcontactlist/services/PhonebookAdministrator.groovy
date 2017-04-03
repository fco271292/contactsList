package com.fco271292.appcontactlist.services

import com.fco271292.appcontactlist.domain.Person
import com.fco271292.appcontactlist.domain.PhoneBook

class PhonebookAdministrator {
	
	def createContact(File file,PhoneBook phoneBook){
		phoneBook.each {item->
			file << item.person.name << "," << item.person.lastName << ","  << item.person.birthDate
			file << item.email << "," 
			file << item.phoneNumbers << "," 
			file << item.address.street << "," << item.address.colony << "," << item.address.country
			file << "\n"
		}
	}
	
	def readContact(File file,String patternToSearch){
		List contentFile = file.readLines()
		def result = contentFile.findAll {line->
			line.startsWith(patternToSearch)
		}
		result
	}
	
	def updateContact(){}
	
	def deleteContact(){}
	
}
