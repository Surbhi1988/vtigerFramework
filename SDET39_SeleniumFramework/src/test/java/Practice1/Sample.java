package Practice1;

import org.testng.annotations.Test;

public class Sample {


@Test(priority=-1)
		public void CreateCotact() {
   System.out.println("contact created");
	}
@Test 
		public void modifyContact() {
			System.out.println("modified contact");
		}
@Test
public void deleteContact() {
	System.out.println("delete contact");
}
}

	
	
		
	
