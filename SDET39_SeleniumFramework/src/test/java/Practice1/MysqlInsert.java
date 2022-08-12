package Practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MysqlInsert {



	public static void main(String[] args) throws SQLException {
		//Register or load Mysql database
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	 
	//Get connect to database
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher_info","root","root");
	
	//create sql statement
	Statement state = conn.createStatement();
	
	//Execute query
//	insert into student(first_name,last)

	}

}
