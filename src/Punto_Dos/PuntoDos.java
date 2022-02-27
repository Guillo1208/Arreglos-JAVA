package Punto_Dos;

import java.util.Scanner;

public class PuntoDos {
int arreglo[];	
	
	public void llenar_arreglo() {
		arreglo = new int[20];
		for (int i=0;i<arreglo.length;i++) {
			arreglo[i]=(int)(Math.random()*20+1);
			System.out.println("El valor de la posicion #"+i+" es : "+arreglo[i]);
			}
		}
	
	public void pares() {
		int cc=0;
		String coma=" ";
		System.out.print("Los Numero Pares son : ");
		for (int i=0;i<arreglo.length;i++) {
			if(cc>0) {coma=", ";}
			if(arreglo[i]%2 == 0) {		
			System.out.print(coma+arreglo[i]);
			cc++;
			}
		}
		System.out.println(" ");
	}
	
	public void impares() {
		int cc = 0;
		String coma=" ";
		System.out.print("Los Numero impares son : ");
		for (int i=0;i<arreglo.length;i++) {
			if(cc > 0) {coma=", ";}
			if(arreglo[i]%2 != 0) {		
			System.out.print(coma+ arreglo[i]);
			cc++;
			}
		}
		System.out.println(" ");
	}
	
	
	
}
