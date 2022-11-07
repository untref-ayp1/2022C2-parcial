package c3.e1;

public class Asistente {

	private String nombre;
	private int entradas;

	public Asistente(String nombre, int entradas) {
		super();
		this.nombre = nombre;
		this.entradas = entradas;
	}

	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
