package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacMan;
import com.in28minutes.learnspringframework.game.SuperContra;


public class App01GammingBasicJava {

	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContra();
		var game = new PacMan();
		var gameRunner = new GameRunner(game);//Here we are injecting/wiring game to GameRunner Object
		gameRunner.run();
	}

}
