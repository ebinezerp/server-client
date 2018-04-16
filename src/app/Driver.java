package app;

import java.util.Date;

import client.Client;
import client.Pipper;

public class Driver {
	
	public static void main(String[] args) {
		
		Pipper pipper=new Pipper(); 	
		
		for(int i=0;i<100;i++)
		{
			Client c=new Client(pipper);
			c.sendMessage("Id::"+i+"   Time"+new Date());
		}
		
	}

}
