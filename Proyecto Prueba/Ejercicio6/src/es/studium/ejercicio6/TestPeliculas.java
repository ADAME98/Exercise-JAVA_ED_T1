package es.studium.ejercicio6;

public class TestPeliculas {

	public static void main(String[] args) {
		Peliculas Peli1 = new Peliculas ();
		Peli1.setTitulo("Avatar");
		Peli1.setA�o(2010);
		Peli1.setDuraci�n("2 horas y 25 minutos");
		
		Peliculas Peli2 = new Peliculas ();
		Peli2.setTitulo("TopGun");
		Peli2.setA�o(2022);
		Peli2.setDuraci�n("1 hora y 25 minutos");
		
		Peliculas Peli3 = new Peliculas ();
		Peli3.setTitulo("Atracci�n");
		Peli3.setA�o(2015);
		Peli3.setDuraci�n("2 horas y 05 minutos");
		
		Peliculas Peli4 = new Peliculas ();
		Peli4.setTitulo("Capit�n America");
		Peli4.setA�o(2014);
		Peli4.setDuraci�n("1 horas y 55 minutos");
		
		Peliculas Peli5 = new Peliculas ();
		Peli5.setTitulo("IronMan");
		Peli5.setA�o(2011);
		Peli5.setDuraci�n("2 horas y 35 minutos");
		
		System.out.println(Peli1.getTitulo());
		System.out.println(Peli1.getA�o());
		System.out.println(Peli1.getDuraci�n());
		
		System.out.println(Peli2.getTitulo());
		System.out.println(Peli2.getA�o());
		System.out.println(Peli2.getDuraci�n());
		
	}

}
