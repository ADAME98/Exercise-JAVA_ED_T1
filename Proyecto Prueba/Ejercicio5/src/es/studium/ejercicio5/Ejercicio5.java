package es.studium.ejercicio5;

public class Ejercicio5 {


		private String raza;
		private String tamaño;
		private String color;
		private int edad;
		
		public Ejercicio5 (){
			raza = "";
			tamaño = "";
			color = "";
			edad = 0;
		}
		public Ejercicio5 (String raz, String tam, String col, int ed) {
			raza = raz;
			tamaño = tam;
			color = col;
			edad = ed;
		}
		public String getRaza()
		{
			return raza;
		}
		public void setRaza(String raza)
		{
			this.raza = raza;
		}
		public String getTamaño()
		{
			return tamaño;
		}
		public void setTamaño(String tamaño)
		{
			this.tamaño = tamaño;
		}
		public String getColor()
		{
			return color;
		}
		public void setColor(String color)
		{
			this.color = color;
		}
		public int getEdad()
		{
			return edad;
		}
		public void setEdad(int edad)
		{
			this.edad = edad;
		}
		
		
}	