package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejerecicio8_PosMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado=new Scanner(System.in);
			 
			
		int maximo;
		int tabla[]=new int[10];
		int posicion;
	
	//Recorrido de la tabla
	
	for(int i=0;i<10;i++)
	{
		tabla[i]=0;
	}
	for(int i=0;i<10;i++)
	{
		System.out.println("Indique el valor de las tablas " +i);
		tabla[i]=teclado.nextInt();
		
	}
	maximo=tabla[0];

	
	for(int i=0;i<10;i++)
	{
		if(tabla[i]>maximo)
		{
			maximo=tabla[i];
			
		}
			}
	
	System.out.println("El número máximo es :"+maximo);
	
	for(int i=0;i<10;i++)
	{
		if(tabla[i]==maximo)
		{
			System.out.println("En la tabla :"+i);
		}
	}
	teclado.close();
	
	}
}
