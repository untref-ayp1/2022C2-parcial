package utils;

public enum Color2 {
	BLANCO("B"), NEGRO("N");
	
	private String mini;

	Color2(String mini) {
		this.mini = mini;
	}
	
	@Override
	public String toString() {
		return this.mini;
	}
}
