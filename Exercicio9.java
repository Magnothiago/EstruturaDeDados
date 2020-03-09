package listaVetores;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int comparar = 0;
		int l;

		System.out.println("Digite os valores do vetor A");
		for (int i = 0; i < a.length; i++) {
			a[i] = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("Digite os valores do vetor A");
		for (int i = 0; i < b.length; i++) {
			b[i] = teclado.nextInt();
		}

		for (int i = 0; i < c.length; i++) {
			comparar = a[i];

			for (int j = 0; j < c.length; j++) {
				if (comparar == b[j]) {

					for (int j2 = 0; j2 < c.length;) {
						if (!(comparar == c[j2])) {

							c[j] = comparar;
							break;
						}
						break;
					}

				}

			}

		}
		System.out.println("");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
