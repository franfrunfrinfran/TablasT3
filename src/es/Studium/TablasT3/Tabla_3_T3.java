package es.Studium.TablasT3;

import java.util.Scanner;

public class Tabla_3_T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabla[][] = new int[5][5];
		int i,j;
		Scanner teclado = new Scanner(System.in);
		
		// Recorrido para rellenar la tabla
		for(i=0;i<5;i++)
		{
		for(j=0;j<5;j++)
		{
		System.out.println("Ingrese el valor de la posición:("+i+","+j+")");
		tabla[i][j] = teclado.nextInt();
		}
		}
		// Recorrido para mostrar los valores de la tabla
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
			System.out.println("Tabla["+i+"]["+j+"]="+tabla[i][j]);
			}
		}
		teclado.close();
		}

	}


