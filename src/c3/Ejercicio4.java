package c3;

import java.awt.Color;

import utils.EjercicioLienzo;

public class Ejercicio4 extends EjercicioLienzo {

	public void pintarLienzo(Color[][] lienzo, Color pincel) {
		for (int k = 0; k < lienzo.length / 2 + 1; k+=2) {
			for (int i = k; i < lienzo.length - k; i++) {
				lienzo[k][i] = pincel;
				lienzo[i][k] = pincel;
				lienzo[lienzo.length - k - 1][lienzo.length - i - 1] = pincel;
				lienzo[lienzo.length - i - 1][lienzo.length - k - 1] = pincel;
			}
		}
	}

	public static void main(String[] args) {
		new Ejercicio4().probar(7);
	}
}
