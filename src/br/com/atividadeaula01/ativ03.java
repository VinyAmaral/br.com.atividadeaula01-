package br.com.atividadeaula01;

	import java.util.Scanner;

public class ativ03 {
	public static void main (String args []) {
		
		Scanner leia = new Scanner (System.in);

		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Sua categoria �: Infantil");
				
		}
		
		else if(idade>=15 && idade<=17) {
			System.out.println("Sua categoria �: Juvenil");
		}
		
		else if(idade>=18 && idade<=25) {
			System.out.println("Sua categoria �: Adulto");
		}	
		
		else{
			System.out.println("Idade inv�lida");
		}
		
		leia.close();
		
}
	
}
