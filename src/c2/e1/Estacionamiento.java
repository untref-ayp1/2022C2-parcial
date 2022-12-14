package c2.e1;

public class Estacionamiento {

	private int cantidad;
	private Ticket[] tickets;
	private int recaudacion;
	private int capacidad;

	/**
	 * Se construya a partir de la cantidad máxima de autos que pueden ser alojados.
	 * Agregue un auto, indicando su patente y cuánto duró la estadía (en minutos).
	 * Devuelva la patente de un auto a partir de la posición.
	 * Cuente la cantidad de autos del día
	 * Calcule el dinero total que ingresó, asumiendo que se cobra $2 por minuto por auto.
	 */
	
	/*
	 * @pre:
	 * @post:
	 */
    public Estacionamiento(int capacidad) {
    	if (capacidad < 1) {
    		throw new Error("Debe haber alguna capacidad");
    	}
    	this.capacidad = capacidad;
    	this.tickets = new Ticket[capacidad];
    }

	/*
	 * @pre:
	 * @post:
	 */
	public void ingresarAuto(String patente, int estadiaEnMinutos) {
		if (estadiaEnMinutos < 1) {
			throw new Error("No puede quedarse menos de un minuto");
		}
		if (this.cantidad == this.capacidad) {
			throw new Error("Estacionamiento lleno");
		}
		this.tickets[this.cantidad++] = new Ticket(patente, estadiaEnMinutos);
		this.recaudacion += estadiaEnMinutos * 2;
	}

	/*
	 * @pre:
	 * @post:
	 */
	public String obtenerPatente(int posicion) {
		if (posicion < 1 || posicion > this.cantidad) {
			throw new Error("No existe dicha posicion");
		}
		return this.tickets[posicion - 1].getPatente();
	}

	/*
	 * @pre:
	 * @post:
	 */
	public int cantidadDeAutos() {
		return this.cantidad;
	}

	/*
	 * @pre:
	 * @post:
	 */
	public int dineroRecaudado() {
		return this.recaudacion;
	}
}
