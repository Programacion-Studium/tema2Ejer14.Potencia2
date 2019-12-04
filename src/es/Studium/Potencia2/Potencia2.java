package es.Studium.Potencia2;

import java.util.Scanner;

public class Potencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca A");
		a = teclado.nextInt();
		System.out.println("Introduzca B");
		b = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de "+a+" elevado a "+b+" es:"+FuncPotencia(a,b));
	}
	public static double FuncPotencia(int a, int b)
	{
		double r;//Ponemos double puesto que puede ser un numero muy grande
		r=1;
		for(int i=1; i<=b;i++) 
		{
			r*=a; //Se puede poner r=r*a
		}
		return r;
	}
}
