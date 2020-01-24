package fvarrui.easychrome;

import java.io.IOException;
import java.security.GeneralSecurityException;

import su.litvak.chromecast.api.v2.Application;
import su.litvak.chromecast.api.v2.ChromeCast;
import su.litvak.chromecast.api.v2.ChromeCasts;
import su.litvak.chromecast.api.v2.Status;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException, GeneralSecurityException {

		ChromeCast cc = new ChromeCast("10.2.3.31");

		cc.connect();

		// Get device status
		Status status = cc.getStatus();
		System.out.println(status);

//		if (cc.isAppAvailable("E8C28D3C") && !status.isAppRunning("E8C28D3C")) {
//			Application app = cc.launchApp("E8C28D3C");
//		}

		cc.load("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");

		cc.play();
		
//		cc.disconnect();

	}

}
