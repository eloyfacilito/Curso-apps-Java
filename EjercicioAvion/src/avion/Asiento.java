package avion;

public class Asiento {
	private String tipoAsiento;
	private String posicion;
	private String fila;
	private Pasajero pasajeros;
	
	public Asiento(String tipoAsiento, String posicion, String fila, Pasajero pasajeros) {
		super();
		this.tipoAsiento = tipoAsiento;
		this.posicion = posicion;
		this.fila = fila;
		this.pasajeros = pasajeros;
	}
	public Asiento() {
		
	}
	public String getTipoAsiento() {
		return tipoAsiento;
	}
	public void setTipoAsiento(String tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	public Pasajero getPasajero() {
		return pasajeros;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajeros = pasajero;
	}
	
	@Override
	public String toString() {
		return "Asientos [tipoAsiento=" + tipoAsiento + ", posicion=" + posicion + ", fila=" + fila + ", pasajero="
				+ pasajeros + "]"; 
	}
		
}
