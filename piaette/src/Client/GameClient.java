package Client;

import java.net.DatagramSocket;

public class GameClient {
	private DatagramSocket socket;
	public GameClient(DatagramSocket socket){
		this.socket = socket;
		Thread down = new GameDownStream(this);
		Thread up = new GameUpStream(this);
		
		down.start();
		up.start();
	}
	public DatagramSocket getSocket(){
		return socket;
	}
}