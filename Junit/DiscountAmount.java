import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DiscountAmount {
		private  NewPriceTestCheck newPriceTestCheck;
		@Before
	public void setup()
	{
		newPriceTestCheck=new  NewPriceTestCheck ();
	}
		@Test
		public void testDiscountCheck () {
			double newItem=170, discountPercentage=35;
			double dicountAmountValue=newPriceTestCheck.discountFind(newItem,discountPercentage);
			assertEquals(59.5,dicountAmountValue,.00001);
		}
		@Test
		public void testNewPriceTestCheck () {
			double newItem=170, discountPercentage=35;
			double newPricetAmountValue=newPriceTestCheck.newPriceFound(newItem,discountPercentage);
			assertEquals(110.5,newPricetAmountValue,.00001);
		}
	}
