package es.studium.herencia;

public class Principal
{

	public static void main(String[] args)
	{
		Empleado empleado99 = new Empleado("Estebanovish", "Riquelme", "C/mandanga nº6", 955485959, "57564854R",
				"Informatico");
		System.out.println("El nuevo Empleado " + empleado99.getNombre() + " " + empleado99.getApellidos() + "\n"
				+ empleado99.getDomicilio() + " " + empleado99.getTelefono() + "\n" + empleado99.getDni() + "\n"
				+ empleado99.getPuesto() + "\n");

		Empleado empleado100 = new Empleado();
		empleado100.setNombre("Gerardino");
		empleado100.setApellidos("Comepinos");
		empleado100.setDomicilio("C/Rosa Maria");
		empleado100.setTelefono(954882215);
		empleado100.setDni("47568456R");
		empleado100.setPuesto("Esclavo");

		System.out.println("El nuevo Empleado " + empleado100.getNombre() + " " + empleado100.getApellidos() + "\n"
				+ empleado100.getDomicilio() + " " + empleado100.getTelefono() + "\n" + empleado100.getDni() + "\n"
				+ empleado100.getPuesto() + "\n");

		Consejero consejero1 = new Consejero("Antonio", "Rodriguez Lozano", "c/Almodobar 3", 654854645, "77546845G",
				"funcionario");
		
		System.out.println("El nuevo Empleado " + consejero1.getNombre() + " " + consejero1.getApellidos() + "\n"
				+ consejero1.getDomicilio() + " " + consejero1.getTelefono() + "\n" + consejero1.getDni() + "\n"
				+ consejero1.getPuesto() + "\n");

	}
}
