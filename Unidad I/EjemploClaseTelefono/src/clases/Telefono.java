package clases;

/*
 * POJO: Plain Old Java Object, Java Bean
 * -Es una clase con sus atributos encapsulados, es decir con
 * modificador private y metodos sets y gets.
 * -Que tenga un constructor para inicializar los atributos de la clase.
 * -Un constructor vacio
 * -El metodo toString()
 *
 * */
public class Telefono {
	private String marca;
	private String color;
	private String modelo;
	private int capacidadMemoriaBytes;
	private int capacidadDiscoBytes;
	private int capacidadProcesadorHertz;
	private int tamanioPantalla;
	private String resolucion;
	private String sistemaOperativo;
	private String telefono;
	private String imei;

	public final int VALOR_MAXIMO=100;//Constante

	public static String valorEstatico = "Valor static";

	public Telefono(String marca,
			String color,
			String modelo,
			int capacidadMemoriaBytes,
			int capacidadDiscoBytes,
			int capacidadProcesadorHertz,
			int tamanioPantalla,
			String resolucion,
			String sistemaOperativo,
			String telefono,
			String imei) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.capacidadMemoriaBytes = capacidadMemoriaBytes;
		this.capacidadDiscoBytes = capacidadDiscoBytes;
		this.capacidadProcesadorHertz = capacidadProcesadorHertz;
		this.tamanioPantalla = tamanioPantalla;
		this.resolucion = resolucion;
		this.sistemaOperativo = sistemaOperativo;
		this.telefono = telefono;
		this.imei = imei;
	}

	public Telefono(){
	}

	public Telefono(String marca){
		this.marca = marca;
		this.color = "Blanco";
		this.sistemaOperativo = "Android";
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCapacidadMemoriaBytes() {
		return capacidadMemoriaBytes;
	}
	public void setCapacidadMemoriaBytes(int capacidadMemoriaBytes) {
		this.capacidadMemoriaBytes = capacidadMemoriaBytes;
	}
	public int getCapacidadDiscoBytes() {
		return capacidadDiscoBytes;
	}
	public void setCapacidadDiscoBytes(int capacidadDiscoBytes) {
		this.capacidadDiscoBytes = capacidadDiscoBytes;
	}
	public int getCapacidadProcesadorHertz() {
		return capacidadProcesadorHertz;
	}
	public void setCapacidadProcesadorHertz(int capacidadProcesadorHertz) {
		this.capacidadProcesadorHertz = capacidadProcesadorHertz;
	}
	public int getTamanioPantalla() {
		return tamanioPantalla;
	}
	public void setTamanioPantalla(int tamanioPantalla) {
		this.tamanioPantalla = tamanioPantalla;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	public String getTelefonico() {
		return telefono;
	}
	public void setTelefonico(String telefono) {
		this.telefono = telefono;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	//Se suele definir un metodo toString que retorna toda la informacion concatenada.
/*	public String toString(){
		return marca +"\t"+ color + "\t"+ modelo + "\t"+
				capacidadMemoriaBytes + "\t"+
				capacidadDiscoBytes+"\t"+capacidadProcesadorHertz +"\t"+
				tamanioPantalla + "\t"+ resolucion+ "\t"+ sistemaOperativo + "\t"+
				telefono +"\t"+ imei;
	}
*/




	public void llamar(){
		//System.out.println(color);
		System.out.println("Llamando...");
	}

	public String toString() {
		return "Telefono [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", capacidadMemoriaBytes="
				+ capacidadMemoriaBytes + ", capacidadDiscoBytes=" + capacidadDiscoBytes + ", capacidadProcesadorHertz="
				+ capacidadProcesadorHertz + ", tamanioPantalla=" + tamanioPantalla + ", resolucion=" + resolucion
				+ ", sistemaOperativo=" + sistemaOperativo + ", telefono=" + telefono + ", imei=" + imei + "]";
	}

	public void llamar(String telefonoDestino){
		System.out.println("Llamando a " + telefonoDestino);
	}

	public void llamar(int telefonoDestino){
		System.out.println("Llamando a " + telefonoDestino);
	}

	public static void colgar(){
		System.out.println("Colgando...");
	}
	public void vibrar(){
		System.out.println("Vibrando...");
	}
}
