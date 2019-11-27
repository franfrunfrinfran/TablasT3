package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejercicio9_2Dimensiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char tabla[][]=new char[3][4];
		
		
		Scanner teclado=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("Dame el valor del carácter de la posición "+i+", "+j);
				tabla[i][j]=teclado.nextLine().charAt(0);
			}
		}
		teclado.close();
		
	}

}
