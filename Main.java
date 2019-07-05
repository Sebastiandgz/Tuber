package Tuberv2;

import tuber.drivers.*;
import tuber.geolocation.*;
import tuber.types.*;

public class Main {

	public static void main(String[] args) {
		client conductor = new client();
		driver pasajero = new driver();
		conductor.petitorio();
		pasajero.Confirmacion();
		pasajero.Recorrido();
		conductor.Fin();
		
	}
}
