package Tuberv2;


import javax.swing.JOptionPane;

	public class driver {
		String auto;
		int asientos;
		int recorrido = 0;
		int rating;
		boolean aceptar;
		boolean turno;
		
			public boolean Confirmacion() {
				int a = 0;
				int b = 1;
				while (b == 1) {
					a = (int) (Math.random() / 2);
					if ( a == 1) {
						JOptionPane.showConfirmDialog(null, "Viaje encontrado, ¿desea aceptar?");
						b = b++ ;
						
					} else {
						JOptionPane.showConfirmDialog(null,"Haz aceptado el viaje, Proseguimos a recoger al cliente.");
						b = 0;
					}
				}
				return true;
			}
		
	public boolean Recorrido() {
		for (int recorrido = 0; recorrido <= 5000; recorrido = recorrido + 50) {
			System.out.println(recorrido);
			
			if (recorrido == 5000) {
				System.out.println("El pasajero ha llegado a su destino.");
			}
		}
		return false;
	}
			
			
	}