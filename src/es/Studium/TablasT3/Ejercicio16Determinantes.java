package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejercicio16Determinantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		 
		int tabla [][]= new int [3][3];
		
		int determinante;
		
	//INTRODUCIR VALORES DE LA TABLA
	 for(int i=0;i<3;i++)
		 {
		 	for(int j=0;j<3;j++)
		 	{
		 			System.out.println("Dame el carácter de "+i+" el de "+j);
		 			tabla[i][j]=teclado.nextInt();
		 	}
		 }
	 
	 			determinante=tabla[0][0]*tabla[1][1]*tabla[2][2] + tabla[2][0]*tabla[0][1]*tabla[1][2] + tabla[1][2]*tabla[1][0]*tabla[0][2];
	 			
	 			determinante= determinante - tabla[2][0]*tabla[1][1]*tabla[0][2]-tabla[0][0]*tabla[2][1]*tabla[1][2] - tabla[1][0]*tabla[0][1]*tabla[2][2];
	 			
	 
	 			System.out.println("El resultado es: "+determinante);
		 
teclado.close();

	}

}
