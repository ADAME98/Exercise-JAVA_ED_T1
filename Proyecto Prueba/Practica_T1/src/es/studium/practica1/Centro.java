package es.studium.practica1;

public class Centro
{
	private String nombre;
	private String dirección;
	private int codigoCentro;

	public Centro()
	{
		nombre = "";
		dirección = "";
		codigoCentro = 0;
	}

	public Centro(String nombre, String dirección, int codigoCentro)
	{
		this.nombre = nombre;
		this.dirección = dirección;
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

	public String getDirección()
	{
		return dirección;
	}

	public void setDirección(String dirección)
	{
		this.dirección = dirección;
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