/**
 * 
 */
package learning;

/**
 * @author Ajay_triffort
 *
 */
public class ConnectionData {
	
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://127.0.0.1:3306/employee";
	public static final String USER = "root";
	public static final String PASS = "honda5112amit";
	
	public static String generateCode() 
	{
			int n=15;
			String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                 + "0123456789"
                 + "abcdefghijklmnopqrstuvxyz"; 

		 		// create StringBuffer size of AlphaNumericString 
		 		StringBuilder sb = new StringBuilder(n); 

		 		for (int i = 0; i < n; i++) { 

		 			// generate a random number between 
		 			// 0 to AlphaNumericString variable length 
		 			int index = (int)(AlphaNumericString.length()  * Math.random()); 
		 			// add Character one by one in end of sb 
		 			sb.append(AlphaNumericString .charAt(index)); 
		 		} 

		 		return sb.toString(); 
	}

}
