package clases;

public class Cast {
	public static void main(String[] args) {
		float a = 10.5f;
		int b;
		int c = 15;
		float d;
		byte f = 122;
		long g = 1002032342;
		int h;
		b = (int)a; //Cast o conversión de de tipos
		d = (float)c;
		h = (int)g;
		//En el caso de String no se pueden hacer cast
		//con tipos primitivos ya que es una clase.
		String nombre = "Juan";

		System.out.println("Valor: "+b);//El valor mostrado sera 10
		System.out.println("Valor: "+d);//El valor mostrado sera 10

		char e = (char)f;
		System.out.println("Valor Char: "+e);
		System.out.println("Valor: "+h);
	}
}
