package client;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import server.FDaemon;
import server.FServer;

public class Pipper {

	private FServer server;
	public Pipper()
	{
		server=new FServer();
		
	}
	
	public void sendMessage(PipedInputStream is,PipedOutputStream os)
	{
			server.setInputStream(is);
			server.setOutputStream(os);
			server.service();
			
			
	}

	
	
	
}
