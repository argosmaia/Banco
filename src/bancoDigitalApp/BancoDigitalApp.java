/**
 * 
 */
package bancoDigitalApp;
import java.util.Scanner;
import contaCorrente.*;
import contaBancaria.*;
/**
 * @author argosmaia
 *
 */
public class BancoDigitalApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Informe o número da conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Informe o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o limite da conta:");
        double limite = scanner.nextDouble();

        System.out.println("Informe o score do cliente:");
        int score = scanner.nextInt();

        // Criando a conta bancária do cliente
        ContaCorrente contaCorrente = new ContaCorrente(agencia, numeroConta, nomeCliente, limite, score, score);

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Pagar Conta");
            System.out.println("4. Verificar Crédito");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            ContaCorrente contaBancaria = null;
            
			switch (opcao) {
                case 1:
                    System.out.print("Informe o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    contaBancaria.sacar(valorSaque);
                    break;

                case 2:
                    System.out.print("Informe o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    contaBancaria.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.print("Informe o valor da conta a pagar: ");
                    double valorPagamento = scanner.nextDouble();
                    contaBancaria.pagarConta(valorPagamento);
                    break;

                case 4:
                    if (contaBancaria.possuiCredito()) {
                        System.out.println("Cliente possui crédito.");
                    } else {
                        System.out.println("Cliente não possui crédito.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}