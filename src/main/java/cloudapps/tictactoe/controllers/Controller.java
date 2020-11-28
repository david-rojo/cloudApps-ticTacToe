package cloudapps.tictactoe.controllers;

import cloudapps.tictactoe.models.Coordinate;
import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.Token;

public abstract class Controller {
    
    protected Game game;

	Controller(Game game) {
		this.game = game;
  }

	public Token getToken(Coordinate coordinate) {
		return this.game.getToken(coordinate);
	}
  
}
