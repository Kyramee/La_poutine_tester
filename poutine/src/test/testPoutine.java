package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


import poutine.Facture;

class testPoutine {
	Facture f = new Facture();
	
	@Test
	void testAddListeClient() {
		this.f.addListeClients("Steven");
		assertEquals("Steven", this.f.getListeClients().get(0));
	}
	
	@Test
	void testAddListePlats() {
		this.f.addListePlats("McCoke 11.99");
		assertEquals("McCoke", this.f.getListeNomPlats().get(0));
		assertEquals("11.99", this.f.getListePrixPlats().get(0));
	}
	
	@Test
	void testAddListeCommandes() {
		this.f.addListeCommandes("Steven McCoke 6");
		assertEquals("Steven McCoke 6", this.f.getListeCommandes().get(0));
	}
}
