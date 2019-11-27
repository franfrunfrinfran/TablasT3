package es.Studium.TablasT3;

import java.util.Scanner;

public class Ejercicio11Simetrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int tabla[][]= new int [3][3];

 boolean simetrica= true;
 
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
//RECORREMOS LA TABLA PARA SABER SI ES SIMÉTRICA
for(int i=0;(i<3)&&(simetrica);i++)
{
	for(int j=0;(j<3)&&(simetrica);j++) //for(int j=0;(j<3)&&(simetrica);j++) ;para el bucle cuando j llega a 3 Y ES SIMETRICA	
	{
			if(tabla[i][j]!=tabla[j][i])
			{
				simetrica=false;				
			}
	}
}
if (simetrica==false)
{
	System.out.println("La matriz no es simétrica");
}
else
{
	System.out.println("La matriz es simétrica");
}
teclado.close();
	}

}
