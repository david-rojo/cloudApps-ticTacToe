package cloudapps.tictactoe.controllers;

import cloudapps.tictactoe.models.Coordinate;
import cloudapps.tictactoe.models.Error;
import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.Token;

public class PlayController extends Controller {

	public PlayController(Game game) {
		super(game);
	}

	public boolean isBoardComplete() {
		return this.game.isBoardComplete();
	}

	public boolean isTicTacToe() {
		return this.game.isTicTacToe();
	}

	public Token getToken() {
		return this.game.getToken();
	}

	public boolean isUser() {
		return this.game.isUser();
	}

	public Error put(Coordinate coordinate) {
		return this.game.put(coordinate);
	}

	public Error move(Coordinate origin, Coordinate target) {
		return this.game.move(origin, target);
	}

}
