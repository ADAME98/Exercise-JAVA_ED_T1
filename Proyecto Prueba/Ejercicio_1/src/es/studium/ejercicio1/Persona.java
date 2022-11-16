package es.studium.ejercicio1;

public class Persona
{
	private String nombre;
	private String apellidos;
	private String DNI;
	private String domicilio; 
	private String telefono;
	
	
	//Constructors

	/*
	 * Constructor vacio o por defecto
	 */
	public Persona () {
		nombre ="";
		apellidos = "";
		DNI = "";
		domicilio = "";
		telefono = "";
		
	}

//Constructor for parameters
 
	public Persona( String nom, String ap, String dni, String dom, String tel) {
		
		nombre = nom;
		apellidos = ap;
		DNI = dni;
		domicilio = dom;
		telefono = tel;
		
		
	}

	//Meted
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return DNI;
	}

	public void setDni(String Dni) {
		this.DNI = Dni; 
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
