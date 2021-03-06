package implementacion;

import java.util.Scanner;

import clases.Empleado;
import clases.Fecha;

public class Principal {

	public static void solicitarInformacion(Empleado e, Scanner entrada){
		System.out.println("Nombre: ");
		e.setNombre(entrada.next());
		System.out.println("Apellido: ");
		e.setApellido(entrada.next());
		System.out.println("Genero: ");
		e.setGenero(entrada.next());
		System.out.println("Edad: ");
		e.setEdad(entrada.nextInt());
		System.out.println("Profesi�n: ");
		e.setProfesion(entrada.next());
		System.out.println("Fecha de ingreso (DD/MM/YYYY): ");
		e.setFechaIngreso(new Fecha(entrada.next()));
		System.out.println("Sueldo base: ");
		e.setSueldoBaseMensual(entrada.nextDouble());
		System.out.println("Impuesto sobre la renta: ");
		e.setImpuesto(entrada.nextDouble());
		System.out.println("Deduccion de seguro social: ");
		e.setDeduccion(entrada.nextDouble());
	}

	public static void main(String[] args) {
		Empleado[] empleados;
		Scanner entrada = new Scanner(System.in);
		int cantidadEmpleados;
		System.out.println("�Cuantos empleados quiere agregar?");
		cantidadEmpleados = entrada.nextInt();
		empleados = new Empleado[cantidadEmpleados];

		for (int i=0;i<empleados.length;i++){
			System.out.println("----Informacion empleado " + (i+1)+"--------");
			Empleado e = new Empleado();
			solicitarInformacion(e, entrada);
			empleados[i] = e;
		}
		System.out.println("-------Listado de empleados--------");
		for (int i=0; i<empleados.length;i++){
			System.out.println(empleados[i].toString());
		}

		int opcion = 0;

		do{
			System.out.println(
					"0 Salir\n"
					+ "1 Modificar empleado\n"
					+ "2 Mostrar informaci�n"
			);
			opcion = entrada.nextInt();

			switch(opcion){
				case 1:
					System.out.println("�Que empleado desea modificar? del 0 al " + (empleados.length-1));
					int indiceModificar = entrada.nextInt();
					Empleado e = empleados[indiceModificar];
					solicitarInformacion(e, entrada);
					empleados[indiceModificar] = e;
					break;
				case 2:
					System.out.println("-------Listado de empleados--------");
					for (int i=0; i<empleados.length;i++){
						System.out.println(empleados[i].toString());
					}
					break;
			}
		}while(opcion!=0);

		System.out.println("Finalizo el programa");
	}

}
