
public class MainCoche {

	public static void main(String[] args) {
		Coche c1 = new Coche ();
		c1.matricula = "455285P";
		c1.marca = "Seat";
		c1.modelo = "Le�n";
		c1.nuevo = false;
		
		Coche c2 = new Coche ();
		c2.matricula = "455589H";
		c2.marca = "Seat";
		c2.modelo = "Altea";
		c2.nuevo = false;
		
		Coche c3 = new Coche ();
		c3.matricula = "158888H";
		c3.marca = "Seat";
		c3.modelo = "Ibiza";
		c3.nuevo = true;
		
		Coche c4 = new Coche (true);//esto es para probar el constructor
		
		System.out.println(c4.nuevo); //esto es para probar el constructor
		
		imprimirCoche(c1.matricula, c1.marca, c1.modelo, c1.nuevo);
		imprimirCoche(c2.matricula, c2.marca, c2.modelo, c2.nuevo);
		imprimirCoche(c3.matricula, c3.marca, c3.modelo, c3.nuevo);
		imprimirCoche2 (c1); //esto es la segunda manera de hacerlo
		imprimirCoche2 (c2);
		imprimirCoche2 (c3);
		
		//As� lo he hecho la primera vez:
			}
	public static void imprimirCoche(String matricula, String marca, String modelo, boolean nuevo) {
		String valor = "0";
		if(nuevo) {
			valor = "El coche es nuevo";
		}else{
			valor = "El coche es de segunda mano";
		}
//		System.out.println("----------------------------------------------------------------");
		System.out.println("*** " + matricula + " | " + marca + " " + modelo + " | " + valor + " ***");
		System.out.println("----------------------------------------------------------------");
	}
		//As� lo ha hecho F�lix:
	public static void imprimirCoche2 (Coche coche) {
		String valor = "0";
		if(coche.nuevo) {
			valor = "El coche es nuevo";
		}else{
			valor = "El coche es de segunda mano";
		}
		System.out.println("Matr�cula: " + coche.matricula);
		System.out.println("Marca: " + coche.marca);
		System.out.println("Modelo: " + coche.modelo);
		System.out.println("�Es nuevo?: " + valor);
	}
}
