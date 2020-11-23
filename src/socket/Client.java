package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	
	public static void main(String[] args) {
		
		
		final String HOST = "127.0.0.1";
		final int port = 5725;
		DataInputStream in;
		DataOutputStream out;
		
		try {
			Socket sc = new Socket(HOST, port);
			in = new DataInputStream(sc.getInputStream());
			out = new DataOutputStream(sc.getOutputStream());
			
			out.writeUTF("C:<12345678><145698>");
			String message = in.readUTF();
			
			System.out.println(message);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}