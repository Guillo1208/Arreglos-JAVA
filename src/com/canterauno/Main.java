package com.canterauno;

import java.util.InputMismatchException;
import java.util.Scanner;

import Punto_Cuatro.PuntoCuatro;
import Punto_Dos.PuntoDos;
import Punto_Quinto.PuntoQuinto;
import Punto_Tres.PuntoTres;
import Punto_Uno.PuntoUno;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opc;
		PuntoUno arreglos = new PuntoUno();
		PuntoDos arreglos2 = new PuntoDos();
		PuntoTres arreglo3= new PuntoTres();
		PuntoCuatro arreglo4 = new PuntoCuatro();
		PuntoQuinto arreglo5 = new PuntoQuinto();
		while (!salir) {
			System.out.println("======================================");
			System.out.println("TALLER DE ARREGLOS");
			System.out.println("======================================");
			System.out.println("1. Llenar Arreglo");
			System.out.println("2. Mostrar Pares e Impares");
			System.out.println("3. Mostrar Numeros Primos");
			System.out.println("4. Arreglo Invertido");
			System.out.println("5. Tablas de Multiplicar");
			System.out.println("6. SALIR");
			System.out.println("======================================");
			try {
				System.out.println("SELECCIONA UNA OPCION");
				opc = sn.nextInt();
				
				switch (opc) {
				case 1: 
					arreglos.llenar_arreglo();
					arreglos.recorre_arreglo();
					break;
				
				case 2:
					arreglos2.llenar_arreglo();
					arreglos2.pares();
					arreglos2.impares();
					break;
					
				case 3:
					arreglo3.llenar_arreglo();
					arreglo3.primos();
					break;
					
				case 4:
					arreglo4.llenar_arreglo();
					arreglo4.Mostrar();
					arreglo4.inversa();
					break;
					
				case 5:
					int ciclo=0;
					int fil;int col;
					arreglo5.llenar();
					arreglo5.Mostrar();
					do {
						arreglo5.llenar_multiplicacion();
						System.out.println("Ingrese la posicion que desea consultar ");
						System.out.print("ingresa el numero de la FILA: ");
						fil=sn.nextInt();
						System.out.print("ingresa el numero de la COLUMNA : ");
						col=sn.nextInt();
						if(fil<=9 && col<=9) {
						arreglo5.Buscar(fil, col);
						ciclo++;
						}else {
							System.out.print("La posicion ingresada no es permitida, vuleve a intentarlo");
							ciclo=0;
						}
					} while (ciclo==0);
					
					break;
					
				case 6:
					System.out.println("salida exitosa");
					salir=true;
					break;
					
				default:
					System.out.println("solo numeros entre 1 y 6");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("debes insertar un numero");
				sn.next();
			}
			
		}
		System.exit(0);

	}

}
