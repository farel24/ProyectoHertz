package implementacion;

import java.util.Scanner;

import clases.Telefono;

public class Principal {


	public static void main(String[] args) {
		int enteros[] = new int[3];
		enteros[0] = 5;

		Telefono telefonos[] = new Telefono[3]; //No se esta instanciando
		/*
		 * [0]=Sony
		 * [1]=null
		 * [2]=iPhone
		 * */

		telefonos[0] = new Telefono("Sony"); //Aqui si se esta instanciando
		telefonos[1] = new Telefono();
		telefonos[2] = new Telefono(
				"iPhone", "Blanco","6S",
				465465,65465,65465,213,"1080p",
				"iOS", "+504-45654654","546464654"
			);

		//System.out.println("Marca elemento 0: " + telefonos[0].getMarca());
		//System.out.println("Marca elemento 1: " + telefonos[1].getMarca());

		for (int i=0; i<telefonos.length; i++)
			System.out.println(telefonos[i].toString());
	}

}
