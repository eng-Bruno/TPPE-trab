package junitTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import converter.Comprimento;
class TestegetComp {

		Comprimento c = new Comprimento();
	@Test
	void testGetComp() {
		
		c.setMilha(10);
		assertEquals("10.0", c.getComp(5));
	}

}
