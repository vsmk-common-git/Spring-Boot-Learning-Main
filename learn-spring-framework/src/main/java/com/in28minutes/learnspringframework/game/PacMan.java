package com.in28minutes.learnspringframework.game;

public class PacMan implements GamingConsole {
	public void up() {
		System.out.println("Go Up_PacMan");
	}
	public void down() {
		System.out.println("Stop_PacMan");
	}
	public void left() {
		System.out.println("Slow down_PacMan");
	}
	public void right() {
		System.out.println("Accelerate_PacMan");
	}
}
