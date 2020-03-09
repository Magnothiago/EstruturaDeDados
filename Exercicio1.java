package listaVetores;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] a = new int[10];

		System.out.println("Digite um número ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}

		System.out.println("____________________________");
		System.out.println("");

		for (int i = 0; i < 5; i++) {

			int aux1 = a[i];
			int aux = a[9 - i];
			a[9 - i] = aux1;
			a[i] = aux;
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		input.close();
	}

}
