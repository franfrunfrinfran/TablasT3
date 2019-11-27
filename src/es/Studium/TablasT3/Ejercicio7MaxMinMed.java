package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejercicio7MaxMinMed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);

		int suma=0;
		int maximo;
		int minimo;
		int tabla[] = new int[10];
		

		// Recorrido para rellenar la tabla
		
		for(int i=0;i<10;i++) 
		{
			tabla[i]=0;
		}
		//Ingresar los valores de la tabla
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Indique el valor de las tablas");
			tabla[i]=teclado.nextInt();
			
		}
		maximo=tabla[0];
		
		minimo=tabla[0];
		for(int i=0;i<10;i++)
		{
				suma=suma+tabla[i];
				
				
				if(tabla[i]>maximo)
				{
					maximo=tabla[i];
				}
				if(tabla[i]<minimo)
				{
					minimo=tabla[i];
				}
		}
		
		System.out.println("La media de toda la tabla es : "+((float)suma/(float)10));
		System.out.println("El máximo de toda la tabla es : "+maximo);
		System.out.println("El mínimo de toda la tabla es : "+minimo);
		teclado.close();
	}

}
