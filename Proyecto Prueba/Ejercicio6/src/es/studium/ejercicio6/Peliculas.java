package es.studium.ejercicio6;

public class Peliculas {
	private String titulo;
	private int año;
	private String duración;

	public Peliculas () {
	titulo = "";
	año = 0;
	duración = "";
	}
	
	public Peliculas ( String title, int age, String duration) {
		titulo = title;
		año = age;
		duración = duration;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getDuración() {
		return duración;
	}

	public void setDuración(String duración) {
		this.duración = duración;
	}
	
	
}
