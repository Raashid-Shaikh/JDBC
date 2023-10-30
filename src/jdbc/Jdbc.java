package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//Create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","scar1712");
		
		//Create a statement
		Statement statement = con.createStatement();
		
		//Write a query: insert
		//String s = "INSERT INTO instructors VALUES(109, 'Phil', 'Heath', '1999-12-01', 'F', 79000, 107, 3)";
		
		//Write a query: update
		//String m = "update instructors set inst_id =110 where inst_id  = 109";
		
		//Write a query: delete
		//String n = "delete from instructors where inst_id = 110";
		
		//Write a query: select
		String o = "Select inst_id, first_name, last_name from instructors";
		
		
		//Execute a query for insert, update, delete
		//statement.execute(n);
		
		//Execute a query for select	
		ResultSet rs = statement.executeQuery(o);
		
		
		while(rs.next()) {
			int eid = rs.getInt("inst_id");
			String fname = rs.getString("first_name");
			String lname = rs.getString("last_name");
			
			System.out.println(eid+" "+fname+" "+lname);
		}
		
		
		//Close connection
		con.close();
		
		
		System.out.println("query executed");
	}

}
