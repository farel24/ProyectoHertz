package implementacion;

import java.util.Scanner;

import clases.Telefono;

public class Principal {


	public static void main(String[] args) {
		Telefono t=new Telefono(
					"Samsung", "Dorado","S7",
					465465,65465,65465,213,"1080p",
					"Android", "+504-45654654","546464654"
				);

		Telefono.valorEstatico = "Pollo";
		System.out.println(t.valorEstatico);//Valor static
		System.out.println(Telefono.valorEstatico);//Pollo
		Telefono.colgar();
		Telefono t1=new Telefono();

		t1.setMarca("Samsung");
		t1.setModelo("S7");
		t1.setColor("Dorado");
		t1.setCapacidadDiscoBytes(1235245);
		t1.setCapacidadMemoriaBytes(436456);
		t1.setCapacidadProcesadorHertz(45345);

		Telefono t3 = new Telefono("Huawei");
		System.out.println("Sistema operativo t3: " + t3.getSistemaOperativo());

		/*System.out.println("Marca del telefono: " + t.getMarca());
		System.out.println("Marca del telefono: " + t.getColor());
		System.out.println("Marca del telefono: " + t.getSistemaOperativo());*/
		System.out.println(t.toString());
		t.llamar();
		t.llamar("+5047887785");
		t.llamar(95656565);



		t.vibrar();
		t.colgar();
	}

}
