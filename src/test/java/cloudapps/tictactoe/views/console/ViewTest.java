package cloudapps.tictactoe.views.console;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import cloudapps.tictactoe.controllers.StartController;

@ExtendWith(MockitoExtension.class)
class ViewTest {
	
	@Mock
	private StartView startView;
	
	@Mock
	private StartController startController;
	
	@InjectMocks
	private View view;
	
	@Test
	void testGivenViewWhenInteractStartControllerThenStartViewInteractWithStartController() {
		this.view.interact(startController);
	    verify(this.startView).interact(this.startController);
	}
	
	@Test
	void testGivenViewWhenInteractPlayControllerThenPlayViewInteractWithPlayController() {

	}

}
