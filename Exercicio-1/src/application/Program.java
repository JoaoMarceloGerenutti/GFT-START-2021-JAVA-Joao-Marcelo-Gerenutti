package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int maior;
		int menor;
		
		System.out.println("DIGITE 3 NÚMEROS");
		System.out.print("Número #1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Número #2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Número #3: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
			if (num2 > num3) {
				menor = num3;
			} else if (num3 > num2) {
				menor = num2;
			} else {
				menor = num2;
			}
			System.out.printf("Maior número: %d \n", maior);
			System.out.printf("Menor número: %d \n", menor);
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
			if (num1 > num3) {
				menor = num3;
			} else if (num3 > num1) {
				menor = num1;
			} else {
				menor = num1;
			}
			System.out.printf("Maior número: %d \n", maior);
			System.out.printf("Menor número: %d \n", menor);
		} else if (num3 > num1 && num3 > num2) {
			maior = num3;
			if (num1 > num2) {
				menor = num2;
			} else if (num2 > num1) {
				menor = num1;
			} else {
				menor = num1;
			}
			System.out.printf("Maior número: %d \n", maior);
			System.out.printf("Menor número: %d \n", menor);
		} else if (num1 == num2 && num1 == num3) {
			maior = num1;
			menor = num1;
			System.out.println("Os tres valores são iguais!");
		} else {
			System.out.printf("Maior número: %d \n", num1);
			System.out.printf("Menor número: %d \n", num3);
		}
		sc.close();
	}

}
