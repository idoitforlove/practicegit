package edu.handong.csee.java.second.lab.controller;

import edu.handong.csee.java.second.lab.projector.Projector;

public class Controller {

	public static void main(String[] args) {
		
		System.out.println("This is my controller!!");
		System.out.println("My first word used as an input is " + args[0]);
		System.out.println("My first word used as an input is " + args[1]);

		Controller nth413Controller = new Controller();
		
		nth413Controller.turnOnProjector();
	}

	public void turnOnProjector() {
		Projector nth413Projector = new Projector();
		//Projector가 public이라고 하더라도 다른 패키지에서 불러오려면 import해주는 과정이 필요합니다.
		//import는 Ctrl+Shift+O 를 누르면 이클립스가 자동으로 import를 해줍니다. 유용하니 키조합을 기억해두세요.
		System.out.println("My project's description:" + nth413Projector.mDescription);
		
		nth413Projector.turnOn();
	}
}
