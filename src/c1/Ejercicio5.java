package c1;

public class Ejercicio5 {

	/**
	 * Explique y ejemplifique con código Java el concepto de negación binaria
	 * (NOT). Escriba la tabla de verdad para dicho concepto. El ejemplo deberá ser
	 * aplicado y no conceptual (las variables deben tener sentido).
	 */

	public static void main(String[] args) {

		int faltas = 4;
		int clases = 12;
		
		boolean regular = !(faltas > clases * 0.75);
		
		System.out.println(regular); // true
		
	}

}
