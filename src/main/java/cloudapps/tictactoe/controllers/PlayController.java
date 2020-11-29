package cloudapps.tictactoe.controllers;

import cloudapps.tictactoe.models.Coordinate;
import cloudapps.tictactoe.models.Error;
import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.State;
import cloudapps.tictactoe.models.Token;

public class PlayController extends UseCaseController {

	public PlayController(Game game, State state) {
		super(game, state);
	}

	public boolean isBoardComplete() {
		return this.game.isBoardComplete();
	}

	public boolean isTicTacToe() {
		boolean isTicTacToe = this.game.isTicTacToe();
		if (isTicTacToe) {
			this.state.next();
		}
		return isTicTacToe;
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

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		
	}

}
