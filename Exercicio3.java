package listaVetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];

		System.out.println("Digite os valores do vetor a");
		for (int i = 0; i < c.length; i++) {
			a[i] = input.nextInt();
		}
		
		System.out.println("");
		System.out.println("Digite os valores do vetor b");
		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextInt();
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] * b[i];
		}

		System.out.println("Resultado da multiplicação do vetor A com o vetor B");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		input.close();
	}

}
