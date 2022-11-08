package c2;

import utils.Color;
import utils.EjercicioLienzo;

public class Ejercicio4 extends EjercicioLienzo {

	@Override
	public void pintarLienzo(Color[][] lienzo, Color pincel) {
		for (int i = 0; i < lienzo.length; i++) {
			for (int j = 0; j < lienzo[i].length; j++) {
				if (i != lienzo.length / 2 && j != lienzo.length / 2) {
					lienzo[i][j] = pincel;
				}
			}
		}
	}

	public void pintarLienzoV2(Color[][] lienzo, Color pincel) {
		for (int i = 0; i < lienzo.length / 2; i++) {
			for (int j = 0; j < lienzo[i].length / 2; j++) {
				lienzo[i][j] = pincel;
			}
		}
		for (int i = 0; i < lienzo.length / 2; i++) {
			for (int j = lienzo.length / 2 + 1; j < lienzo[i].length; j++) {
				lienzo[i][j] = pincel;
			}
		}
		for (int i = lienzo.length / 2 + 1; i < lienzo.length; i++) {
			for (int j = 0; j < lienzo[i].length / 2; j++) {
				lienzo[i][j] = pincel;
			}
		}
		for (int i = lienzo.length / 2 + 1; i < lienzo.length; i++) {
			for (int j = lienzo.length / 2 + 1; j < lienzo[i].length; j++) {
				lienzo[i][j] = pincel;
			}
		}
	}

	public void pintarLienzoV3(Color[][] lienzo, Color pincel) {
		for (int i = 0; i < lienzo.length / 2; i++) {
			for (int j = 0; j < lienzo[i].length / 2; j++) {
				lienzo[i][j] = pincel;
				lienzo[i + lienzo.length / 2 + 1][j] = pincel;
				lienzo[i][j + lienzo.length / 2 + 1] = pincel;
				lienzo[i + lienzo.length / 2 + 1][j + lienzo.length / 2 + 1] = pincel;
			}
		}
	}

	public static void main(String[] args) {
		new Ejercicio4().probar(7);
	}
}
