package es.studium.Ejercicio10;




public class TestEscuela
{

	public static void main(String[] args)
	{
		Aula au1 = new Aula("DAW,20", 0);
		Aula au2 = new Aula("DAM, 15",0);
		
		
		Alumno a11 = new Alumno ("benito", null, 0, false, au2) ;
		Alumno a12 = new Alumno ("margaret", null, 0, false, au2);
		Alumno a13 = new Alumno ("mariano", null, 0, false, au2);

		System.out.println(libro1.getTitulo() + " \n" + libro1.getAutor().getNombre() + "\n"
				+ libro1.getAutor().getApellidos() + "\n" + libro1.getAutor().getNacionalidad()+ "\n");

		Alumno autor2 = new Alumno();
		autor2.setNombre("Nombre Autor 2");
		autor2.setApellidos("Apellidos Autor 2");
		autor2.setNacionalidad("Española");

		Libro libro2 = new Libro();

		libro2.setTitulo("Titulo del libro 2");
		libro2.setAutor(autor2);
		libro2.setEditorial("Editorial de libro 2");
		libro2.setAno(2000);
		libro2.setNumpagina(240);

		System.out.println(libro2.getTitulo() + "\n" + libro2.getAutor().getNombre()+ "\n"+ libro2.getNumpagina() + "\n"
				+ libro2.getAutor().getApellidos() + "\n" + libro2.getAutor().getNacionalidad());


	}

}
