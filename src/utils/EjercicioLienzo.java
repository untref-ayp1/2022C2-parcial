package utils;

import java.awt.Color;
import java.util.Arrays;

public abstract class EjercicioLienzo {
	public abstract void pintarLienzo(Color[][] lienzo, Color pincel);
	
	protected void probar(int n) {
		Color[][] lienzo = nuevoLienzo(n);
		pintarLienzo(lienzo, Color.BLACK);
		imprimir(lienzo);
	}

	protected void imprimir(Color[][] lienzo) {
		for (Color[] colors : lienzo) {
			System.out.println(Arrays.toString(colors));
		}
		
	}

	public Color[][] nuevoLienzo(int n) {
		Color[][] retorno = new Color[n][n];
		for (int i = 0; i < retorno.length; i++) {
			for (int j = 0; j < retorno[i].length; j++) {
				retorno[i][j] = Color.WHITE;
			}
		}
		return retorno;
	}
}
