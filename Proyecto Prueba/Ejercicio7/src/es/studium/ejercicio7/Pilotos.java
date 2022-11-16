package es.studium.ejercicio7;

public class Pilotos
{
	private String nombre;
	private String nacionalidad;
	
	public Pilotos () {
		nombre = "";
		nacionalidad = "";
}
	public Pilotos (String nom, String nac) {
		nombre = nom;
		nacionalidad = nac;
		}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getNacionalidad()
	{
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}
	
	

}