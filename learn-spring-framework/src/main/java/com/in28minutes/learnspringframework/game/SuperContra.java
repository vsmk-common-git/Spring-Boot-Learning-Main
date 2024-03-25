package com.in28minutes.learnspringframework.game;

public class SuperContra implements GamingConsole{
	public void up() {
		System.out.println("Go Up_Contra");
	}
	public void down() {
		System.out.println("Stop_Contra");
	}
	public void left() {
		System.out.println("Slow down_Contra");
	}
	public void right() {
		System.out.println("Accelerate_Contra");
	}
}
