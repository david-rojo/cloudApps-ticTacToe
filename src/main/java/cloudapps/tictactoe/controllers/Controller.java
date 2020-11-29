package cloudapps.tictactoe.controllers;

import cloudapps.tictactoe.models.Coordinate;
import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.State;
import cloudapps.tictactoe.models.Token;

public abstract class Controller {
    
	protected Game game;
	protected State state;

	Controller(Game game, State state) {
		assert game != null;
		assert state != null;
		this.game = game;
		this.state = state;
	}

	public Token getToken(Coordinate coordinate) {
		assert coordinate != null;
		return this.game.getToken(coordinate);
	}
  
}
