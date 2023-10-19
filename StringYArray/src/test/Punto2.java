package test;

import java.util.Scanner;

public class Punto2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useDelimiter("\n");
		
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		int desplazo = 2;
		System.out.println("-Ingresar un texto-");
		String texto = input.next();
		texto = texto.toLowerCase();
		//Restamos -1 para que en el texto no cuente la tecla Enter que lo adiciona la clase Scanner.
		int cantTexto = texto.length()-1;
		String codificado = "";
		
		for(int i=0;i<cantTexto;i++) {
			char letra = texto.charAt(i);
			if( letra != ' ') {
				codificado += buscar(abecedario, letra, abecedario.length(), desplazo);
			} else {
				codificado += " ";
			}
		}
		System.out.println(codificado);
	}
	
	static String buscar(String abecedario, char letra, int cant, int desplazo){
		String letraCodi ="";
		int i=0;
		while((i < cant) && (abecedario.charAt(i) != letra)) {
			i++;
		}
			letraCodi = deesplazar(abecedario, i, cant, desplazo);
			
		return letraCodi;
	}

	static String deesplazar(String abecedario, int i, int cant, int desplazo) {
		String letra = "";
		int num = i + desplazo;
		int pos=0;
		if(num>=cant) {
			pos = num%cant;
			letra = String.valueOf(abecedario.charAt(pos));
		} else {
			
			letra = String.valueOf(abecedario.charAt(num));
		}
		
		
		return letra;
	}
}
