package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.controllers.StartController;
import cloudapps.tictactoe.views.Message;
import cloudapps.utils.LimitedIntDialog;

class StartView {

	private StartController startController;

	StartView(StartController startController) {
		assert startController != null;
		
		this.startController = startController;
	}

  void interact() {
		Message.TITTLE.writeln();
		int users = new LimitedIntDialog(0, 
			this.startController.getMaxPlayers()).read(Message.NUMBER_PLAYERS.toString());
		this.startController.setUsers(users);
		new GameView(startController).write();
	}

}