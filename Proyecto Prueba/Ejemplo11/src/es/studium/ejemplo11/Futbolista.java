package es.studium.ejemplo11;

public class Futbolista
{
	private String nombre;
	private String apellido;
	private boolean comunitario;
	private Equipo equipo;
	
	public void Equipo() {
		nombre = "";
		apellido ="";
		comunitario = true;
		equipo = new Equipo();
	}

	public Futbolista(String nombre, String apellido, boolean comunitario, es.studium.ejemplo11.Equipo equipo)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.comunitario = comunitario;
		this.equipo = equipo;
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

	public boolean getComunitario()
	{
		return comunitario;
	}

	public void setComunitario(boolean comunitario)
	{
		this.comunitario = comunitario;
	}

	public Equipo getEquipo()
	{
		return equipo;
	}

	public void setEquipo(Equipo equipo)
	{
		this.equipo = equipo;
	}
	

}
