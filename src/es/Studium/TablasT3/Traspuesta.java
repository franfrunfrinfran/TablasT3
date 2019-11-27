package es.Studium.TablasT3;

import java.util.Scanner;

public class Traspuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner teclado=new Scanner(System.in);

		 int tabla[][]= new int [3][3];
		 
		 int traspuesta[][]= new int [3][3];
		 
		 //LEER POR TECLADO	LA TABLA CON 2 FOR
	 for(int i=0;i<3;i++)
		 {
		 	for(int j=0;j<3;j++)
		 	{
		 			System.out.println("Dame el valor de "+i+" el de "+j);
		 			tabla[i][j]=teclado.nextInt();
		 	}
		 }	
	 	 
	 //ASIGNAR LOS CALORES DE "I" Y "J" A "J" Y A "I"
	 for(int i=0;i<3;i++)
	 {
	 	for(int j=0;j<3;j++)
	 	{
	 			traspuesta[j][i]=tabla[i][j];
	 	}
	 }	
	 
	 
	 
	 for(int i=0;i<3;i++)
	 {
		 
		 //ESTE ES EL BUCLE QUE RECORRE LAS FILAS
	 	for(int j=0;j<3;j++)
	 	{
	 		 	System.out.print(traspuesta[i][j]+" ");
	 	}
	 	System.out.println();//ESTO HACE QUE CADA RECORRIDO (TRES NÚMEROS ) PONGA UNA LINEA NUEVA
	 }	
	 	 
	 teclado.close();
	}

}
