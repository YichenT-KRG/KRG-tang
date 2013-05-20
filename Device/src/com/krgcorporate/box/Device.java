package com.krgcorporate.box;

public abstract class Device {
	
	private String state;
	private String inbox;
	
	public abstract boolean start();
	public abstract boolean stop();

	
}
