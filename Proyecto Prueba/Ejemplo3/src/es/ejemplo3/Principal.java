package es.ejemplo3;

public class Principal {
	public static void main(String[] args) {
		// Valores por defecto
		Empleado Ejemplo3 = new Empleado ();
		Ejemplo3.setNombre("Javier");
		Ejemplo3.setApellidos("Adame Gallardo");
		Ejemplo3.setDomicilio("C/Valdes Leal,3");
		Ejemplo3.setDni("54781454D");
		Ejemplo3.setPuesto("jefe");
		Ejemplo3.setTelefono(648557568);
		
		System.out.println(Ejemplo3.getNombre());
		System.out.println(Ejemplo3.getApellidos());
		System.out.println(Ejemplo3.getDomicilio());
		System.out.println(Ejemplo3.getDni());
		System.out.println(Ejemplo3.getPuesto());
		System.out.println(Ejemplo3.getTelefono());
		
		//Valores Asignados
		Empleado Ejemplo31 = new Empleado ("Jorge","Sánchez García","34231232", "Avda, La Paz, nº 3", "Programador", 954654756);
		System.out.println(Ejemplo31.getNombre() + " " + Ejemplo31.getApellidos() + " " + Ejemplo31.getDomicilio() + " " + Ejemplo31.getDni()+ " " + Ejemplo31.getPuesto() + " " + Ejemplo31.getTelefono());		
		
	}}
	