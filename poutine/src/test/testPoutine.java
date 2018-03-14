package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import poutine.Facture;

class testPoutine {
	
	@Test
	void test() {
		Facture f = Mockito.mock(Facture.class);
		f.addListeClients("Steven");
		Mockito.verify(f).addListeClients("Steven");
	}
}
