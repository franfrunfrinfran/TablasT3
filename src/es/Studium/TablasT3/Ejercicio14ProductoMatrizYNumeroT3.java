package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejercicio14ProductoMatrizYNumeroT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado=new Scanner(System.in);
		 
		 
		 int tabla[][]= new int [3][3];
		 int resultado[][]= new int [3][3];
		 
		 int producto=1;
		 
		 //LEER POR TECLADO	LA TABLA CON 2 "FOR" LA PRIMERA TABLA
		 System.out.println("Introducir valores de TABLA 1");
	 for(int i=0;i<3;i++)
		 {
		 	for(int j=0;j<3;j++)
		 	{
		 			System.out.println("Dame el valor de "+i+" el de "+j);
		 			tabla[i][j]=teclado.nextInt();
		 	}
		 }
	 
	 System.out.println("Dame el valor de producto"+producto);
		producto=teclado.nextInt();
	 
	 
	 for(int i=0;i<3;i++)
	 {
	 	for(int j=0;j<3;j++)
	 	{
	 		 resultado[i][j]=producto*tabla[i][j];
	 	}
	 }
	 
	 
	 for(int i=0;i<3;i++)
	 {
	 	for(int j=0;j<3;j++)
	 	{
	 		System.out.print("\t"+resultado[i][j]);//El print es para que te ponga el resultado en linea
	 	}
	 	System.out.println();//El println te salta de lína cada vez que de una vuelta (En total son 3 líneas de 3 números cada uno)
	 }	
	 
	 
	 teclado.close();
	}

}
