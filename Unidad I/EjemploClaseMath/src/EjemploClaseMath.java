
import java.util.Scanner;
public class EjemploClaseMath{
	public static void main(String[] args){
		int opcion;
		double valor;
		int potencia;
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.println("Pi: " + Math.PI);
		System.out.println("e: "+ Math.E);
		System.out.println("Que operacion desea realizar?");
		System.out.println("1 Potencia de un numero");
		System.out.println("2 Valor absoluto");
		System.out.println("3 Raiz cuadrada");
		System.out.println("4 Numero random");
		System.out.println("0 Salir");
		do{
			System.out.print("----------------\nOpcion: ");
			opcion = entrada.nextInt();

			switch (opcion){
				case 1:
					System.out.print("Valor: ");
					valor = entrada.nextDouble();
					System.out.print("Potencia: ");
					potencia = entrada.nextInt();
					System.out.println("Resultado: "+Math.pow(valor, potencia));
				break;
				case 2:
					System.out.print("Valor: ");
					valor = entrada.nextDouble();
					System.out.println("Valor Absoluto: "+Math.abs(valor));
				break;
				case 3:
					System.out.print("Valor: ");
					valor = entrada.nextDouble();
					System.out.println("Raiz Cuadrada: "+Math.sqrt(valor));
				break;
				case 4:
					System.out.println("Numero aleatorio: "+Math.random());
				break;
			}
		}while(opcion!=0);
		System.out.println("Fin del programa");
		entrada.close();
	}
}