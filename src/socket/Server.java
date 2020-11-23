package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
	
	public static void main(String[] args) {
	
		
		ServerSocket server = null;
		Socket sc = null;
		DataInputStream in;
		DataOutputStream  out;
		
		final int port = 5725;
		
		try {
			server = new ServerSocket(port);
			System.out.println("Serveur lancé!");
			
			
			while(true) {
				
				sc = server.accept();
				System.out.println("Client connecté!");
				
				in = new DataInputStream(sc.getInputStream());
				out = new DataOutputStream(sc.getOutputStream());
				
				String message = in.readUTF();
				System.out.println(message);
				
				out.writeUTF("OK");
				sc.close();
				System.out.println("Client déconnecté!");
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
