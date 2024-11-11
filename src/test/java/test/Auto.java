package test;

public class Auto {

	//Atributos
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	int registro;
	static int cantidadCreados;
	Motor motor;
	
	//Metodos
	
	int cantidadAsientos() {
		int nAsientos = 0;
		
		for(int m = 0; m < asientos.length; m++) {
			
			if (asientos[m] != null) {
				nAsientos++;
				
			}
		}
		return nAsientos;
	}
	
	String verificarIntegridad() {
	
		if(this.registro == this.motor.registro) {
			
			for(int m = 0; m < this.asientos.length; m++) {
				if(asientos[m] != null) {
					if(asientos[m].registro != this.registro) {
						return "Las piezas no son originales";
						
					}
				}
			}
			return "Aunto original";
		}
		else {
			return "Las piezas no son originales";	
		}
	}
}
