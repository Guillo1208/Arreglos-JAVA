package Punto_Uno;

import java.util.Scanner;

public class PuntoUno {
	
	int arreglo[];	
	
	public void llenar_arreglo() {
		arreglo = new int[5];
		Scanner dato = new Scanner(System.in);
		for (int i=0;i<arreglo.length;i++) {
			System.out.println("Ingresa el valor de la posicion #"+i);
			arreglo[i]=dato.nextInt();
			}
	}
	
	public void recorre_arreglo() {
		for (int i=0;i<arreglo.length;i++) {
			System.out.println("posicio ["+i+"]="+arreglo[i]);
		}
	}

}
