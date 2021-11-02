/*
Title		:Código para determinar si el usuario es mayor o menor de edad.
Description	:Este es un código que determine si el usuario es mayor o menor de edad
		 dependiendo del año de nacimiento.
Author		:Orlando Urbano Trejo (Lando).
Date		:19_10_2021
Version 	:1 
 */

import java.util.Scanner;
public class Edad {//Inicio clase principal
	public static void main(String[] args){//Inicio metodo principal
	
	//Declaración de variables
	int Fecha_Nacimiento;
	int Fecha_Actual = 2021;
	int Diferencia = 0;
	Scanner teclado = new Scanner (System.in);
	
	System.out.print ("Digite su año de nacimiento: ");
	Fecha_Nacimiento = teclado.nextInt();

	Diferencia = (Fecha_Actual - Fecha_Nacimiento);

	if (Diferencia >= 18){
		System.out.print ("El usuario tiene " + Diferencia + ",es mayor de edad");
	}
	else {
		System.out.print ("El usuario tiene " + Diferencia + ",es menor de edad");
	}
	
	
	}//Fin metodo principal

}//Fin clase principal
