package br.com.atividadeaula01;

import java.util.Scanner;
import java.lang.Math;

public class ativi04 {
	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int num;
		double divis�o, resto, quadrado, raiz;
		
		System.out.println("Escreva um n�mero");
		num = leia.nextInt();
				
		divis�o = num/2;
		resto = num%2;
		
		if(resto!=0) {
			System.out.println("Este n�mero � �mpar.");
			quadrado= num*num;
			System.out.println("\nO quadrado deste n�mero �: " + quadrado);
		}
		
		else {
			System.out.println("Este n�mero � par.");
			raiz = Math.sqrt (num);
			System.out.println("\nA raiz do n�mero �: " + raiz);
		}
		
	
		leia.close();
	}

}
