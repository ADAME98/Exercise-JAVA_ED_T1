package es.studium.practica1;

public class TestAcademiaDeIdiomas
{

	public static void main(String[] args)
	{
		Centro Centro1 = new Centro("Escuela De Ingles", "Reyes Catolicos,14", 54813684);
		Centro Centro2 = new Centro("Escuela de Frances", "Crist�bal Col�n,92", 47846686);

		Asignatura asignatura1 = new Asignatura("Ingles B1", 210, "54813684");
		Asignatura asignatura2 = new Asignatura("Ingles B2", 240, "54813684");
		Asignatura asignatura3 = new Asignatura("Frances B1", 210, "47846686");
		Asignatura asignatura4 = new Asignatura("Frances A2", 190, "47846686");

		Alumno alumno1 = new Alumno("Javier Adame", "C/Amadeo,16", 855, 9.5f, Centro1, asignatura1);
		Alumno alumno2 = new Alumno("Ana Abel", "Paseo de Am�rica, 15", 856, 7f, Centro1, asignatura1);
		Alumno alumno3 = new Alumno("Benito Bueno", "C/Reyes Cat�licos, 16", 857, 6f, Centro1, asignatura2);
		Alumno alumno4 = new Alumno("Carmen Cano", "C/Reyes Cat�licos, 2", 858, 5f, Centro1, asignatura1);
		Alumno alumno5 = new Alumno("Esteban Escalera", "C/Isabel la Cat�lica, 28", 859, 9f, Centro2, asignatura3);
		Alumno alumno6 = new Alumno("Francisco Farf�n", "C/Crist�bal Col�n, s/n", 860, 8.5f, Centro2, asignatura4);

		System.out.println("El nombre del 1� Centro es: " + Centro1.getNombre() + "\n" + "Calle: "
				+ Centro1.getDirecci�n() + "\n" + "Su Codigo es: " + Centro1.getCodigoCentro() + "\n");
		System.out.println("El nombre del 2� Centro es: " + Centro2.getNombre() + "\n" + "Calle: "
				+ Centro2.getDirecci�n() + "\n" + "Su Codigo es: " + Centro2.getCodigoCentro() + "\n");

		System.out.println("Nuestra alumna " + alumno4.getNombre() + ",\n" + "est� matriculada en la "
				+ alumno4.getCentro().getNombre()+".");

		System.out.println("\nNuestro alumno " + alumno3.getNombre() + ",\n" + "en la Asignatura "
				+ alumno3.getAsignatura().getNombre() + ",\nHa sacado: " + alumno3.getNotaAsignatura()+".");
	}

}
