package Ejemplos_de_Clases_Objetos;
/*
Autor: Raul Huayllani Diaz 
Fecha: 28 - 06 - 2020
Descripcion: Este codigo es el ejemplo de la creacion de un Objeto con varios
			atributos, se crea una clase llamada Auto, luego se pone 
			las variables de instancia o los atributos, se crea un metodo 
			de tipo String llamado informacion el cual imprimira lo que hay
			dentro, en el metodo main se crea una objeto llamado auto1
			y se accede a los atributos de la clase.
Licencia: Software Libre.
*/
public class Auto {
	// Variables de instancia
	String marca;
	String color;
	int km;
	
	// Metodo 1
	public String Informacion() {
		return ("Es de marca: "+marca + "\nEs de color: "+color
				+ "\nSu kilometraje es: "+km+" km");
	}

	// Metodo principal main
	public static void main(String args []) {
		
		// Objeto 1
		Auto auto1 = new Auto();
		
		auto1.marca = "Toyota";
		auto1.color = "Rojo";
		auto1.km = 10000;
		
		System.out.print(auto1.Informacion());
		
	}
}
