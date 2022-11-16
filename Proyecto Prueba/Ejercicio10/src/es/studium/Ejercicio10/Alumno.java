package es.studium.Ejercicio10;

public class Alumno
{
	private String nombre;
	private String apellido;
	private int ano;
	private boolean haPagado;
	private Aula aula;
	
	public Alumno () {
		nombre = "";
		apellido ="";
		ano = 0;
		haPagado = false;
		aula = new Aula();
	}
	public Alumno(String nom, String apel, int ano, boolean haP, Aula aula)
	{
		this.nombre = nom;
		this.apellido = apel;
		this.ano = ano;
		this.haPagado = haP;
		this.aula = aula;
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
	public int getAno()
	{
		return ano;
	}
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	public boolean getHaPagado()
	{
		return haPagado;
	}
	public void setHaPagado(boolean haPagado)
	{
		this.haPagado = haPagado;
	}
	public Aula getAula()
	{
		return aula;
	}
	public void setAula(Aula aula)
	{
		this.aula = aula;
	}
	
}
