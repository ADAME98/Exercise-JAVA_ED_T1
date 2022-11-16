package es.studium.ejercicio12;

public class Cuenta
{
	private String numeroCuenta;
	private double saldo;
	private Cliente cliente;
	
	public Cuenta()
	{
		numeroCuenta = "";
		saldo = 0.0;
		cliente = new Cliente ();
	}

	public Cuenta(String numeroCuenta, double cash, Cliente client)
	{
		this.numeroCuenta = numeroCuenta;
		this.saldo = cash;
		this.cliente = client;
	}

	public String getNumeroCuenta()
	{
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
	
	
	
}
