import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUnit {

	@Test
	void testOn_off() {
		Carro c = new Carro();
		boolean result = c.On_off(false);
	    assertEquals(true, result);
	}

	@Test
	void testFM_AM() {
		Carro c = new Carro();
		boolean result = c.FM_AM(false);
		//True == AM 
		//False == FM
	    assertEquals(true, result);
	}

	 @Test
	    void testStat_ChangeB() {
	        Carro c = new Carro();
	        float Station = 720;
	        c.FM_AM(false);
	        float result = c.Stat_ChangeB(Station);
	        assertEquals(710, result);
	 }

	@Test
	void testStat_ChangeF() {
		Carro c = new Carro();
		float Station = (float) 99.9;
        float result = c.Stat_ChangeF(Station);
		assertEquals((float)100.1, result);
	}

}
