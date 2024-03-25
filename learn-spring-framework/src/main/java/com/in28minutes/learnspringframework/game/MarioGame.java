package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("Go Up");
	}
	public void down() {
		System.out.println("Stop");
	}
	public void left() {
		System.out.println("Slow down");
	}
	public void right() {
		System.out.println("Accelerate");
	}
}
