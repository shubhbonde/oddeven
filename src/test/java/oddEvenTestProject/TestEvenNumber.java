package oddEvenTestProject;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestEvenNumber {
	@Test
	public void testEvenNumber() {
		assertTrue(OddEvenNumber.checkTheNumberIsEven(36));
	}
}
