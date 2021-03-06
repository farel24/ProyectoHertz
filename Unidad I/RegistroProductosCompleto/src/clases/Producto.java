package clases;

public class Producto {
	private int codigoProducto;
	private String nombreProducto;
	private String marca;
	private double precio;
	private double descuento;
	private double impuesto;

	public Producto(
			int codigoProducto,
			String nombreProducto,
			String marca,
			double precio,
			double descuento,
			double impuesto) {
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.marca = marca;
		this.precio = precio;
		this.descuento = descuento;
		this.impuesto = impuesto;
	}

	public Producto(){}

	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", marca=" + marca
				+ ", precio=" + precio + ", descuento=" + descuento + ", impuesto=" + impuesto + "]";
	}
}
