package com.firstSpring.learning_spring;

import com.firstSpring.learning_spring.game.GameRunner;
import com.firstSpring.learning_spring.game.MarioGame;
import com.firstSpring.learning_spring.game.PacmanGame;
import com.firstSpring.learning_spring.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearningSpringApplication.class, args);
//		SuperContraGame game = new SuperContraGame();
//		MarioGame game = new MarioGame();
		PacmanGame game = new PacmanGame();

		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
