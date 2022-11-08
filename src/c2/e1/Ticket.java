package c2.e1;

public class Ticket {

	private String patente;
	private int estadiaEnMinutos;

	public Ticket(String patente, int estadiaEnMinutos) {
		this.patente = patente;
		this.estadiaEnMinutos = estadiaEnMinutos;
	}

	public String getPatente() {
		return patente;
	}

	public int getEstadiaEnMinutos() {
		return estadiaEnMinutos;
	}

}
