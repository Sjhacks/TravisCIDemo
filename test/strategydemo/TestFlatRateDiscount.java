package strategydemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFlatRateDiscount {

	@Test
	public void test() {
		
	}
	
	@Test
	public void applyDiscountTest() {
		float amt = 5.00f;
		DiscountStrategy strat = new FlatRateDiscountStrategy(amt);
		
		Order order = new Order("Jennifer",10.00f);
		order.setStrategy(strat);
		float result = order.getDiscountedPrice();
		assertEquals(5.00f,result,1);
	}

}
