package es.studium.ejercicio9;

public class Libro
{
		private String titulo;
		private Autor autor;
		private int ano;
		private String editorial;
		private int numpagina;
	
	
	public Libro () {
		titulo = "";
		autor = new Autor ();
		ano = 0;
		editorial = "";
		numpagina = 0;
	}


	public Libro(String titulo, Autor autor, int ano, String editorial, int numpagina)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.editorial = editorial;
		this.numpagina = numpagina;
	}


	public String getTitulo()
	{
		return titulo;
	}


	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}


	public Autor getAutor()
	{
		return autor;
	}


	public void setAutor(Autor autor)
	{
		this.autor = autor;
	}


	public int getAno()
	{
		return ano;
	}


	public void setAno(int ano)
	{
		this.ano = ano;
	}


	public String getEditorial()
	{
		return editorial;
	}


	public void setEditorial(String editorial)
	{
		this.editorial = editorial;
	}


	public int getNumpagina()
	{
		return numpagina;
	}


	public void setNumpagina(int numpagina)
	{
		this.numpagina = numpagina;
	}


	
	
	
	
}
