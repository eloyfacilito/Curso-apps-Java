package javabean;

import java.util.ArrayList;

public class MainCasa {
	public static void main(String[] args) {
		
		ArrayList<Habitacion> listaHabitacion = new ArrayList<Habitacion>();
		Direccion direccion = new Direccion();

		direccion.setTipoVia("Calle");
		direccion.setNombreVia("Serrano");
		direccion.setNumero("378");
		direccion.setCp("28001");
		direccion.setCiudad("Madrid");
		
		Habitacion salon = new Habitacion();
		salon.setTipoHabitacion("Sal�n");
		salon.setMetros(50);
		
		Habitacion cocina = new Habitacion();		 
		cocina.setTipoHabitacion("Cocina");
		cocina.setMetros(20);
		
		listaHabitacion.add(cocina);
		listaHabitacion.add(salon);
		
		Persona propietario = new Persona();
		propietario.setNombre("Manuel L�pez");
		
		Casa chalet = new Casa(); 
		chalet.setListaHabitacion(listaHabitacion);
		chalet.setDireccion(direccion);
		chalet.setPropietario(propietario);
		chalet.setPrecio(3000000);
		//maneras de cambiar los metros cuadrados del sal�n
		//1
		salon.setMetros(60);
		//2
		listaHabitacion.get(1).setMetros(60);
		//3
		chalet.getListaHabitacion().get(1).setMetros(60);
		
		
		
		System.out.println(chalet);
	}
}