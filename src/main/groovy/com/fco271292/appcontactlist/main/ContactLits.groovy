package com.fco271292.appcontactlist.main

import com.fco271292.appcontactlist.services.*
import com.fco271292.appcontactlist.util.FileManager

class ContactLits {

	static main(args) {
		Operations operations = new Operations()
		operations.showOptions()
		FileManager fileManager = new FileManager()
		File file = fileManager.generateFile()
	}

}