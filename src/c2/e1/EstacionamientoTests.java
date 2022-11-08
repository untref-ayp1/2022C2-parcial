package c2.e1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EstacionamientoTests {

	@Test(expected = Error.class)
	public void estacionamientoConCapacidadNegativa() {
		Estacionamiento estacionamiento = new Estacionamiento(-1);
	}

	@Test(expected = Error.class)
	public void obtenerPatenteEnUnaPosicionNoOcupada() {
		Estacionamiento estacionamiento = new Estacionamiento(5);
		estacionamiento.obtenerPatente(1);
	}

	@Test(expected = Error.class)
	public void ingresarAutoConEstadiaCero() {
		Estacionamiento estacionamiento = new Estacionamiento(5);
		estacionamiento.ingresarAuto("ABC123", 0);
	}

	@Test
	public void obtenerPatenteEnLaSegundaPosicion() {
		Estacionamiento estacionamiento = new Estacionamiento(5);
		estacionamiento.ingresarAuto("ABC123", 5);
		estacionamiento.ingresarAuto("ABC124", 3);
		assertEquals("ABC124", estacionamiento.obtenerPatente(2));
	}

	@Test
	public void ingresaronTresAutos() {
		Estacionamiento estacionamiento = new Estacionamiento(5);
		estacionamiento.ingresarAuto("ABC123", 5);
		estacionamiento.ingresarAuto("ABC124", 3);
		estacionamiento.ingresarAuto("ABC125", 1);
		assertEquals(3, estacionamiento.cantidadDeAutos());
	}

	@Test
	public void recaudacionDeTresAutos() {
		Estacionamiento estacionamiento = new Estacionamiento(5);
		estacionamiento.ingresarAuto("ABC123", 5);
		estacionamiento.ingresarAuto("ABC124", 3);
		estacionamiento.ingresarAuto("ABC125", 12);
		assertEquals(40, estacionamiento.dineroRecaudado());
	}

}
