package c3;

import utils.Color;
import utils.EjercicioLienzo;

public class Ejercicio4 extends EjercicioLienzo {

	@Override
	public void pintarLienzo(Color[][] lienzo, Color pincel) {
		for (int k = 0; k < lienzo.length / 2 + 1; k += 2) {
			for (int i = k; i < lienzo.length - k; i++) {
				lienzo[k][i] = pincel;
				lienzo[lienzo.length - k - 1][i] = pincel;
				lienzo[i][k] = pincel;
				lienzo[i][lienzo.length - k - 1] = pincel;
			}
		}
	}

	public static void main(String[] args) {
		new Ejercicio4().probar(7);
	}
}
