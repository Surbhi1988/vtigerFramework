package Practice1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	@Test(dataProvider="dataProvider_test")
	public void bookTicket(String src,String dst) {
		System.out.println("book ticket from "+src+" to "+dst+");");
	}
	@DataProvider
	public Object[][] dataProvider_test() {
		Object[][] objArr=new	Object[5][2];
		objArr[0][0]="Bangalore";
		objArr[0][1]="goa";
		
		objArr[1][0]="Bangalore";
		objArr[1][1]="mysore";
		
		objArr[2][0]="Bangalore";
		objArr[2][1]="Manglore";
		
		objArr[3][0]="Bangalore";
		objArr[3][1]="Mumbai";
		
		objArr[4][0]="Bangalore";
		objArr[4][1]="kerala";
		
		return objArr;
	}

}
