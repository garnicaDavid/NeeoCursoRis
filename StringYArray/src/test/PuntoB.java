package test;

import java.util.Scanner;

//b. Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3
public class PuntoB {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int vector[] = new int[3];
		
		System.out.println("-Ingrese 3 números-");
		for(int i=0;i<3;i++) {
			System.out.print("Numero "+(i+1)+" = ");
			vector[i] = entrada.nextInt();
		}
		//Ordenar vector ascente;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(vector[i]<vector[j]) {
					int aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.print("["+vector[i]+"]");
		}
	}

}
