package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import poutine.Facture;
import poutine.MainTest;

class testPoutine {
	Facture f = new Facture();
	
	@Test
	void testAddListeClient() {
		this.f.addListeClients("Steven");
		//test aussi la methode associ�
		assertEquals("Steven", this.f.getListeClients().get(0));
	}
	
	@Test
	void testAddListePlats() {
		this.f.addListePlats("McCoke 11.99");
		//test aussi la methode associ�
		assertEquals("McCoke", this.f.getListeNomPlats().get(0));
		//test aussi la methode associ�
		assertEquals("11.99", this.f.getListePrixPlats().get(0));
	}
	
	@Test
	void testAddListeCommandes() {
		this.f.addListeCommandes("Steven McCoke 6");
		//test aussi la methode associ�S
		assertEquals("Steven McCoke 6", this.f.getListeCommandes().get(0));
	}
	
	@Test
	void testTrouverDossier() {
		assertEquals(Paths.get("commande.txt").toAbsolutePath(), MainTest.trouverDossier());
	}
	
	@Test
	void testOuvrirDossier() {
		assertNotEquals(null, MainTest.ouvrirDossier(Paths.get("commande.txt").toAbsolutePath()));
	}
}
