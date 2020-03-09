package listaVetores;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] a = new int[10];
		int contador = 0;
		System.out.println("Digite os valores do vetor! ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				contador++;
			}
		}
		System.out.println("A quantidade de números pares é: " + contador);

		input.close();
	}
}
