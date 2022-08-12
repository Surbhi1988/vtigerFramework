package Practice1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertSamnple {
@Test
public void createCustomerTest() {
	System.out.println("step1");
	System.out.println("step2");
	Assert.assertEquals("a","b");
	System.out.println("step3");
	System.out.println("step4");
}
}
