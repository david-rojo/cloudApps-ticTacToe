package cloudapps.tictactoe;

import cloudapps.tictactoe.controllers.PlayController;
import cloudapps.tictactoe.controllers.ResumeController;
import cloudapps.tictactoe.controllers.StartController;
import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.State;
import cloudapps.tictactoe.views.console.View;

public abstract class TicTacToe {

    private Game game;
    private StartController startController;
    private PlayController playController;
    private ResumeController resumeController;
    private View view;
    private State state;

    protected TicTacToe() {
        this.game = new Game();
        this.state = new State();
        this.startController = new StartController(this.game, this.state);
        this.playController = new PlayController(this.game, this.state);
        this.resumeController = new ResumeController(this.game, this.state);
        this.view = this.createView(this.startController, this.playController, this.resumeController);
    }

    protected abstract View createView(StartController startController, PlayController playController, ResumeController resumeController2);

    protected void play() {
        this.view.interact();
    }
}
