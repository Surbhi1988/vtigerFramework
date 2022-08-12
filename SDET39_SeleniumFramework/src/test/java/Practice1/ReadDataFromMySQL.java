package Practice1;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
import java.sql.ResultSet;


import com.mysql.jdbc.Driver;

public class ReadDataFromMySQL {

    

	public static void main(String[] args) throws Throwable {
		//Register or load the MySql database
		Driver  driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//get connect to database
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher_info","root","root");
 
		//create sql statement
		Statement state = conn.createStatement();
		String selectQuery="select *from teacher";
		
		//Execute statement/query
		 ResultSet result = state.executeQuery(selectQuery);
		 while (result.next())
		 {
			 System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
		 
		 }
		//close the database connection
		 conn.close();
	}

}
