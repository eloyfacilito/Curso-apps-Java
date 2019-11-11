
public class Coche {
	public String matricula;
	public String marca;
	public String modelo;
	public boolean nuevo;
	
	public Coche() {
		
	}

	public Coche(String matricula, String marca, String modelo, boolean nuevo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.nuevo = nuevo;
	}


	public Coche(boolean nuevo) {
		super();
		this.nuevo = nuevo;
	}

	public Coche(String marca) {
		super();
		this.marca = marca;
	}

	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}	
	
	
}
