package Clase_Interior;
/*
Autor: Raul Huayllani Diaz - con guias de internet
Fecha: 28 - 06 - 2020
Descripcion: Este codigo es la segunda parte del ejemplo de la creacion
			de una clase interior, en este codigo se crea una instancia 
			de la clase del codigo del primer ejemplo y se accede al 
			metodo que esta dentro.
Licencia: Software Libre.
*/
public class MiClase {
	public static void main(String args []) {
		
		//Creacion de instancias de la clase externa
		ClaseExterna exterior = new ClaseExterna();
		
		// Accediendo al metodo mostrar_interior
		exterior.mostrar_interior();
	}
}
