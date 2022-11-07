package c3;

public class Ejercicio5 {

	/**
	 * Explique y ejemplifique con código Java el concepto de disyunción binaria
	 * (OR). Escriba la tabla de verdad para dicho concepto. El ejemplo deberá ser
	 * aplicado y no conceptual (las variables deben tener sentido).
	 */
	
	public static void main(String[] args) {
		int ausentes = 5;
		int clases = 12;
		boolean librePorFaltas = ausentes > clases * 0.75;
		
		boolean apruebaTP = true;
		
		boolean cursaMateria = librePorFaltas || !apruebaTP;

		System.out.println(cursaMateria);
	}
}
