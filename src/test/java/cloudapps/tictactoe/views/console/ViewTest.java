package cloudapps.tictactoe.views.console;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import cloudapps.tictactoe.controllers.PlayController;
import cloudapps.tictactoe.controllers.ResumeController;
import cloudapps.tictactoe.controllers.StartController;

@ExtendWith(MockitoExtension.class)
class ViewTest {
	
	@Mock
	private StartView startView;
	
	@Mock
	private StartController startController;
	
	@Mock
	private PlayView playView;
	
	@Mock
	private PlayController playController;
	
	@Mock
	private ResumeView resumeView;
	
	@Mock
	private ResumeController resumeController;
	
	@InjectMocks
	private View view;
	
	@Test
	void testGivenViewWhenInteractStartControllerThenStartViewInteractWithStartController() {
		this.view.interact(startController);
	    verify(this.startController).accept(this.view);
	}
	
	@Test
	void testGivenViewWhenInteractPlayControllerThenPlayViewInteractWithPlayController() {
		this.view.interact(playController);
		verify(this.playController).accept(this.view);
	}
	
	@Test
	void testGivenViewWhenInteractResumeControllerThenResumeViewInteractWithResumeController() {
		this.view.interact(resumeController);
		verify(this.resumeController).accept(this.view);
	}
	
	@Test
	void testGivenViewWhenVisitStartControllerThenStartViewInteractWithStartController() {
		this.view.visit(startController);
		verify(this.startView).interact(this.startController);
	}
	
	@Test
	void testGivenViewWhenVisitPlayControllerThenPlayViewInteractWithPlayController() {

	}

}
