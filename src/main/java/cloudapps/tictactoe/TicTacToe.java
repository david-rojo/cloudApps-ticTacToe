package cloudapps.tictactoe;

import cloudapps.tictactoe.controllers.Logic;
import cloudapps.tictactoe.controllers.UseCaseController;
import cloudapps.tictactoe.views.console.View;

public abstract class TicTacToe {

    private View view;
    private Logic logic;

    protected TicTacToe() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    protected void play() {
    	UseCaseController controller;
		do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
		} while (controller != null);
    }
}
