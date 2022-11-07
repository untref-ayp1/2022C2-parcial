package c2.e1;

public class Ticket {

	private String patente;
	private int estadiaEnMinutos;
	
	public Ticket(String patente, int estadiaEnMinutos) {
		super();
		this.patente = patente;
		this.estadiaEnMinutos = estadiaEnMinutos;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getEstadiaEnMinutos() {
		return estadiaEnMinutos;
	}

	public void setEstadiaEnMinutos(int estadiaEnMinutos) {
		this.estadiaEnMinutos = estadiaEnMinutos;
	}
}
