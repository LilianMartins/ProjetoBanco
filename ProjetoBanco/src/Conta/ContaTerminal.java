package Conta;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Sejam muito bem vindos ao Banco!");
		
		System.out.println("Por favor, digite o número da conta: ");
		numeroConta = scanner.nextInt();
		
		System.out.println("Por favor digite o número da agência: ");
		agencia = scanner.next();
		
		System.out.println("Por favor digite nome do cliente: ");
		nomeCliente = scanner.next();
		
		System.out.println("Por favor digite Saldo Inicial: ");
		saldo = scanner.nextDouble();
		
		
		System.out.println("Olá, " + nomeCliente + " Obrigada por criar uma conta no nosso Banco, sua agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo: " + saldo + " já está disponível para saque!");
	}

}
