package practiceProgram;

import org.testng.annotations.Test;

public class RunTimeParameter {
	@Test
	public void getRunTimeData() {
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("un"));
		System.out.println(System.getProperty("pwd"));
		
	}

}
