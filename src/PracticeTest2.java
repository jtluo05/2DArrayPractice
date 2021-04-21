import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PracticeTest2 {

	@Test
	 void test_1_Init1() {
        Integer[][] p = new Practice().test1();
        assertTrue(p.length == 3);
        assertTrue(p[0].length == 3);
        assertTrue(p[1].length == 3);
        assertTrue(p[2].length == 3);
    }

}
