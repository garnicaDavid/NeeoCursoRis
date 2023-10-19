package test;

public class PuntoC {
	public static void main(String[] args) {
		int vector[] = new int[]{2,25,3,1,49,6,34,5,10};
		int x = 10;
		int sumador=0;
		for(int i=0;i<vector.length;i++) {
			if(vector[i]>x) {
				sumador += vector[i];
			}
		}
		System.out.println("La sumatoria de los números mayores a "+x+" es "+sumador);
	}
	
}
