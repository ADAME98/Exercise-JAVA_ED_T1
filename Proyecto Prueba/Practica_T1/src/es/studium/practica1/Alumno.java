package es.studium.practica1;

public class Alumno
{
	private String nombre;
	private String dirección;
	private int numeroMatricula;
	private float notaAsignatura;
	private Centro centro;
	private Asignatura asignatura;

	public Alumno()
	{
		nombre = "";
		dirección = "";
		numeroMatricula = 0;
		notaAsignatura = 0.0f;
		centro = new Centro();
		asignatura = new Asignatura();

	}

	public Alumno(String nombre, String dirección, int numeroMatricula, float notaAsignatura, Centro centro,
			Asignatura asignatura)
	{
		this.nombre = nombre;
		this.dirección = dirección;
		this.numeroMatricula = numeroMatricula;
		this.notaAsignatura = notaAsignatura;
		this.centro = centro;
		this.asignatura = asignatura;
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

	public int getNumeroMatricula()
	{
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula)
	{
		this.numeroMatricula = numeroMatricula;
	}

	public float getNotaAsignatura()
	{
		return notaAsignatura;
	}

	public void setNotaAsignatura(float notaAsignatura)
	{
		this.notaAsignatura = notaAsignatura;
	}

	public Centro getCentro()
	{
		return centro;
	}

	public void setCentro(Centro centro)
	{
		this.centro = centro;
	}

	public Asignatura getAsignatura()
	{
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura)
	{
		this.asignatura = asignatura;
	}

}
