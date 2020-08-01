package Clase_anidada_estatica;
/*
Autor: Raul Huayllani Diaz - con guias de internet
Fecha: 28 - 06 - 2020
Descripcion: Este codigo es el ejemplo de lo que es una Clase anidada 
			estatica, en este codigo se creo una clase estatica y un metodo
			dentro de esa clase el cual es accedido desde el metodo principal
			main que esta en la clase externa.
Licencia: Software Libre.
*/
public class Externo {
	// Creacion de la clase estatica
	static class Anidado{
		// Metodo dentro de la clase estatica
		public void miMetodo() {
			System.out.println("ESTA ES MI CLASE ANIDADA");
		}
	}
	public static void main(String args []) {
		// Acceso a la clase estatica
		Externo.Anidado anid = new Externo.Anidado();
		anid.miMetodo();
	}
}
