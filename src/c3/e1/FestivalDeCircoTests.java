package c3.e1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FestivalDeCircoTests {

	@Test(expected = Error.class)
	public void festivalDeCircoConCapacidadNegativa() {
		new FestivalDeCirco(-1,3);
	}
	
	@Test(expected = Error.class)
	public void festivalDeCircoConEspectaculosNegativos() {
		FestivalDeCirco festivalDeCirco = new FestivalDeCirco(1,-13);
	}
	
	@Test(expected = Error.class)
	public void ingresarAsistenteConCeroEspectaculos() {
		FestivalDeCirco festivalDeCirco = new FestivalDeCirco(5,3);
		festivalDeCirco.agregarAsistente("Lucas V", 0);
	}
	
	@Test(expected = Error.class)
	public void ingresarMasAsistenteQueLaCapacidad() {
		FestivalDeCirco festivalDeCirco = new FestivalDeCirco(1,5);
		festivalDeCirco.agregarAsistente("Lucas V", 5);
		festivalDeCirco.agregarAsistente("Leo B", 5);
	}
	
	@Test(expected = Error.class)
	public void obtenerCantidadDeEspectaculosDeUnAsistenteInexistente() {
		FestivalDeCirco festivalDeCirco = new FestivalDeCirco(5,3);
		festivalDeCirco.agregarAsistente("Lucas V", 5);
		festivalDeCirco.obtenerEspectaculos("Leo B");
	}
	
	@Test
	public void obtenerCantidadDeEspectaculosDeAsistentes() {
		FestivalDeCirco festivalDeCirco = new FestivalDeCirco(5,20);
		festivalDeCirco.agregarAsistente("Lucas V", 10);
		festivalDeCirco.agregarAsistente("Leo B", 2);

		assertEquals(10, festivalDeCirco.obtenerEspectaculos("Lucas V"));
		assertEquals(2, festivalDeCirco.obtenerEspectaculos("Leo B"));
	}

	@Test
	public void ingresaronTresAsistentes() {
		FestivalDeCirco festivalDeCirco = new FestivalDeCirco(5,10);
		festivalDeCirco.agregarAsistente("Lucas V", 10);
		festivalDeCirco.agregarAsistente("Leo B", 2);
		festivalDeCirco.agregarAsistente("Fede G", 5);

		assertEquals(3, festivalDeCirco.cantidadDeAsistentes());
	}

	@Test
	public void recaudacionDeTresAsistentes() {
		FestivalDeCirco festivalDeCirco = new FestivalDeCirco(5,10);
		festivalDeCirco.agregarAsistente("Lucas V", 10);
		festivalDeCirco.agregarAsistente("Leo B", 2);
		festivalDeCirco.agregarAsistente("Fede G", 5);
		
		assertEquals(34, festivalDeCirco.dineroRecaudado());
	}


}
