package listaVetores;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] a = new int[5];
		int valor;
		System.out.println("Digite um n�mero! ");
		for (int i = 0; i < a.length; i++) {
			valor = teclado.nextInt();
			for (int j = 0; j < a.length; j++) {

				if (valor == a[j]) {
					System.out.println("Esse n�mero j� foi digitado antes, digite um novo n�mero");
					j = 0;
					i--;
					break;
				} else {

					a[i] = valor;
					break;
				}
			}

		}
		teclado.close();

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
