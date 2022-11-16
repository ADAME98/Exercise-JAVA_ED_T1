package es.studium.ejercicio7;

public class Coches
{

	
		private String fabricante;
		private String modelo;
		private int año;
		private boolean gasolina;
		
		public Coches () {
			fabricante = "";
			modelo = "";
			año = 0;
			gasolina = false;
		}
		public Coches (String fab, String mod, int year, boolean gasofa) {
			fabricante = fab;
			modelo = mod;
			año = year;
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
		public int getAño()
		{
			return año;
		}
		public void setAño(int año)
		{
			this.año = año;
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
