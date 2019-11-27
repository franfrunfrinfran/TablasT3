package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejercicio15LetraPorPosicionT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		 char tabla[][]= new char [3][3];
		 int resultado[][]= new int [3][3];
		 
		 
		 //LEER POR TECLADO	LA TABLA CON 2 "FOR" LA PRIMERA TABLA
		 System.out.println("Introducir valores de TABLA 1");
	 for(int i=0;i<3;i++)
		 {
		 	for(int j=0;j<3;j++)
		 	{
		 			System.out.println("Dame el carácter de "+i+" el de "+j);
		 			tabla[i][j]=teclado.next().charAt(0);
		 	}
		 }
	 
	 for(int i=0;i<3;i++)
	 {
	 	for(int j=0;j<3;j++)
	 	{
	 			
	 			resultado[i][j]=(tabla[i][j]-96);
	 	}
	 }
	 System.out.println("Matriz introducida");
	 for(int i=0;i<3;i++)
	 {
	 	for(int j=0;j<3;j++)
	 	{
	 		 System.out.print("\t"+tabla[i][j]);
	 			
	 	}
	 	 System.out.println();
	 }
	 
	 System.out.println("Las posiciones son ");
	 for(int i=0;i<3;i++)
	 {
	 	for(int j=0;j<3;j++)
	 	{
	 		 System.out.print("\t"+resultado[i][j]);
	 			
	 	}
	 	 System.out.println();
	 }
 
 teclado.close();
	 

	 
	 
	}

}
