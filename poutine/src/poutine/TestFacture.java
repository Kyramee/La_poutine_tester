package poutine;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class TestFacture {

	@Test
	public void testCommandeSansFaute() throws IOException {
		Path chemin = Paths.get("commande - CommandeSansFaute.txt");
		MainTest.TestLecture( chemin );
		assertEquals( "Bienvenue chez Barette!\n\nFactures:\nRoger 10.5$\nCéline 20.75$", MainTest.TestLecture( chemin ) );

	}

}
