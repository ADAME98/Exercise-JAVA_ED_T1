package es.studium.ejercicio5;

public class Testperro {

	public static void main(String[] args) {
		Ejercicio5 Perro = new Ejercicio5 ();
		Perro.setRaza("Pastor Aleman");
		Perro.setTamaño("Grande");
		Perro.setColor("Marron");
		Perro.setEdad(1);
		
		System.out.println(Perro.getRaza());
		System.out.println(Perro.getTamaño());
		System.out.println(Perro.getColor());
		System.out.println(Perro.getEdad());
		
		
		Ejercicio5 Perro1 = new Ejercicio5 ("Pastor Aleman","Grande","MarrÃ³n",1 );
		System.out.println(Perro1.getRaza()+ " " +Perro1.getTamaño() + " " +Perro1.getColor() + " " +Perro1.getEdad()+ " ");
		
		Ejercicio5 Perro2 = new Ejercicio5 ("Husky","Mediano","Blanco",2 );
		System.out.println(Perro2.getRaza()+ " " +Perro2.getTamaño() + " " +Perro2.getColor() + " " +Perro2.getEdad()+ " ");
		
		
		
		
		
		
		
		
		
	}
	

}
