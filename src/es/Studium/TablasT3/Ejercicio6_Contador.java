package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejercicio6_Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
		
	
		int tabla[] = new int[2];
		int numero;
		
	
		
		// Recorrido para rellenar la tabla
		
		for(int i=0;i<2;i++) 
		{
			tabla[i]=0;
			
		}
		//Formulas que se añaden a la tabla
		do {
				System.out.println("Indique un número");
				numero=teclado.nextInt();
				if(numero>0)
				{
					tabla[0]=tabla[0]+1;
				}
				if(numero<0)
				{
					tabla[1]=tabla[1]+1;
				}}
				while(numero!=0);
		// Recorrido para mostrar los valores de la tabla
		
				System.out.println("el numero de los valores positivos es: "+tabla[0]);
				System.out.println("el numero de los valores negativos es: "+tabla[1]);
				teclado.close();

	}

	}
