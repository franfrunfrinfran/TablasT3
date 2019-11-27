package es.Studium.TablasT3;

import java.util.Random;
import java.util.Scanner;

public class Dicotomia 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		int tabla[]= new int [100];
		int inferior, superior, central, encontrado, elemento_buscado;
		
		Random aleatorio = new Random();
		
		for(int i=0;i<100;i++)
		{
			System.out.println("Dame un número entero");
			tabla[i]=aleatorio.nextInt();
			
			
		}
		
		System.out.println("¿Qué elemento quieres buscar?");
		elemento_buscado=teclado.nextInt();
		
		encontrado=-1;
		inferior=0;
		superior=10-1;
		
		while(inferior<=superior)
		{
			central=(inferior+superior)/2;
			
			if(tabla[central]==elemento_buscado)
			{
				encontrado=central;
				inferior=superior+1;
				
				else
				{
					
				}
			}
		}
	}

}
