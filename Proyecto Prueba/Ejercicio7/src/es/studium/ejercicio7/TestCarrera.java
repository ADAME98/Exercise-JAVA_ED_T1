package es.studium.ejercicio7;


public class TestCarrera
{
	public static void main(String[] args)
	{
		Coches formula1 = new Coches ();
		formula1.setFabricante("Ferrari");
		formula1.setA�o(2021);
		formula1.setModelo("LaFerrari");
		formula1.setGasolina(true);
		
		System.out.println(formula1.getFabricante());
		System.out.println(formula1.getA�o());
		System.out.println(formula1.getModelo());
		System.out.println(formula1.getGasolina());
		
		System.out.println("\n");
		
		
		Coches formula2 = new Coches ();
		formula2.setFabricante("Mercedes");
		formula2.setA�o(2020);
		formula2.setModelo("W11");
		formula2.setGasolina(true);
		
		
		System.out.println(formula2.getFabricante());
		System.out.println(formula2.getA�o());
		System.out.println(formula2.getModelo());
		System.out.println(formula2.getGasolina());
		
		
}
}