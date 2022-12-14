package c3.e1;

/**
 * Se construya a partir de la cantidad máxima de asistentes que pueden asistir,
 * y la cantidad de espectáculos que se brindarán. Agregue un asistente,
 * indicando su nombre y la cantidad de espectáculos a los que concurrirá.
 * Devuelva la cantidad de espectáculos a los que concurrirá un asistente,
 * buscándolo por su nombre. Cuente la cantidad de asistentes. Calcule el dinero
 * total que ingresará, asumiendo que se cobra $2 por espectáculo al que se
 * asistirá.
 */

public class FestivalDeCirco {
	private int capacidad;
	private int espectaculos;
	private int cantidadAsistentes;
	private Asistente[] asistentes;
	private int ingresos;

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public FestivalDeCirco(int capacidad, int espectaculos) {
		if (capacidad < 1) {
			throw new Error("Debe haber cierta capacidad");
		}
		if (espectaculos < 1) {
			throw new Error("Debe brindarse al menos un espectaculo");
		}

		this.capacidad = capacidad;
		this.espectaculos = espectaculos;
		this.asistentes = new Asistente[capacidad];
	}

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public void agregarAsistente(String nombre, int entradas) {
		if (entradas < 1) {
			throw new Error("Al menos debe asistir a un espectaculo");
		}
		if (entradas > this.espectaculos) {
			throw new Error("No puede asistir a mas espectaculos que los disponibles");
		}
		if (this.cantidadAsistentes == this.capacidad) {
			throw new Error("No pueden admitirse mas asistentes");
		}

		this.asistentes[cantidadAsistentes++] = new Asistente(nombre, entradas);
		this.ingresos += entradas * 2;
	}

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public int obtenerEspectaculos(String nombre) {
		boolean encontrado = false;
		int indiceAsistente = 0;
		while (indiceAsistente < this.cantidadAsistentes && !encontrado) {
			if (asistentes[indiceAsistente].getNombre().equals(nombre)) {
				encontrado = true;
			}
			indiceAsistente++;
		}
		if (!encontrado) {
			throw new Error("No se encontro el asistente");
		}
		return asistentes[indiceAsistente - 1].getEntradas();
	}

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public int cantidadDeAsistentes() {
		return this.cantidadAsistentes;
	}

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public int dineroRecaudado() {
		return this.ingresos;
	}
}
