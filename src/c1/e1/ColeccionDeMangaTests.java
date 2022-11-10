package c1.e1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ColeccionDeMangaTests {
	@Test(expected = Error.class)
	public void ColeccionDeMangaConCapacidadNegativa() {
		new ColeccionDeManga(-1);
	}
	
	@Test(expected = Error.class)
	public void ingresarTomoConCeroPaginas() {
		ColeccionDeManga coleccionDeManga = new ColeccionDeManga(1);
		coleccionDeManga.agregarTomo("Death Note I", 0);
	}
	
	@Test(expected = Error.class)
	public void obtenerPaginasDeUnTomoInexistente() {
		ColeccionDeManga coleccionDeManga = new ColeccionDeManga(5);
		coleccionDeManga.agregarTomo("Death Note I", 5);
		coleccionDeManga.obtenerPaginasParaTomo("Death Note II");
	}
	
	@Test(expected = Error.class)
	public void tiempoParaLlegarAUnTomoInexistente() {
		ColeccionDeManga coleccionDeManga = new ColeccionDeManga(5);
		coleccionDeManga.agregarTomo("Death Note I", 5);
		coleccionDeManga.tiempoParaLlegarATomo(2);
	}
	
	@Test
	public void obtenerPaginasDeUnTomo() {
		ColeccionDeManga coleccionDeManga = new ColeccionDeManga(5);
		coleccionDeManga.agregarTomo("Death Note I", 5);
		coleccionDeManga.agregarTomo("Death Note II", 15);
		
		assertEquals(15,coleccionDeManga.obtenerPaginasParaTomo("Death Note II"));
	}
	
	@Test
	public void obtenerCantidadDeTomos() {
		ColeccionDeManga coleccionDeManga = new ColeccionDeManga(5);
		coleccionDeManga.agregarTomo("Death Note I", 5);
		coleccionDeManga.agregarTomo("Death Note II", 15);
		coleccionDeManga.agregarTomo("Death Note III", 108);
		
		assertEquals(3,coleccionDeManga.cantidadDeTomos());
	}
	
	@Test
	public void testTiempoParaLlegarATomo() {
		ColeccionDeManga coleccionDeManga = new ColeccionDeManga(5);
		coleccionDeManga.agregarTomo("Death Note I", 120);
		coleccionDeManga.agregarTomo("Death Note II", 124);
		coleccionDeManga.agregarTomo("Death Note III", 108);
		
		assertEquals(0, coleccionDeManga.tiempoParaLlegarATomo(1));
		assertEquals(120, coleccionDeManga.tiempoParaLlegarATomo(2));
		assertEquals(244, coleccionDeManga.tiempoParaLlegarATomo(3));
	}

}
