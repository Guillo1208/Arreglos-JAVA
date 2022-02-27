package Punto_Tres;

public class PuntoTres {

int arreglo[];	
	
	public void llenar_arreglo() {
		int num=1;
		arreglo = new int[1000];
		for (int i=0;i<arreglo.length;i++) {
			arreglo[i]=num;
			num++;
			System.out.println("El valor de la posicion #"+i+" es : "+arreglo[i]);
			}
		}
	
	public void primos() {
		System.out.println("********LOS NUMEROS PRIMOS ENTRE 1 Y 1000 SON ********");
		
		for (int j=2;j<arreglo.length;j++) {
			int divisor=2;
			while (arreglo[j]%divisor!=0) {
				divisor++;
			}
			if(divisor==arreglo[j]) {
				System.out.print(arreglo[j]+",");
			}
		}
		System.out.println(" ");
	}
	
	
	
}
