package dad.gsonsample;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		contieneSoloLetras(nombre);
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		contieneSoloLetras(apellido);
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void contieneSoloLetras(String cadena) {
	    for (int x = 0; x < cadena.length(); x++) {
	        if(!Character.isLetter(cadena.charAt(x))) {
	        	throw new RuntimeException("Has introducido un valor que no es una letra en el nombre o apellido");
	        }  
	        };
	}

}
