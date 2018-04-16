package server;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.omg.PortableServer.POA;

import client.Pipper;

public class FServer {
	

	private PipedInputStream inputStream;
	private PipedOutputStream outputStream;
	
		
	public void service()
	{
		    System.out.println(this);
			ServerHander serverHander=new ServerHander(inputStream, outputStream);
			serverHander.start();
	}


	public PipedInputStream getInputStream() {
		return inputStream;
	}


	public void setInputStream(PipedInputStream inputStream) {
		this.inputStream = inputStream;
	}


	public PipedOutputStream getOutputStream() {
		return outputStream;
	}


	public void setOutputStream(PipedOutputStream outputStream) {
		this.outputStream = outputStream;
	}
	
	
	
}


