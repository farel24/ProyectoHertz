package implementacion;

import java.util.ArrayList;

import clases.Producto;

public class Principal {
	public static void main(String[] args) {
		int a = 1;
		//RawType: es un tipo de dato referenciado que se
		//suele indicar en ciertas clases al momento de
		//declararlas e instanciarlas
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Producto arregloProductos[] = new Producto[2];

		Producto p1 =  new Producto(123,"Desodorante","Marca",123,123,123);
		Producto p2 =  new Producto(456,"Calcetines","Puma",123,123,123);
		Producto p3 =  new Producto(789,"Baleadas","Kennedy",123,123,123);
		Producto p4 =  new Producto(667,"Zapatos","Nike",123,123,123);

		arregloProductos[0] = p1;
		arregloProductos[1] = p2;


		productos.add(p1); //0
		productos.add(p2); //1
		productos.add(p3); //2
		productos.add(new Producto(111,"Computadora","Asus",123,123,123));//Instancia anonima. //3


		System.out.println("--------Todos los productos");
		for(int i = 0;i<productos.size();i++){
			System.out.println(productos.get(i).toString());
		}

		productos.remove(1);

		System.out.println("--------Productos despues de eliminar uno");
		for(int i = 0;i<productos.size();i++){
			System.out.println(productos.get(i).toString());
		}

		productos.set(1,p4);

		System.out.println("-------Productos despues de la sustitucion o actualizacion");
		for(int i = 0;i<productos.size();i++){
			System.out.println(productos.get(i).toString());
		}

	}
}
