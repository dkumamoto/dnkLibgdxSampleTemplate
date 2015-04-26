package com.dnk.libgdx.sample.worlds;

public class Main_World {
	
	private boolean screenLock;

	public Main_World() {
		screenLock = false;
		
	}

	public void update() {
		
	}
	
	public boolean isScreenLocked() {
		return screenLock;
	}
	
	public void toggleScreenLock() {
		if (screenLock) {
			screenLock = false;
		}
		else {
			screenLock = true;
		}
	}
}
