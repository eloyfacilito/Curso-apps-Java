import java.util.ArrayList;

public class funcionArray { //F�lix lo llama ejercicio 12

	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Charmander");
		lista1.add("Pikachu");
		lista1.add("Squirtle");
		lista1.add("Bulbasaur");
		lista1.add("Ditto");
		recorrerArray(lista1);
		
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("Fuego");
		lista2.add("El�ctrico");
		lista2.add("Agua");
		lista2.add("Planta");
		lista2.add("Normal");
		recorrerArray(lista2);
		
	}

	public static void recorrerArray(ArrayList<String> array) {
		System.out.println("******************");
		for(String valor : array) {
			System.out.println(valor);
		}
	}
}
