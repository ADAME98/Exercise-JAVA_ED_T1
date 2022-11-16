package es.studium.practica1;

public class Asignatura
{
	private String nombre;
	private int numeroHoras;
	private String codigoCentro;

	public Asignatura()
	{
		nombre = "";
		numeroHoras = 0;
		codigoCentro = "";
	}

	public Asignatura(String nombre, int numeroHoras, String codigoCentro)
	{
		this.nombre = nombre;
		this.numeroHoras = numeroHoras;
		this.codigoCentro = codigoCentro;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getNumeroHoras()
	{
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras)
	{
		this.numeroHoras = numeroHoras;
	}

	public String getCodigoCentro()
	{
		return codigoCentro;
	}

	public void setCodigoCentro(String codigoCentro)
	{
		this.codigoCentro = codigoCentro;
	}

}
