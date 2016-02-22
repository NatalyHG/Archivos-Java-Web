package pe.egcc.demosession.dto;

public class Producto {
private String nombre;
private double precio;
private int cant;
private double importe;

public Producto(){	
}
public Producto(String nombre, double precio, int cant, double importe){
	this.setNombre(nombre);
	this.setPrecio(precio);
	this.setCant(cant);
	this.setImporte(importe);
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCant() {
	return cant;
}
public void setCant(int cant) {
	this.cant = cant;
}
public double getImporte() {
	return importe;
}
public void setImporte(double importe) {
	this.importe = importe;
}
}
