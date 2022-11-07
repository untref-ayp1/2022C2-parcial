package c1.e1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColeccionDeMangaTests {

	@Test
	public void testTiempoParaLlegarATomo() {
		ColeccionDeManga coleccion = new ColeccionDeManga(5);
		coleccion.agregarTomo("Death Note I", 120);
		coleccion.agregarTomo("Death Note II", 124);
		coleccion.agregarTomo("Death Note III", 108);
		
		assertEquals(0, coleccion.tiempoParaLlegarATomo(1));
		assertEquals(120, coleccion.tiempoParaLlegarATomo(2));
		assertEquals(244, coleccion.tiempoParaLlegarATomo(3));
	}

}
