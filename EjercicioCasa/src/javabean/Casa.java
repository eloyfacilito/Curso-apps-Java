package javabean;

import java.util.ArrayList;

public class Casa {
	private double precio;
	private Direccion direccion;
	private ArrayList<Habitacion>listaHabitacion;
	private Persona propietario;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Habitacion> getListaHabitacion() {
		return listaHabitacion;
	}
	public void setListaHabitacion(ArrayList<Habitacion> listaHabitacion) {
		this.listaHabitacion = listaHabitacion;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", direccion=" + direccion + ", listaHabitacion=" + listaHabitacion
				+ ", propietario=" + propietario + "]";
	}
	
	
}

