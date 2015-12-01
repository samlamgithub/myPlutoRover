package jiahaoPlutoRoverTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jiahaoPlutoRover.Directions;
import jiahaoPlutoRover.MyPlutoRover;
import jiahaoPlutoRover.PlutoMap;
import jiahaoPlutoRover.Rover;

public class RoverMoveTest {

	@Test
	public void receiveOneInstructionToForward() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("F");
	
		assertEquals(rover.getXCoor(), 1);
		assertEquals(rover.getYCoor(), 0);
	}

}
