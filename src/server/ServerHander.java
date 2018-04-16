package server;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ServerHander extends Thread {
	
	public PipedInputStream inputStream;
	public PipedOutputStream outputStream;
	
	public ServerHander(PipedInputStream inputStream,PipedOutputStream outputStream)
	{
		this.inputStream=inputStream;
		this.outputStream=outputStream;
	}

	public void run()
	{
		if(inputStream!=null)
		{
			byte[] bytes=null;
			try {
				bytes = new byte[inputStream.available()];
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				inputStream.read(bytes);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println(new String(bytes));
		}
		
	}
	}
	

