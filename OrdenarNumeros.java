/*
Title		:Ordenar Numeros de manera ascendente descendente y viceversa.
Description	:Este codigo nos ayudaraa ordenar cierta cantidad de numeros de menor a mayor y viceversa.
Author		:Orlando Urbano Trejo (Lando).
E-mail		:urbanoorlando79@gmail.com
Date		:19_10_2021
Version		:1
*/

import java.util.Scanner;

public class OrdenarNumeros{
	public static void main (String neo[]){
	Scanner entrada = new Scanner(System.in);
	int Tamanio;
	int x;
	int y;
	int z;
	int CambioPosicion;
	int Orden;

	System.out.print("Ingresa el numero de valores a ordenar");
	Tamanio = entrada.nextInt();

	/* Establecemos el tamanio del arreglo */
	int numeros[] = new int [Tamanio];

	/* Recibe datos de usuario "Valores a ordenar" */
	for(x = 0; x < Tamanio; x++){
		System.out.print("\nIngresa el valor: ");
		numeros[x] = entrada.nextInt();
	}

	for(z = 0; z < Tamanio; z++){
	 for (y = 0; y < Tamanio -1; y++){
	 	if (numeros[y] > numeros [y+1]){
		CambioPosicion = numeros[y];
		numeros[y] = numeros[y+1];
		numeros[y+1] = CambioPosicion;
		}
	 }
	}
	System.out.print("\nOrden de impresion\n1)ascendente\n2)desendente: ");
	Orden = entrada.nextInt();

	if(Orden ==1){
	 for(x = 0; x < Tamanio; x++){
		System.out.print(numeros[x]+" , ");
	 }
	}
	else if(Orden == 2){
	for(x = Tamanio-1; x >=0; x--){
	System.out.print(numeros[x]+" , ");
	}
	}else{
	System.out.print("Opcion no valida");

		}	
	
	}
} 

