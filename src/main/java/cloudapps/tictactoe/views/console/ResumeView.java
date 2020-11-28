package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.controllers.ResumeController;
import cloudapps.tictactoe.views.Message;
import cloudapps.utils.YesNoDialog;

class ResumeView {

	private ResumeController resumeController;

	public ResumeView(ResumeController resumeController){
		this.resumeController = resumeController;
	}

	boolean interact() {
		boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
		if (isResumed){
			this.resumeController.resume();
		}
		return isResumed;
	}

}
