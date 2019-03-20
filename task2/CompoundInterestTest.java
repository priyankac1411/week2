package task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompoundInterestTest {

	@Test
	void test() {
		Interest test = new Interest();
		double o=test.compoundInterest(500,2,5);
		assertEquals(51.25,o);
	}

}
