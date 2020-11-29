package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.controllers.PlayController;
import cloudapps.tictactoe.controllers.ResumeController;
import cloudapps.tictactoe.controllers.StartController;
import cloudapps.tictactoe.controllers.UseCaseController;

public class View extends cloudapps.tictactoe.views.View {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

	@Override
	public void interact(UseCaseController controller) {
		this.startView.interact((StartController) controller);		
	}

}
