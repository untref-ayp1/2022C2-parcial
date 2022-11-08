package c1.e1;

public class ColeccionDeManga {
	private Tomo[] tomos;
	private int tomosTotales;
	private int cantidad;
	private int[] tiempos;

	/**
	 * Se construya a partir de la cantidad de tomos que tiene. Agregue un tomo,
	 * indicando nombre y la cantidad de páginas que contiene. Como toda colección
	 * de Manga, se agrega de derecha a izquierda. Devuelva la cantidad de páginas
	 * de un tomo dado su nombre. Cuente la cantidad de tomos en la colección.
	 * Calcule el tiempo que se tardará en llegar al tomo en la posición `x`,
	 * asumiendo que se lee una página por minuto y debo leer todos los tomos a la
	 * derecha del que deseo leer, antes de llegar a dicho tomo. ¡No quiero perderme
	 * ni un capítulo!
	 */

	// ACLARACION: Almacenar el arreglo de izquierda a derecha o viceversa,
	// es totalmente transparente para el usuario de nuestra clase.
	// Esto tiene que ver con el concepto de encapsulamiento.
	// No se penaliza ninguna conducta, pero era mas simple pensarlo L2R.

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public ColeccionDeManga(int tomos) {
		if (tomos < 1) {
			throw new Error("Una coleccion necesita al menos un tomo");
		}
		this.tomosTotales = tomos;
		this.tomos = new Tomo[tomos];
		this.tiempos = new int[tomos];
	}

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public void agregarTomo(String titulo, int paginas) {
		if (paginas < 1) {
			throw new Error("Un tomo necesita tener paginas");
		}
		if (this.cantidad == this.tomosTotales) {
			throw new Error("Coleccion completa");
		}
		this.tomos[this.cantidad++] = new Tomo(titulo, paginas);
		this.tiempos[this.cantidad] = paginas + this.tiempos[this.cantidad - 1];
	}

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public int obtenerPaginasParaTomo(String titulo) {
		boolean encontrado = false;
		int indiceTomo = 0;
		while (indiceTomo < cantidad && !encontrado) {
			if (tomos[indiceTomo].getTitulo().equals(titulo)) {
				encontrado = true;
			}
			indiceTomo++;
		}
		if (!encontrado) {
			throw new Error("No se encontro dicho tomo");
		}
		return tomos[indiceTomo - 1].getPaginas();
	}

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public int cantidadDeTomos() {
		return this.cantidad;
	}

	/*
	 * @pre:
	 * 
	 * @post:
	 */
	public int tiempoParaLlegarATomo(int tomo) {
		if (tomo < 1 || tomo > this.cantidad) {
			throw new Error("No existe un tomo en dicha posicion");
		}
		return this.tiempos[tomo - 1];
	}
}
