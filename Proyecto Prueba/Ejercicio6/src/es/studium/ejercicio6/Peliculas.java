package es.studium.ejercicio6;

public class Peliculas {
	private String titulo;
	private int a�o;
	private String duraci�n;

	public Peliculas () {
	titulo = "";
	a�o = 0;
	duraci�n = "";
	}
	
	public Peliculas ( String title, int age, String duration) {
		titulo = title;
		a�o = age;
		duraci�n = duration;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getDuraci�n() {
		return duraci�n;
	}

	public void setDuraci�n(String duraci�n) {
		this.duraci�n = duraci�n;
	}
	
	
}
