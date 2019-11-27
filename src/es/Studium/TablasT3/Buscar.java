package es.Studium.TablasT3;

import java.util.Random;
import java.util.Scanner;

public class Buscar 
{

	public static void main(String[] args) 
	{
		Scanner teclado=new Scanner(System.in);

		// TODO Auto-generated method stub
		int tabla[]=new int [100];
		int numero;
		int i;
		boolean encontrado=false;
		Random aleatorio = new Random();
		for(i=0;i<100;i++) 
		{

			tabla[i]=aleatorio.nextInt(100)+1;
		}

		for(i=0;i<100;i++) 
		{

			System.out.println(tabla[i]);
		}
		System.out.println("¿Qué número quieres buscar?");
		numero=teclado.nextInt();

		for(i=0;i<100;i++) 
		{
			if(numero==tabla[i])
			{
				System.out.println("El número está en la posición "+i);
				encontrado=true;
			}
			
		}
		if(!encontrado)//**El IF está fuera de "for" porque no necesita realizar otra vuelta ,ya que ha recorrido con anterioridad para el boolean true.
		{
			System.out.println("El número NO está ");
			
		}
		teclado.close();
	}
}
