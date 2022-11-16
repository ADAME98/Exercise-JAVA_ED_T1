package es.studium.ejercicio9;

public class TestBiblioteca
{

	public static void main(String[] args)
	{

		Autor autor1 = new Autor("Nombre Autor 1", "Apellidos Autor1", "Nacionalidad del Autor 1");
		Libro libro1 = new Libro("Titulo 1", autor1, 1999, "Editorial 1", 520);

		System.out.println(libro1.getTitulo() + " \n" + libro1.getAutor().getNombre() + "\n"
				+ libro1.getAutor().getApellidos() + "\n" + libro1.getAutor().getNacionalidad()+ "\n");

		Autor autor2 = new Autor();
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
