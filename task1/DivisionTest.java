package task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		double output=test.division(5, 10);
		assertEquals(0.5,output);
	}

}
