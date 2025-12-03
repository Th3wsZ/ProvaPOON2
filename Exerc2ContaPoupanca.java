package Exerc2;

public class Exerc2ContaPoupanca implements Exerc2Conta {
	
	private double saldo;
	
	public Exerc2ContaPoupanca(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
		}
		else {
			System.out.println("Ação inválida!");
		}
	}

	@Override
	public void depositar(double valor) {
		if(valor > 0) {
		saldo += valor;
		}
		else {
			System.out.println("Valor de depósito deve ser positivo!");
		}
		
	}
	
	

}
