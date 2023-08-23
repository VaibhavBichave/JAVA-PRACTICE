import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class DBConnect 
{
	public static Connection con=null;
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Military_network","root","");
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
			return con;
	}
}
