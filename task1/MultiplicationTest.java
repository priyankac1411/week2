package task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicationTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		int output=test.multiplication(5, 10);
		assertEquals(50,output);
	}

}
