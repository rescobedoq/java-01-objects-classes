package Clase_Interior;
/*
Autor: Raul Huayllani Diaz - con guias de internet
Fecha: 28 - 06 - 2020
Descripcion: Este código es la primera parte de un ejemplo de lo que es
			una clase Interior, donde vemos que se crea una clase anidada
			de tipo privado.
Licencia: Software Libre.
*/
public class ClaseExterna {
	int num;
	
	// Clase interior
	private class ClaseInterna{
		public void print() {
			System.out.println("ESTA ES UNA CLASE INTERNA");
		}
	}
	
	// Accediendo a la clase interior desde el metodo dentro 
	void mostrar_interior() {
		ClaseInterna interior = new ClaseInterna();
		interior.print();
	}
}
