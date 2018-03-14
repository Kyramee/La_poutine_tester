package test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import poutine.Facture;

class testPoutine {
	Facture fMock = Mockito.mock(Facture.class);
	
	@Test
	void testAddListeClient() {
		this.fMock.addListeClients("Steven");
		Mockito.verify(this.fMock).addListeClients("Steven");
	}
	
	@Test
	void testAddListeNomPlats() {
		this.fMock.addListePlats("McCoke 11.99");
		Mockito.verify(this.fMock).addListePlats("McCoke 11.99");
	}
}
