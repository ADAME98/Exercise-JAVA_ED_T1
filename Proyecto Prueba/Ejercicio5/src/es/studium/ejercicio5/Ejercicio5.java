package es.studium.ejercicio5;

public class Ejercicio5 {


		private String raza;
		private String tama�o;
		private String color;
		private int edad;
		
		public Ejercicio5 (){
			raza = "";
			tama�o = "";
			color = "";
			edad = 0;
		}
		public Ejercicio5 (String raz, String tam, String col, int ed) {
			raza = raz;
			tama�o = tam;
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
		public String getTama�o()
		{
			return tama�o;
		}
		public void setTama�o(String tama�o)
		{
			this.tama�o = tama�o;
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