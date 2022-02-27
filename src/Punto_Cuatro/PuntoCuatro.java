package Punto_Cuatro;

public class PuntoCuatro {

String matriz [][]= new String [4][5];	
	
	public void llenar_arreglo() {
		matriz[0][0]= "01";
		matriz[0][1]= "02";
		matriz[0][2]= "03";
		matriz[0][3]= "04";
		matriz[0][4]= "05";
		matriz[1][0]= "06";
		matriz[1][1]= "07";
		matriz[1][2]= "08";
		matriz[1][3]= "09";
		matriz[1][4]= "10";
		matriz[2][0]= "11";
		matriz[2][1]= "12";
		matriz[2][2]= "13";
		matriz[2][3]= "14";
		matriz[2][4]= "15";
		matriz[3][0]= "16";
		matriz[3][1]= "17";
		matriz[3][2]= "18";
		matriz[3][3]= "19";
		matriz[3][4]= "20";
	}
	
	public void Mostrar() {
		System.out.println("****** LA MATRIZ QUEDA DE LA SIGUIENTE MANERA ******");
		for(int fila=0;fila<4;fila++) {
			for (int columna=0;columna<5;columna++) {
				System.out.print(matriz[fila][columna]+"  ");
			}
			System.out.println(" ");
		}
	}
	
	public void inversa() {
		System.out.println("****** LA MATRIZ INVERSA QUEDA DE LA SIGUIENTE MANERA ******");
		for(int fila=0;fila<4;fila++) {
			if (fila==0) {
				for (int columna=0;columna<5;columna++) {
					System.out.print(matriz[fila][columna]+"  ");
				}
			System.out.println(" ");
			}
			
			if (fila==1) {
				int columna=4;
				for (int x=0 ; x<5; x++) {
					System.out.print(matriz[fila][columna]+"  ");
					columna=columna-1;
				}
				System.out.println(" ");
			}
			
			if (fila==2) {
				int columna=4;
				for (int x=0 ; x<5; x++) {
					System.out.print(matriz[fila][columna]+"  ");
					columna=columna-1;
				}
				System.out.println(" ");
			}
			
			if (fila==3) {
				int columna=4;
				for (int x=0 ; x<5; x++) {
					System.out.print(matriz[fila][columna]+"  ");
					columna=columna-1;
				}
				System.out.println(" ");
			}
			
		}
		
	}
	
}
