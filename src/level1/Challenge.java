package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * Without touching the wall reach the endZone use sleep an driveDirect
	 */
	public void initialize() {
		// write code here!
		driveDirect(500, 500);
		sleep(1500);
		driveDirect(250, 500);
		sleep(1400);
		driveDirect(500, 500);
		sleep(6000);
		driveDirect(250, 500);
		sleep(1400);
		driveDirect(500, 500);

	}

	public void loop() {

	}
}
