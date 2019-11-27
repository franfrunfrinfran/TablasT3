package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejercicio19SumaFilaYColumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		 
		int tabla [][]= new int [3][3];
		
		int fila1, fila3, colum1, colum2, colum3;
		int fila2 =0;
	
		
		//PEDIR AL USUARIO QUE LO MUESTRE POR PANTALLA	
			for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
							System.out.println("Dame el valor de "+i+" el de "+j);
							tabla[i][j]=teclado.nextInt();
					}
				}
			//CALCULAR SUMAS
			fila1=tabla[0][0]+tabla[0][1]+tabla[0][2];
			
			//ESTA ES OTRA MANERA DE CALCULAR LA FILA, UTILIZANDO LA FUNCIÓN "FOR"
			for(int i=0;i<3;i++)
			{
				fila2= fila2 + tabla[1][i]; //TABLA[la fila que se encuentra]  [es "i" porque es el número que varia]
			}
			
			
			fila3=tabla[2][0]+tabla[2][1]+tabla[2][2];
			
			colum1=tabla[0][0]+tabla[1][0]+tabla[2][0];
			colum2=tabla[0][1]+tabla[1][1]+tabla[2][1];
			colum3=tabla[0][2]+tabla[1][2]+tabla[2][2];
	
			
			System.out.println("La suma de la fila 0 es: "+fila1);
			System.out.println("La suma de la fila 1 es: "+fila2);
			System.out.println("La suma de la fila 2 es: "+fila3);
			
			System.out.println("La suma de la columna 0 es: "+colum1);
			System.out.println("La suma de la columna 1 es: "+colum2);
			System.out.println("La suma de la columna 2 es: "+colum3);
	
			
			teclado.close();
	}

}
