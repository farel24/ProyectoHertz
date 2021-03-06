package implementacion;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import clases.Empleado;
import clases.Fecha;

public class Principal {

	public static void solicitarInformacion(Empleado e){
		e.setNombre(JOptionPane.showInputDialog("Nombre:"));
		e.setApellido(JOptionPane.showInputDialog("Apellido:"));
		e.setGenero(JOptionPane.showInputDialog("Genero:"));
		e.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad:")));
		e.setProfesion(JOptionPane.showInputDialog("Profesi�n:"));
		e.setFechaIngreso(new Fecha(JOptionPane.showInputDialog("Fecha de ingreso (DD/MM/YYYY): ")));
		e.setSueldoBaseMensual(Double.parseDouble(JOptionPane.showInputDialog("Sueldo base:")));
		e.setSueldoBaseMensual(Double.parseDouble(JOptionPane.showInputDialog("Impuesto sobre la renta: ")));
		e.setSueldoBaseMensual(Double.parseDouble(JOptionPane.showInputDialog("Deduccion de seguro social:")));
	}

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		int opcion = 0;

		do{
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"0 Salir\n"
					+ "1 Agregar empleado\n"
					+ "2 Modificar empleado\n"
					+ "3 Eliminar empleado\n"
					+ "4 Mostrar informaci�n"
			));

			switch(opcion){
				case 1:
					//Crear una instancia vacia de empleado
					Empleado e = new Empleado();
					//Solicitar la informacion
					solicitarInformacion(e);
					//Agregar la instancia al ArrayList
					empleados.add(e);
					break;
				case 2:
					//Solicitar el indice a modificar
					int indiceModificar = Integer.parseInt(JOptionPane.showInputDialog("�Que registro desea modificar? "
							+ "(del 0 al "+(empleados.size()-1)+")"));
					Empleado e1=empleados.get(indiceModificar);
					//Solicitar nuevamente la informacion
					solicitarInformacion(e1);
					//Sustituir el objeto modificado
					empleados.set(indiceModificar, e1);
					break;
				case 3:
					//Solicitar el indice a eliminar

					int indiceEliminar = Integer.parseInt(JOptionPane.showInputDialog("�Que registro desea eliminar? "
							+ "(del 0 al "+(empleados.size()-1)+")"));
					//Eliminar registro
					empleados.remove(indiceEliminar);
					break;
				case 4:
					System.out.println("-------Listado de empleados--------");
					for (int i = 0;i<empleados.size();i++)
						System.out.println(empleados.get(i));
					break;

			}
		}while(opcion!=0);

		System.out.println("Finalizo el programa");
	}

}
