package com.fco271292.appcontactlist.services

class Operations {

	void showOptions(){
		Scanner scanner = new Scanner(System.in)
		String option = ""
		String menu = '''Agenda de contactos \nSelecciona una opcion: \n1. Alta \t2. Buscar \t3. Actualizar \t4. Eliminar \t0. Salir\n'''
		println menu
		option = scanner.nextLine()
		println option

	}

}