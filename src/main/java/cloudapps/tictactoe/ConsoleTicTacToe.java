package cloudapps.tictactoe;

import cloudapps.tictactoe.controllers.PlayController;
import cloudapps.tictactoe.controllers.ResumeController;
import cloudapps.tictactoe.controllers.StartController;
import cloudapps.tictactoe.views.console.View;

class ConsoleTicTacToe extends TicTacToe {

	public static void main(String[] args) {
		new ConsoleTicTacToe().play();
	}

	@Override
	protected View createView(StartController startController, PlayController playController, ResumeController resumeController){
		return new View(startController, playController, resumeController);
	}
}
