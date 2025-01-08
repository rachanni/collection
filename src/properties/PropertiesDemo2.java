//package properties;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class PropertiesDemo2 {
//
//	public static void main(String[] args) throws IOException{
//		
//		Properties p=new Properties();
//		FileInputStream fis=new FileInputStream("db.properties");
//		p.load(fis);
//		String url=p.getProperty("url");
//		String user=p.getProperty("user");
//		String pwd=p.getProperty("pwd");
//		Connection con=DriverManager.getConnection(url,user,pwd);
//		
//		
//		
//	}
//}
