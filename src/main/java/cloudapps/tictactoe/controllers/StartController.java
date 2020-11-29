package cloudapps.tictactoe.controllers;

import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.State;

public class StartController extends UseCaseController {

	public StartController(Game game, State state) {
		super(game, state);
	}

	public void setUsers(int users) {
		this.game.setUsers(users);
	}

	public int getMaxPlayers() {
		return this.game.getMaxPlayers();
	}
	
	public void start() {
		this.state.next();
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		
	}

}
