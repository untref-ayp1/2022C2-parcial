package c1;

import utils.Color;
import utils.EjercicioLienzo;

public class Ejercicio4 extends EjercicioLienzo {

	public void pintarLienzo(Color[][] lienzo, Color pincel) {
		for (int i = 0; i < lienzo.length; i++)
			for (int j = 0; j < lienzo.length; j++)
				if ((i + j) % 2 == 0)
					lienzo[i][j] = pincel;
	}

	public void pintarLienzoV2(Color[][] lienzo, Color pincel) {
		for (int i = 0; i < lienzo.length; i++)
			for (int j = 0; j < lienzo.length; j++)
				if (i % 2 == j % 2)
					lienzo[i][j] = pincel;
	}

	public void pintarLienzoV3(Color[][] lienzo, Color pincel) {
		int paridad = 0;
		for (int i = 0; i < lienzo.length; i++)
			for (int j = 0; j < lienzo.length; j++) {
				if (paridad % 2 == 0)
					lienzo[i][j] = pincel;
				paridad++;
			}
	}

	public void pintarLienzoV4(Color[][] lienzo, Color pincel) {
		for (int i = 0; i < lienzo.length; i++)
			for (int j = 0; j < lienzo.length; j++)
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0))
					lienzo[i][j] = pincel;
	}

	public void pintarLienzoV5(Color[][] lienzo, Color pincel) {
		for (int i = 0; i < lienzo.length; i++)
			if (i % 2 == 0)
				for (int j = 0; j < lienzo.length; j += 2)
					lienzo[i][j] = pincel;
			else
				for (int j = 1; j < lienzo.length; j += 2)
					lienzo[i][j] = pincel;
	}

	public void pintarLienzoV6(Color[][] lienzo, Color pincel) {
		for (int i = 0; i < lienzo.length; i++)
			for (int j = i % 2; j < lienzo.length; j += 2)
				lienzo[i][j] = pincel;
	}

	public void pintarLienzoV7(Color[][] lienzo, Color pincel) {
		for (int i = 0; i < Math.pow(lienzo.length, 2); i += 2)
			lienzo[i / lienzo.length][i % lienzo.length] = pincel;
	}

	public static void main(String[] args) {
		new Ejercicio4().probar(7);
	}

}
