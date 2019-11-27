package es.Studium.TablasT3;

import java.util.Scanner;
import java.util.Vector;

public class Suma2T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
				
		 Vector<Integer> tabla =new Vector<Integer>();
		 int numero;
		
		 
		 //Rellenar el vector llamado tabla
		 do
		 {
			 System.out.println("Introduce un número entero (0 para salir) ");
			 numero=teclado.nextInt();
			 if (numero!=0)
			 {
				 tabla.addElement(numero);
			 }
			
		 }while(numero!=0);
		 
		 System.out.println("Tamaño" +tabla.size());
		 System.out.println("Capacidad" +tabla.capacity());
		 System.out.println("Suma de valores: "+funsumar(tabla));
		 teclado.close();
		 
	}
		//Función
		 public static int funsumar(Vector<Integer> tabla)
		 {
		
		 int suma=0;
		 //Recorrer el vector para calcular la suma
		 for (int i=0;i<tabla.size();i++)
		 {
			 suma= suma + tabla.elementAt(i);
		 }
		 return suma;
		 }
		 
				 
}
