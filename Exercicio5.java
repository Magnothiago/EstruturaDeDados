package listaVetores;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] a = new double[1000];
		double maior = 0;
		double menor = 0;
		double total = 0;
		int contador = 0;
		Random gerador = new Random();

		System.out.println("Digite os valores do vetor");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (1 + Math.random() * 100);
			if (i == 0) {
				maior = a[i];
				menor = a[i];
			}
			if (a[i] > maior) {
				maior = a[i];
			}
			if (menor > a[i]) {
				menor = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			total += a[i];
			contador++;
		}
		System.out.println("O maior elemento é " + maior);
		System.out.println("O menor elemento é " + menor);
		System.out.println("A média dos valoes é " + (total / contador));
		System.out.println("A soma de todos os elementos do vetor é: " + total);
		System.out.println("");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		input.close();
	}
}
