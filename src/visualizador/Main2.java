package visualizador;

import java.awt.Color;

import c3.Ejercicio4;
import utils.EjercicioLienzo;

public class Main2 {
	public static final int DIMENSION = 9;

	public static final int ANCHO_MAX_PANTALLA = 900;
	public static final int TAM_CELDA = ANCHO_MAX_PANTALLA / DIMENSION;
	public static Color[][] lienzo;

	
	public static void main(String[] args) {
		lienzo = new Color[DIMENSION][DIMENSION];

		EjercicioLienzo e = new Ejercicio4();
		lienzo = e.nuevoLienzo(DIMENSION);
		e.pintarLienzo(lienzo, new Color(100, 100, 200));

		new Frame();
	}
}