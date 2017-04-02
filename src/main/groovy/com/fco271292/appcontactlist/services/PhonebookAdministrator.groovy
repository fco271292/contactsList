package com.fco271292.appcontactlist.services

import com.fco271292.appcontactlist.domain.PhoneBook

class PhonebookAdministrator {
	
	def createContact(File file,PhoneBook phoneBook){
		phoneBook.each {item->
			file << item.person.name << "," << item.person.lastName << ","  << item.person.birthDate
			file << item.email
			file << item.phoneNumbers
			file << item.address.street << "," << item.address.colony << "," << item.address.country
			file << "\n"
		}
	}
	
	def readContact(){}
	
	def updateContact(){}
	
	def deleteContact(){}
	
}
