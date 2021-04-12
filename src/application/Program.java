package application;

//import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account;
	
	System.out.println("Numero da Conta: ");
	int number = sc.nextInt();
	System.out.println("Nome do Titular: ");
	sc.nextLine();
	String holder = sc.nextLine();
	System.out.print("Tem deposito inicial?(S/N) ");
	char response = sc.next().charAt(0);
	
	if (response == 'S') {
		System.out.println("Digite o valor deposito ");
		double initialDeposit = sc.nextDouble();
		account = new Account(number, holder, initialDeposit);
	} else {
		account = new Account (number,holder);
	}
	
		
	System.out.println();
	System.out.println("Dados da Conta: ");
	System.out.println(account);
	
	System.out.println();
	
	System.out.println("Insira Valor do Deposito: ");
	double depositValue = sc.nextDouble();
	account.deposit(depositValue);
	
	System.out.println();
	System.out.println("Valor da Conta Atualizado: " + account);
	
	System.out.println("Insira Valor da Retirada: ");
	double withDrawValue = sc.nextDouble();
	account.withDraw(withDrawValue);
	
	System.out.println();
	System.out.println("Valor da Conta Atualizado: " + account);
	
	
	sc.close();
	
	
	}
	
	

}
