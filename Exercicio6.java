package listaVetores;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] a = new double[10];
		double[] b = new double[10];

		System.out.println("Digite os elemenos do vetor. ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextDouble();
		}

		for (int i = 0; i < b.length; i++) {
			b[i] = (Math.pow(a[i], 2));

		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		input.close();
	}

}
