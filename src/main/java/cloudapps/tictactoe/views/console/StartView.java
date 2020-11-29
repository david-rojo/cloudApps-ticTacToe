package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.controllers.StartController;
import cloudapps.tictactoe.views.Message;
import cloudapps.utils.LimitedIntDialog;

class StartView {

  void interact(StartController startController) {
		Message.TITTLE.writeln();
		int users = new LimitedIntDialog(0, 
			startController.getMaxPlayers()).read(Message.NUMBER_PLAYERS.toString());
		startController.setUsers(users);
		new GameView(startController).write();
	}

}