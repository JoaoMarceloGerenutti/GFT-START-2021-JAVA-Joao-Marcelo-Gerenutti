package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Divisao;
import entities.Multiplicacao;
import entities.Soma;
import entities.Subtracao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE 2 VALORES");
		System.out.print("Valor de X: ");
		double x = sc.nextDouble();
		
		System.out.print("Valor de Y: ");
		double y = sc.nextDouble();
		
		Soma soma = new Soma(x ,y);	
		soma.efetuarOperacao(x, y);
		System.out.println(soma);
		
		Subtracao subtracao = new Subtracao(x ,y);
		subtracao.efetuarOperacao(x, y);
		System.out.println(subtracao);
		
		Multiplicacao multiplicacao = new Multiplicacao(x ,y);
		multiplicacao.efetuarOperacao(x, y);
		System.out.println(multiplicacao);
		
		Divisao divisao = new Divisao(x ,y);
		divisao.efetuarOperacao(x, y);
		System.out.println(divisao);
		
		sc.close();
	}

}
