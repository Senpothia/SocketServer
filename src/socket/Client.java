package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	
	public static void main(String[] args) {
		
		
		final String HOST = "35.180.165.119";
		final int port = 5725;
		DataInputStream in;
		DataOutputStream out;
		
		try {
			Socket sc = new Socket(HOST, port);
			in = new DataInputStream(sc.getInputStream());
			out = new DataOutputStream(sc.getOutputStream());
			
			out.writeUTF("456211");   // message envoyé
			String message = in.readUTF();  
			
			System.out.println(message);  // message reçu
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
