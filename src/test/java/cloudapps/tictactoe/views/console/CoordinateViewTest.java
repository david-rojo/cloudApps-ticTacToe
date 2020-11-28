package cloudapps.tictactoe.views.console;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import cloudapps.tictactoe.models.Coordinate;
import cloudapps.utils.Console;

@ExtendWith(MockitoExtension.class)
class CoordinateViewTest {
    static final String ENTER_COORDINATE_TO_PUT = "Enter a coordinate to put a token:";

    @Mock
    private Console console;

    @InjectMocks
    private CoordinateView coordinateView = new CoordinateView();

    @Test
    void testGivenNewCoordinateViewWhenReadCoordinateThenIsCorrect() throws IOException {
    	when(this.console.readInt("Row: ")).thenReturn(1);
        when(this.console.readInt("Column: ")).thenReturn(1);
        Coordinate coordinateRead = this.coordinateView.read(ENTER_COORDINATE_TO_PUT);
        Coordinate coordinateExpected = new Coordinate(0, 0);
        assertThat(coordinateRead.getRow(), is(coordinateExpected.getRow()));
        assertThat(coordinateRead.getColumn(), is(coordinateExpected.getColumn()));
    }

    @Test
    void testGivenNewCoordinatesWhenRow4AndColumn4ThenAssertionException() {
    	 when(this.console.readInt("Row: ")).thenReturn(4).thenReturn(1);
         when(this.console.readInt("Column: ")).thenReturn(4).thenReturn(1);
         Assertions.assertThrows(AssertionError.class, () -> {
         	this.coordinateView.read("Title");
         });        
         verify(this.console).readInt("Row: ");
         verify(this.console).readInt("Column: ");

    }
    
    @Test
    void testGivenNewCoordinatesWhenRow0AndColumn0ThenAssertionException() {
        when(this.console.readInt("Row: ")).thenReturn(0).thenReturn(1);
        when(this.console.readInt("Column: ")).thenReturn(0).thenReturn(1);
        Assertions.assertThrows(AssertionError.class, () -> {
        	this.coordinateView.read("Title");
		});        
        verify(this.console).readInt("Row: ");
        verify(this.console).readInt("Column: ");
    }

    @Test
    void testGivenNewCoordinatesWhenRow1AndColumn1ThenIsCorrect() {
        when(this.console.readInt("Row: ")).thenReturn(1);
        when(this.console.readInt("Column: ")).thenReturn(1);
        this.coordinateView.read("Title");
        verify(this.console).readInt("Row: ");
        verify(this.console).readInt("Column: ");
    }

    @Test
    void testGivenNewCoordinatesWhenRow3AndColumn3ThenIsCorrect() {
        when(this.console.readInt("Row: ")).thenReturn(3);
        when(this.console.readInt("Column: ")).thenReturn(3);
        this.coordinateView.read("Title");
        verify(this.console).readInt("Row: ");
        verify(this.console).readInt("Column: ");
    }
}
