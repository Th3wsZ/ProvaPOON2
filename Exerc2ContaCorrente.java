package Exerc2;

public class Exerc2ContaCorrente implements Exerc2Conta {
	
	private double saldo;
	
	public Exerc2ContaCorrente(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void sacar(double valor) {
		double taxa = valor * (20/100);
		double total = valor + taxa;
		
		if(valor > 0 && valor <= saldo) {
			saldo -= total;
		}
		else {
			System.out.println("Ação inválida!");
		}
	}

	@Override
	public void depositar(double valor) {
		double taxa = valor * (20/100);
		
		if(valor > 0) {
			saldo = valor - taxa;
		}
		else {
			System.out.println("Valor de depósito deve ser positivo!");
		}
	}
	
	

}
