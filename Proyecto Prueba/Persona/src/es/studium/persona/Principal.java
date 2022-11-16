package es.studium.persona;

public class Principal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona ();
		persona1.setNombre("Javier");
		persona1.setApellidos("Adame Gallardo");
		persona1.setEdad(24);
		persona1.setHaPagado(true);
		
		System.out.println(persona1.getNombre());
		
		Persona persona2 = new Persona("Javier","Adame Gallardo", 20, true);
		
		System.out.print(persona2.getNombre() + " ");
		System.out.println(persona2.getApellidos());
		System.out.println(persona2.getEdad());
		System.out.println(persona2.getHaPagado());
		
		
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " " + persona2.getEdad() + " " + persona2.getHaPagado());
		
		
	}

}
