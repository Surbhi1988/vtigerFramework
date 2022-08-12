package Practice1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	@Test(retryAnalyzer= com.crm.Sdet.genericLib.RetryImpClass.class)
	public void Modifycount() {
		Assert.assertEquals(true, false);
		System.out.println("modify contact");
	}

}
