package test;
//a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
public class PuntoA {
	
	public static void main(String[] args) {
		String texto = "Hola equipo, feliz dia de la primavera";
		char letra = 'a';
		int contador=0;
		
		texto = texto.toLowerCase();

		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i) == letra) {
				contador++;
			}
		}
		System.out.println("La letra '"+letra+"' se repite : "+contador);
		

		int num1 = 28;
		int num2 = 26;
		System.out.println(num1%num2);
	}
}
