package listaVetores;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] x = new int[5];
		int[] y = new int[5];
		int[] c = new int[5];
		int[] d = new int[5];
		int soma = 0;
		int produto = 0;
		int contador = 0;
		int comparar = 0;
		int num = 0;
		System.out.println("Digite os valores do vetor X");
		for (int i = 0; i < x.length; i++) {
			x[i] = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("Digite os valores do vetor Y");
		for (int i = 0; i < y.length; i++) {
			y[i] = teclado.nextInt();
		}
		// soma
		for (int i = 0; i < c.length; i++) {
			soma += (x[i] + y[i]);
		}
		// produto
		for (int i = 0; i < c.length; i++) {
			produto += (x[i] * y[i]);
		}
		// intercecçao
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (x[i] == y[j]) {
					c[j] = x[i];
				}
			}
		}
		// diferença
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				
				if (x[i] != y[j]) {
					c[i]=x[i];
					
				}
			}
		}
		System.out.println("");
		System.out.println("Soma entre X e Y " + soma);
		System.out.println("Produto entre X e Y " + produto);
		System.out.println("Interceccão entre X e Y");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);

		}
		System.out.println("Diferença entre o vetor X e Y");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}
}
