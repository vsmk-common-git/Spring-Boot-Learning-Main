package com.in28minutes.learnspringframework.game;

public class GameRunner {
	//MarioGame game----Tightly coupled when comes to implement a new game
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		System.out.println("Mario Game is Running"+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
