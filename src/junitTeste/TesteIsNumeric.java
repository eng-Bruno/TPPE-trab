package junitTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import view.TelaComprimento;

class TesteIsNumeric {
	
	TelaComprimento t = new TelaComprimento();
		
	@Test
	void testIsNumeric() {
		assertTrue(t.isNumeric("51"));
		assertFalse(t.isNumeric("alladin"));
	}

}
