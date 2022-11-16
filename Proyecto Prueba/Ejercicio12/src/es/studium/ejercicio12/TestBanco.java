package es.studium.ejercicio12;

public class TestBanco
{

	public static void main(String[] args)
	{
		Cliente cliente1 =  new Cliente ("Manuel","Rodriguez", "C/Roberto Méri");
		Cliente cliente2 =  new Cliente ("Isabel","Fernandez", "C/Emilio Sanz");
		
		Cuenta cuenta1 = new Cuenta ("ES 25 1589 1456 4876 1548 5486",548.23,cliente1);
		Cuenta cuenta2 = new Cuenta ("ES 25 1589 1456 4876 1548 5486",865.23,cliente2);

		System.out.println("La Cuenta de: "+ cuenta1.getCliente().getNombre()+" "+ "tiene "+ cuenta1.getSaldo()+ " Euros.");
		System.out.println("La Cuenta de: "+ cuenta2.getCliente().getNombre()+" "+ "tiene "+ cuenta2.getSaldo()+ " Euros."+ "\n");
		
		cuenta1.setSaldo(cuenta1.getSaldo()- 50.0);
		cuenta2.setSaldo(cuenta2.getSaldo()+ 50.0);
		
		System.out.println("La Cuenta de: "+ cuenta1.getCliente().getNombre()+" "+ "tiene "+ cuenta1.getSaldo()+ " Euros.");
		System.out.println("La Cuenta de: "+ cuenta2.getCliente().getNombre()+" "+ "tiene "+ cuenta2.getSaldo()+ " Euros.");
	}

}
