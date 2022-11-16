package es.studium.ejercicio12;

public class Cliente
{
	private String nombre;
	private String apellido;
	private String direccion;
	
	public Cliente()
	{
		nombre = "";
		apellido ="";
		direccion = "";
	}
	
	public Cliente(String nombre, String apellido, String direccion)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	} 
	
} 
