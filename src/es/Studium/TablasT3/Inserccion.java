package es.Studium.TablasT3;

import java.util.Scanner;

public class Inserccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner (System.in);
		
		int tabla[]= new int [10];
		int i, j, aux;
		
		for(i=0;i<=9;i++)
		{
			System.out.println("Dame un n�mero entero");
			tabla[i]= teclado.nextInt();
		}
		
		
		for(i=0;i<=9;i++)
		{
			j=i;
			aux=tabla[i];
			
			while((j>0)&&(aux<tabla[j-1]))
			{
				tabla[j]=tabla[j-1];
				
				j=j-1;
				
			}
			
			tabla[j]=aux;			
		}
		System.out.println("La tabla ordenada queda as�: ");
		for(i=0;i<=9;i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}

}
