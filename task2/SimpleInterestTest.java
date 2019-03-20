package task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleInterestTest {

	@Test
	void test() {
		Interest test = new Interest();
		double o=test.simpleInterest(500,2,5);
		assertEquals(50,o);
	}

}
