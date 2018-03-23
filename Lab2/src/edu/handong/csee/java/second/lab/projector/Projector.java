package edu.handong.csee.java.second.lab.projector;

public class Projector {
	int mLampTemperature = 20;
	
	public String mDescription = "This is a projector class";
	
	public void turnOn() {
		System.out.println("My project is turning on!!!");
		getLampTemperature();
	}
	
	public void turnoff() {
		System.out.println("My project is turning off!!!");
	}
	
	private void getLampTemperature() {
		System.out.println("My project temperature is " + mLampTemperature);
	}
}
