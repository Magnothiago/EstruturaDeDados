package listaVetores;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] a = new double[5];
		int codigo = 0;
		System.out.println("Digite os valores. ");
		for (int i = 0; i < a.length; i++) {

			a[i] = input.nextDouble();
		}
		System.out.println("Digite 0 para finalizar o programa, 1 para mostrar o vetor na ordem digitada, "
				+ "2 para mostrar o vetor na ordem inversa.");
		codigo = input.nextInt();
		while (!(codigo == 0)) {

			if (codigo == 0) {
				break;
			}
			if (codigo == 1) {
				for (int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}

			}
			if (codigo == 2) {

				for (int i = a.length - 1; i > -1; i--) {
					System.out.println(a[i]);
				}

			}
			codigo = input.nextInt();
		}

	}

}
