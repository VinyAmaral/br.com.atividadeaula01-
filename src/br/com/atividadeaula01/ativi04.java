package br.com.atividadeaula01;

import java.util.Scanner;
import java.lang.Math;

public class ativi04 {
	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int num;
		double divisão, resto, quadrado, raiz;
		
		System.out.println("Escreva um número");
		num = leia.nextInt();
				
		divisão = num/2;
		resto = num%2;
		
		if(resto!=0) {
			System.out.println("Este número é ímpar.");
			quadrado= num*num;
			System.out.println("\nO quadrado deste número é: " + quadrado);
		}
		
		else {
			System.out.println("Este número é par.");
			raiz = Math.sqrt (num);
			System.out.println("\nA raiz do número é: " + raiz);
		}
		
	
		leia.close();
	}

}
