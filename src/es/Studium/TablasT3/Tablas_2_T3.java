package es.Studium.TablasT3;

import java.util.Scanner;

public class Tablas_2_T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[] = new int[10];
		int i;
		Scanner teclado = new Scanner(System.in);
		
		// Recorrido para rellenar la tabla
		
		for(i=0;i<10;i++)
		{
		System.out.println("Ingrese el valor de la posición: "+i);
		tabla[i] = teclado.nextInt();
		}
		 // Recorrido para tratar los elementos de la tabla
		
		for(i=0;i<10;i++)
		{
		tabla[i] = tabla[i]*2;
		}
		// Recorrido para mostrar los valores de la tabla
		
		for(i=0;i<10;i++)
		{
		System.out.println("Tabla["+i+"]="+tabla[i]);
		}
		teclado.close();
		}

	}


