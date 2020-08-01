package Clase_Interna_Anonima;
/*
Autor: Raul Huayllani Diaz - con guias de internet
Fecha: 28 - 06 - 2020
Descripcion: Este codigo es la segunda partde de lo que es una clase 
			interna anonima, en este codigo se accede a la clase abstract
			y dentro se crea un metodo el cual anulara al metodo de la 
			clase del codigo de la primera parte. 
Licencia: Software Libre.
*/
public class ClaseExterior {
	
	public static void main(String args[]) {
		// Accediendo a la clase anonima 
		AnonimoInterior interno = new AnonimoInterior() {
			// Metodo de anulacion
			public void MiMetodo() {
				
				System.out.println("ESTE ES UN EJEMPLO DE UNA CLASE"
						+ " INTERNA ANONIMA");
			}
		};
		// Acceso de la clase anonima
		interno.MiMetodo();	
	}
}
