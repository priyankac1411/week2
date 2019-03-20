package task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseEstimationTest {

	@Test
	void test() {
		HouseEstimation t =new HouseEstimation();
		int a = t.estimate("standard",100,"no");
		assertEquals(120000,a);
	}

}
