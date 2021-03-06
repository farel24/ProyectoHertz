package clases;

public class OperadoresUnarios {
	public static void main(String[] args) {
		//Ejemplo de una constante
		final int ALTURA_MAXIMA;
		int a = 2;
		int b = 2;

		//Una vez inicializada el valor ya no se puede cambiar
		ALTURA_MAXIMA = 100;
		System.out.println(a++); //Imprime 2
		System.out.println(++b); //Imprime 3
		System.out.print("Estado Final (a) :");
		System.out.println(a); //Imprime 3
		System.out.print("Estado Final (b) :");
		System.out.println(b); //Imprime 3

		//Ejemplos de constantes existentes
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}
}
