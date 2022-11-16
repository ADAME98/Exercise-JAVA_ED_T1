package es.studium.ejercicio1;


public class Principal
{

	public static void main(String[] args)
	{
		Persona persona1 = new Persona ();
		persona1.setNombre("Javier");
		persona1.setApellidos("Adame");
		persona1.setDni("47539417G");
		persona1.setDomicilio("C/Valdes Leal 3");
		persona1.setTelefono("618156891");
		
		
		System.out.println(persona1.getNombre());
		
		
		Persona persona2 = new Persona("Javier","Adame Gallardo","47539417G","C/Valdes Leal 3", "618156891");
		
		System.out.println(persona2.getNombre() + " ");
		System.out.println(persona2.getApellidos());
		System.out.println(persona2.getDni());
		System.out.println(persona2.getDomicilio());
		System.out.println(persona2.getTelefono());
		
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " " + persona2.getDni() + " " + persona2.getDomicilio() + " " + persona2.getTelefono());
	}

}
