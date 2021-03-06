package implementacion;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Producto;

public class Principal {
	public static void ingresarInformacion(Producto p, Scanner entrada){
		System.out.println("Codigo del producto:");
		p.setCodigoProducto(entrada.nextInt());
		System.out.println("Nombre del producto:");
		p.setNombreProducto(entrada.next());
		System.out.println("Marca: ");
		p.setMarca(entrada.next());
		System.out.println("Precio: ");
		p.setPrecio(entrada.nextDouble());
		System.out.println("Impuesto: ");
		p.setImpuesto(entrada.nextDouble());
		System.out.println("Descuento: ");
		p.setDescuento(entrada.nextDouble());
	}


	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<Producto>();

		//0: Salir
		//1: Agregar un producto
		//2: Actualizar un producto
		//3: Eliminar un producto
		//4: Mostrar informacion
		Scanner entrada = new Scanner(System.in);
		int opcion=0;
		do{
			System.out.println(
					"0: Salir\n"
					+ "1: Agregar un producto\n"
					+ "2: Actualizar un producto\n"
					+ "3: Eliminar un producto\n"
					+ "4: Mostrar informacion"
			);
			opcion = entrada.nextInt();
			switch(opcion){
				case 1:
					//Crear un objeto del tipo producto
					Producto p = new Producto();
					//Solicitar la informacion
					ingresarInformacion(p,entrada);
					//Agregarlo al ArrayList
					productos.add(p);
					break;
				case 2:
					//Preguntar cual elemento modificar
					int indiceModificar;
					System.out.println("�Que elemento desea actualizar?"+
					" del 0 al "+(productos.size()-1));
					indiceModificar = entrada.nextInt();
					//Solicitar los datos nuevamente
					Producto p1 = productos.get(indiceModificar);
					ingresarInformacion(p1,entrada);
					//Sustituir el objeto anterior por el objeto modificado
					break;
				case 3:
					//Solicitar el elemento a eliminar
					int indiceEliminar;
					System.out.println("�Que elemento desea eliminar?"+
					" del 0 al "+(productos.size()-1));
					indiceEliminar= entrada.nextInt();
					//Eliminar el elemento
					productos.remove(indiceEliminar);
					System.out.println("Producto eliminado.");
					break;
				case 4:
					if (productos.size()==0)
						System.out.println("---No hay informacion---");
					for (int i=0;i<productos.size();i++)
						System.out.println(productos.get(i).toString());
					break;
			}
			System.out.println("Opcion seleccionada: " + opcion);
		}while (opcion!=0);
		System.out.println("Fin del programa");
		entrada.close();
	}
}
