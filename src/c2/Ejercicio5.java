package c2;

public class Ejercicio5 {

	/**
	 * Explique y ejemplifique con código Java el concepto de conjunción binaria
	 * (AND). Escriba la tabla de verdad para dicho concepto. El ejemplo deberá ser
	 * aplicado y no conceptual (las variables deben tener sentido).
	 */
	
	public static void main(String[] args) {
		int notaParcial = 7;
		boolean apruebaParcial = notaParcial >= 4;
		
		boolean apruebaTP = true;
		
		boolean cursaMateria = apruebaParcial && apruebaTP;
		
		System.out.println(cursaMateria);
	}
}
