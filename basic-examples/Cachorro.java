package OBJETOS;
/*
Autor: Raul Huayllani Diaz
Fecha: 28 - 06 - 2020
Descripcion: Este codigo es el ejemplo de la creacion de un Objeto, 
			se crea una clase cachorro y un constructor con un parametro
			de tipo String llamado nombre, y se imprimira lo que hay dentro.
			Ahora en el metodo principal main se crea un objeto llamado
			mi cachorro.
Licencia: Software Libre.
*/
public class Cachorro {
	// Constructor con un parametro llamado nombre
	public Cachorro(String nombre) {
		System.out.println("Su nombre es: "+ nombre);
	}
	
	public static void main(String args []) {
		// creacion del objeto llamado miCachorro
		Cachorro miCachorro = new Cachorro ("CHOCOLO");
	}
}
