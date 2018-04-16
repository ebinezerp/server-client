package client;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import server.FServer;

public class Client {
	
	private PipedInputStream inputStream;
	private PipedOutputStream outputStream;
	private Pipper pipper;
	
	
	public Client(Pipper pipper)
	{
		inputStream=new PipedInputStream();
		try {
			outputStream=new PipedOutputStream(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.pipper=pipper;
	}
	
	
	public void sendMessage(String message)
	{
		try {
			outputStream.write(message.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(message);
		
		pipper.sendMessage(inputStream,outputStream);
	}
}
