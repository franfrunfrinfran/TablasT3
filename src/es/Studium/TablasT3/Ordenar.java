package es.Studium.TablasT3;

import java.util.Scanner;

public class Ordenar
{

	public static void main(String[] args) 
	{
		
		Scanner teclado=new Scanner(System.in);
		
		
		int tabla[]= new int [10];
		int i, j, aux;
		
		for(i=0;i<=9;i++)
		{
			System.out.println("Dame un número entero");
			tabla[i]= teclado.nextInt();
		}
		
		
		for(i=0;i<9;i++)/*Aquí no es <= porque no es necesario comparar el último númoero consigo mismo*/
		{
			for(j=i+1;j<=9;j++)//Aquí SI es <= porque las operaciones se hacen con todos los números de la lista
			{
				if(tabla[i]<tabla[j])//Si se cambia el signo"<" Te lo ordena o de menor a mayor o de mayorr a menor
				{
					aux=tabla[i];
					tabla[i]=tabla[j];
					tabla[j]=aux;
				}
			}
		}
		System.out.println("La tabla ordenada queda así: ");
		for(i=0;i<=9;i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}

}
