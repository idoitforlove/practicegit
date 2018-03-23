package edu.handong.csee.java.second.lab.screen;

public class Screen {
	int mWidth = 2;
	int mMinHeight = 0;
	int mMaxHeight = 3;
	
	public void rollUp(){
		System.out.println("Minimum height of the screen:" + mMinHeight);
	}
	
	public void roolDown(){
		System.out.println("Maximum height of the screen:" + mMaxHeight);
	}
}
