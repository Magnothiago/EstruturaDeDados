package listaVetores;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Uniao an = new Uniao();
		int[] a = new int[5];
		int[] b = new int[5];

		System.out.println("Digite os valores do vetor A");
		for (int i = 0; i < a.length; i++) {
			a[i] = teclado.nextInt();
		}

		System.out.println("");

		System.out.println("Digite os valores do vetor B");
		for (int i = 0; i < b.length; i++) {
			b[i] = teclado.nextInt();
		}

		System.out.println(an.uniao(a, b));
	}

}
