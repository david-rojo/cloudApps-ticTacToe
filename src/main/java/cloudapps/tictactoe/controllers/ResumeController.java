package cloudapps.tictactoe.controllers;

import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.State;

public class ResumeController extends UseCaseController {

  public ResumeController(Game game, State state) {
    super(game, state);
  }

  public void resume() {
    this.game.reset();
    this.state.reset();
  }

  @Override
  public void accept(ControllersVisitor controllersVisitor) {
	  controllersVisitor.visit(this);
  }

}
