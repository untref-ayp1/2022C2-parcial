package c1;

import utils.Color;
import utils.EjercicioLienzo;

public class Ejercicio4 extends EjercicioLienzo {
	public void pintarLienzo(Color[][] lienzo, Color pincel) {
	    for (int i = 0; i < lienzo.length; i++) {
			for (int j = 0; j < lienzo[i].length; j++) {
				if ((i + j) % 2 == 0)
					lienzo[i][j] = pincel;
			}
		}
	}
	
	public static void main(String[] args) {
		new Ejercicio4().probar(7);
	}
}
