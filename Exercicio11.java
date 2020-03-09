package listaVetores;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] vet = new int[10];
		int num = 0;
		int contador = 0;
		System.out.println("Digite números no intervaldo de 0 e 50");

		while (contador < 10) {
			num = teclado.nextInt();
			if (!(num < 0 || num > 50)) {
				vet[contador] = num;
				contador++;
			} else {
				System.out.println("Digite outro número ");

			}

		}

		teclado.close();
	}

}
