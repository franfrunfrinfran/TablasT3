package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejercicio18Antisimetrico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[][]= new int [3][3];

		 boolean asimetrica= true;
		 
		 Scanner teclado=new Scanner(System.in);
		 
		//PEDIR AL USUARIO QUE LO MUESTRE POR PANTALLA	
		 
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
					System.out.println("Dame el valor de "+i+" el de "+j);
					tabla[i][j]=teclado.nextInt();
			}
		}
		//RECORREMOS LA TABLA PARA SABER SI ES ASIMÉTRICA
		for(int i=0;(i<3)&&(asimetrica);i++)
		{
			for(int j=0;(j<3)&&(asimetrica);j++) //for(int j=0;(j<3)&&(simetrica);j++) ;para el bucle cuando j llega a 3 Y ES ASIMETRICA	
			{
					if(tabla[i][j]!=-tabla[j][i])
					{
						asimetrica=false;				
					}
			}
		}
		if (asimetrica==false)
		{
			System.out.println("La matriz es simétrica");
		}
		else
		{
			System.out.println("La matriz NO es simétrica");
		}
		teclado.close();
	}

}
