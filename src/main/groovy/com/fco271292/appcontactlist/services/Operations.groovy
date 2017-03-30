package com.fco271292.appcontactlist.services

class Operations {

	void showOptions(){
		Scanner scanner = new Scanner(System.in)
		String option = ""
		String menu = '''Agenda de contactos \nSelecciona una opcion:
			1. Alta
			2. Buscar
			3. Actualizar
			4. Eliminar
			0. Salir
		'''
		println menu
		option = scanner.nextLine()
		println option

	}

}