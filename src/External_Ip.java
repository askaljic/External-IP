
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class External_Ip {
		
		public static void main(String args[]) {
	        new External_Ip();
	    }

	    public External_Ip() {
	        URL ipAdress;

	        try {
	            ipAdress = new URL("http://myexternalip.com/raw");

	            BufferedReader in = new BufferedReader(new InputStreamReader(ipAdress.openStream()));

	            String ip = in.readLine();
	            System.out.println(ip);
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
		
	}


