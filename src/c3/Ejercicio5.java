package c3;

public class Ejercicio5 {

	/**
	 * Explique y ejemplifique con código Java el concepto de disyunción binaria
	 * (OR). Escriba la tabla de verdad para dicho concepto. El ejemplo deberá ser
	 * aplicado y no conceptual (las variables deben tener sentido).
	 */
	
	
//	Operacion entre variables del tipo booleano tal que se hace verdadera
//	cuando al menos uno de sus operandos es verdadero.
//	
//	X | Y | X or Y
//	V   V     V
//	V   F     V
//	F   V     V
//	F   F     F
	
	public static void main(String[] args) {
		int ausentes = 5;
		int clases = 12;
		int presentes = clases - ausentes;
		
		boolean librePorFaltas = presentes < clases * 0.75;
		
		boolean apruebaTP = true;
		
		boolean pierdeMateria = librePorFaltas || !apruebaTP;

		System.out.println(pierdeMateria);
	}
}
