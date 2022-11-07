package utils;

public enum Color {
	BLANCO("B"), NEGRO("N");
	
	private String mini;

	Color(String mini) {
		this.mini = mini;
	}
	
	@Override
	public String toString() {
		return this.mini;
	}
}
