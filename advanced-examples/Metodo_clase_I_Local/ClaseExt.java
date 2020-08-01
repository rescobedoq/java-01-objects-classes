package Metodo_clase_I_Local;
/*
Autor: Raul Huayllani Diaz - con guias de internet
Fecha: 28 - 06 - 2020
Descripcion: Este codigo es el ejemplo de lo que es Metodo de clase 
			interna local, basicamente consiste en crear una clase dentro
			de un metodo.
Licencia: Software Libre.
*/
public class ClaseExt {
	// Metodo de instancia de la clase externa
	void miMetodo() {
		int num = 10;
		
		// Metodo local de la clase interna
		class MetodoInterior {
			public void print() {
				System.out.println("ESTE ES UN METODO DE CLASE"
						+ " INTERNA " +num);
			}
		} // Fin de la clase interna
		
		// Accediendo a la clase interna
		MetodoInterior interior = new MetodoInterior();
		interior.print();
	}
	
	public static void main(String args []) {
		ClaseExt exterior = new ClaseExt();
		exterior.miMetodo();
	}
}
