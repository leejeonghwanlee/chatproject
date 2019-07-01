package testg02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {
public static void main(String[] args) throws Exception {
	URL site = new URL("http://www.google.com");
	URLConnection url= site.openConnection();
	BufferedReader in =new BufferedReader(
			           new InputStreamReader(
			        		   url.getInputStream(),"utf8"));
	String inLine;
	
	while ((inLine=in.readLine())!=null) 
		System.out.println(inLine);
	in.close();
		
}
}
