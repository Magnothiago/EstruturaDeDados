package listaVetores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] a = new int[6];
		int soma = 0;
		System.out.println("Digite os valores do vetor ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				soma = a[i];
			}
			if (i == 1) {
				soma += a[i];
			}
			if (i == 5) {
				soma += a[i];
			}
		}
		System.out.println("A soma dos índices 1 2 e 5 é " + soma);
		System.out.println("Modificando o valor do índice 4 ");
		System.out.println("Digite o novo valor para ser armazenado índice ");

		for (int i = 0; i < a.length; i++) {
			if (i == 4) {
				a[i] = input.nextInt();
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);

		}

	}
}