package es.studium.Ejercicio10;

public class Aula
{
	private String nombre;
	private int capacidad;
	
	public Aula()
	{
	nombre = "";
	capacidad = 0;
	}
	public Aula(String nombre, int capacidad)
	{
		this.nombre = nombre;
		this.capacidad = capacidad;
		
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public int getCapacidad()
	{
		return capacidad;
	}
	public void setCapacidad(int capacidad)
	{
		this.capacidad = capacidad;
	}

}
