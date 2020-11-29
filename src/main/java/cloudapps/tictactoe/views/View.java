package cloudapps.tictactoe.views;

import cloudapps.tictactoe.controllers.ControllersVisitor;
import cloudapps.tictactoe.controllers.UseCaseController;

public abstract class View implements ControllersVisitor {
	
	public void interact(UseCaseController controller) {
		controller.accept(this);
	}

}
