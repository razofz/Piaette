package server;

import java.net.ServerSocket;
import java.net.Socket;


public class GameServer {
	private int serverPort = 22222;
	public GameServer(String serverName){
		
		Thread serverOffer = new ServerOffer(serverPort);
		serverOffer.start();
		
		Thread clientAdder = new ServerLobby(serverPort);
		clientAdder.start();
		
	}
	
}
