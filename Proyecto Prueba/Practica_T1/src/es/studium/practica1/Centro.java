package es.studium.practica1;

public class Centro
{
	private String nombre;
	private String direcci�n;
	private int codigoCentro;

	public Centro()
	{
		nombre = "";
		direcci�n = "";
		codigoCentro = 0;
	}

	public Centro(String nombre, String direcci�n, int codigoCentro)
	{
		this.nombre = nombre;
		this.direcci�n = direcci�n;
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

	public String getDirecci�n()
	{
		return direcci�n;
	}

	public void setDirecci�n(String direcci�n)
	{
		this.direcci�n = direcci�n;
	}

	public int getCodigoCentro()
	{
		return codigoCentro;
	}

	public void setCodigoCentro(int codigoCentro)
	{
		this.codigoCentro = codigoCentro;
	}

}