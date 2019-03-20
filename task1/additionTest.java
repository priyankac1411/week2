package task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class additionTest {
	@Test
	void test() {
		Calculator test = new Calculator();
		int output=test.addition(5, 10);
		assertEquals(15,output);
	}
}
