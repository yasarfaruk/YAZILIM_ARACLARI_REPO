
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class HesaplamaTest {
	@Test
	public void testFibonacciHesap5() {
		int gerceksonuc=Hesaplama.fibonacciHesap(5);
		assertEquals(3,gerceksonuc);
	}
	
}