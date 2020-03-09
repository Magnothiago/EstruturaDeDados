package listaVetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valor;
		int contA = 0;
		int contB = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];

		System.out.println("Digite os números ");

		for (int i = 0; i < c.length; i++) {

			valor = input.nextInt();

			if (i < 10) {
				a[contA] = valor;
				contA++;
			} else if (i >= 10) {
				b[contB] = valor;
				contB++;
			}
		}
		contA = 0;
		contB = 0;
		for (int i = 0; i < c.length; i++) {

			if (i % 2 == 0) {
				c[i] = a[contA];
				contA++;
			} else if (!(i % 2 == 0)) {
				c[i] = b[contB];
				contB++;
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("___");
		System.out.println("");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("");

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		input.close();

	}

}
