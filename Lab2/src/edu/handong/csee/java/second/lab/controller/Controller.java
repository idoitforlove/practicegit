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
		//Projector�� public�̶�� �ϴ��� �ٸ� ��Ű������ �ҷ������� import���ִ� ������ �ʿ��մϴ�.
		//import�� Ctrl+Shift+O �� ������ ��Ŭ������ �ڵ����� import�� ���ݴϴ�. �����ϴ� Ű������ ����صμ���.
		System.out.println("My project's description:" + nth413Projector.mDescription);
		
		nth413Projector.turnOn();
	}
}
