package listaVetores;

public class Uniao {

	public int uniao(int[] x, int[] y) {

		int[] resp = new int[10];
		int contador = 0;

		externo1: for (int i = 0; i < y.length; i++) {

			externo2: for (int j = 0; j < y.length; j++) {

				if (x[i] == y[j]) {
					int verificar = x[i];
					externo3: for (int k = 0; k < resp.length; k++) {
						if ((verificar == resp[k])) {
							k = 0;
							break externo2;

						} else {
							resp[contador] = verificar;
							contador++;
							k = 0;
							break;

						}
					}

				}

			}
		}

		for (int j = 0; j < resp.length; j++) {

			int a = resp[j];
			return 0;

		}
		return contador;
	}

}
