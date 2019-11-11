package avion;

import java.util.ArrayList;

public class MainAvion {

	public static void main(String[] args) {
		
		Avion avion1 = new Avion();
		avion1.setTipoAvion("Airbus");
		
		ArrayList<Maleta> listaMaletas = new ArrayList<Maleta>();
		Maleta maletaJuan = new Maleta();
		maletaJuan.setPeso(23);
		maletaJuan.setTipoMaleta("Grande");
		listaMaletas.add(maletaJuan);
		
		Maleta maletaJuanMano = new Maleta();
		maletaJuanMano.setPeso(9);
		maletaJuanMano.setTipoMaleta("peque�a");
		listaMaletas.add(maletaJuanMano);

		ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>();
		Pasajero juan = new Pasajero();
		
		juan.setNombre("Juan L�pez P�rez");
		juan.setDni("41639987M");
		juan.setTelefono("981654732");
		juan.setListaMaletas(listaMaletas);
		listaPasajeros.add(juan);
		
		ArrayList<Asiento> listaAsientos = new ArrayList <Asiento>();
		Asiento asientoJuan = new Asiento("Turista", "F", "8", juan); //He creado un constructor
		listaAsientos.add(asientoJuan);
//		asientoJuan.setTipoAsiento("Turista");
//		asientoJuan.setFila("8");
//		asientoJuan.setPosicion("F");
//		asientoJuan.setPasajero(juan);
//		listaAsientos.add(asientoJuan);
		
		
		
		avion1.setAsientos(listaAsientos);
		avion1.setListaPasajeros(listaPasajeros);
		
		System.out.println(avion1);	
		
		System.out.println(avion1.contarPasajeros());
		System.out.println(avion1.contarMaletasDeTipo("peque�a")); //cuenta los tipos de maletas
	}
	
//		public static void listaMaletas (String Peso, String Tipo) {
//			ArrayList<Maleta> listaMaletas = new ArrayList<Maleta>();
//			
//		}

}
