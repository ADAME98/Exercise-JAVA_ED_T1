package es.studium.ejercicio7;

public class Coches
{

	
		private String fabricante;
		private String modelo;
		private int a�o;
		private boolean gasolina;
		
		public Coches () {
			fabricante = "";
			modelo = "";
			a�o = 0;
			gasolina = false;
		}
		public Coches (String fab, String mod, int year, boolean gasofa) {
			fabricante = fab;
			modelo = mod;
			a�o = year;
			gasolina = gasofa;
	}
		public String getFabricante()
		{
			return fabricante;
		}
		public void setFabricante(String fabricante)
		{
			this.fabricante = fabricante;
		}
		public String getModelo()
		{
			return modelo;
		}
		public void setModelo(String modelo)
		{
			this.modelo = modelo;
		}
		public int getA�o()
		{
			return a�o;
		}
		public void setA�o(int a�o)
		{
			this.a�o = a�o;
		}
		public boolean getGasolina()
		{
			return gasolina;
		}
		public void setGasolina(boolean gasolina)
		{
			this.gasolina = gasolina;
		}
		
		

}
