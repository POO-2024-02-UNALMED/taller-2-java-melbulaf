package test;

public class Asiento {

	//Atributos
	String color;
	int precio;
	public int registro;
	
	//Metodos
	
	void cambiarColor(String color) {
		if (color == "rojo" || color == "verde" || color == "amarillo" || color == "negro" || color == "blanco"){
			
			this.color = color;
		}
	}
}
