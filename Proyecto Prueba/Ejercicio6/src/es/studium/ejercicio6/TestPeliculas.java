package es.studium.ejercicio6;

public class TestPeliculas {

	public static void main(String[] args) {
		Peliculas Peli1 = new Peliculas ();
		Peli1.setTitulo("Avatar");
		Peli1.setAño(2010);
		Peli1.setDuración("2 horas y 25 minutos");
		
		Peliculas Peli2 = new Peliculas ();
		Peli2.setTitulo("TopGun");
		Peli2.setAño(2022);
		Peli2.setDuración("1 hora y 25 minutos");
		
		Peliculas Peli3 = new Peliculas ();
		Peli3.setTitulo("Atracción");
		Peli3.setAño(2015);
		Peli3.setDuración("2 horas y 05 minutos");
		
		Peliculas Peli4 = new Peliculas ();
		Peli4.setTitulo("Capitán America");
		Peli4.setAño(2014);
		Peli4.setDuración("1 horas y 55 minutos");
		
		Peliculas Peli5 = new Peliculas ();
		Peli5.setTitulo("IronMan");
		Peli5.setAño(2011);
		Peli5.setDuración("2 horas y 35 minutos");
		
		System.out.println(Peli1.getTitulo());
		System.out.println(Peli1.getAño());
		System.out.println(Peli1.getDuración());
		
		System.out.println(Peli2.getTitulo());
		System.out.println(Peli2.getAño());
		System.out.println(Peli2.getDuración());
		
	}

}
