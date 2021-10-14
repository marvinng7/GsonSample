package dad.gsonsample;

import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Persona p = new Persona();
		String n,a;
		int e;
		int num;
		
		System.out.print("Escribe tu nombre: ");
		 n = teclado.nextLine();
		 
		 System.out.print("Escribe tus apellidos: ");
		 	a = teclado.nextLine();
		
			System.out.print("Escribe tu edad: ");
			e = teclado.nextInt();
		
		p.setNombre(n);
		p.setApellido(a);
		p.setEdad(e);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
	}
	
}

