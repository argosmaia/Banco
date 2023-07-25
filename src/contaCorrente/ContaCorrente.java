package contaCorrente;

import contaBancaria.ContaBancaria;

public class ContaCorrente implements ContaBancaria {
	private String agencia;
    private String numeroConta;
    private String nomeCliente;
    private double saldo;
    private double limite;
    private int score;
    
    
	/**
	 * @param agencia
	 * @param numeroConta
	 * @param nomeCliente
	 * @param saldo
	 * @param limite
	 * @param score
	 */
	public ContaCorrente(String agencia, String numeroConta, String nomeCliente, double saldo, double limite,
			int score) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		this.limite = limite;
		this.score = score;
	}

	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the numeroConta
	 */
	public String getNumeroConta() {
		return numeroConta;
	}

	/**
	 * @param numeroConta the numeroConta to set
	 */
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * @param nomeCliente the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * @return the limite
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * @param limite the limite to set
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

	@Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
    public void pagarConta(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Pagamento realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para pagamento.");
        }
    }
	
	// Método para verificar se o cliente possui crédito baseado no score
    public boolean possuiCredito() {
        return (limite > 0 && score >= 0);
    }
}
