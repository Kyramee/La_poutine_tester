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
	
	@Test
	void testTrouverDossier() {
		assertEquals("C:\\eclispe\\poutine\\commande.txt", MainTest.trouverDossier().toString());
	}
	
	@Test
	void testOuvrirDossier() {
		assertNotEquals(null, MainTest.ouvrirDossier(Paths.get("C:\\eclispe\\poutine\\commande.txt")));
	}
}
