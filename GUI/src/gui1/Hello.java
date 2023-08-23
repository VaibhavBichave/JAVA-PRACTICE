package gui1; 
import java.sql.*;  
class Hello{  
public static void main(String args[])throws Exception{  
	try{  
		String url="jdbc:mysql://localhost:3306/information_schema";
		String uname="root";
		String pass="vaibhav";
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st= con.createStatement();
		String q="select * from TABLES";
		ResultSet rs=st.executeQuery(q);
		while(rs.next()) {
			String name=rs.getString(2);
			System.out.println(name);
		}
		
		//System.out.println(name);
		st.close();
		con.close();  
		}
	catch(Exception e){ 
		System.out.println(e);
		}  
	}  

} 

























