package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int maior;
		int menor;
		
		System.out.println("DIGITE 3 N�MEROS");
		System.out.print("N�mero #1: ");
		int num1 = sc.nextInt();
		
		System.out.print("N�mero #2: ");
		int num2 = sc.nextInt();
		
		System.out.print("N�mero #3: ");
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
			System.out.printf("Maior n�mero: %d \n", maior);
			System.out.printf("Menor n�mero: %d \n", menor);
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
			if (num1 > num3) {
				menor = num3;
			} else if (num3 > num1) {
				menor = num1;
			} else {
				menor = num1;
			}
			System.out.printf("Maior n�mero: %d \n", maior);
			System.out.printf("Menor n�mero: %d \n", menor);
		} else if (num3 > num1 && num3 > num2) {
			maior = num3;
			if (num1 > num2) {
				menor = num2;
			} else if (num2 > num1) {
				menor = num1;
			} else {
				menor = num1;
			}
			System.out.printf("Maior n�mero: %d \n", maior);
			System.out.printf("Menor n�mero: %d \n", menor);
		} else if (num1 == num2 && num1 == num3) {
			maior = num1;
			menor = num1;
			System.out.println("Os tres valores s�o iguais!");
		} else {
			System.out.printf("Maior n�mero: %d \n", num1);
			System.out.printf("Menor n�mero: %d \n", num3);
		}
		sc.close();
	}

}
