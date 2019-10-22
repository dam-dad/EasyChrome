package fvarrui.easychrome;

import java.io.IOException;
import java.security.GeneralSecurityException;

import su.litvak.chromecast.api.v2.Application;
import su.litvak.chromecast.api.v2.ChromeCast;
import su.litvak.chromecast.api.v2.ChromeCasts;
import su.litvak.chromecast.api.v2.Status;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException, GeneralSecurityException {
		
		ChromeCast cc = new ChromeCast("Clase");
		System.out.println(cc.getStatus());
		
//		ChromeCasts.startDiscovery();
//		
//		Thread.sleep(5000L);
//		
//		System.out.println(ChromeCasts.get());
		
//		// Connect (optional) 
//		// Needed only when 'autoReconnect' is 'false'. 
//		// Usually not needed and connection will be established automatically.
//		 chromecast.connect();
//		// Get device status
//		Status status = chromecast.getStatus();
//		// Run application if it's not already running
//		if (chromecast.isAppAvailable("APP_ID") && !status.isAppRunning("APP_ID")) {
//		  Application app = chromecast.launchApp("APP_ID");
//		}
	}

}
