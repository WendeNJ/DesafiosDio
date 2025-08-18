package DesafioBanco;

import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
	Scanner sc = new Scanner ( System.in);
	System.out.println("Por favor digite o nome do Cliente: ");
	String Cliente = sc.next();
	System.out.println("Digite o numero da Agencia: ");
	String Agencia = sc.next();
	System.out.println("Digite o numero da Conta: ");
	int numero = sc.nextInt();
	int saldo = 3459;
    
	System.out.format(  " Ola %s, obrigado por criar uma conta em nosso banco, sua Agencia e %s, e o numero da conta e %d, o Salddo disponivel para saque e : " + saldo , Cliente, Agencia, numero );
	
	
	}

}
