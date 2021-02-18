package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Um elefante incomoda muita gente!");
		
		System.out.print("Digite uma quantidade de elefante(s): ");
		int elefante = sc.nextInt();
		
		System.out.printf("%d elefantes ", elefante);
		for (int i = 0; i < elefante; i++) {
			System.out.print("Incomoda ");
		}
		System.out.println("muito mais");
		
		sc.close();
	}

}
