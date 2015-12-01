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
	
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 1);
	}
	
	@Test
	public void receiveMultipleInstructionToForward() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("FFFFF");
	
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 5);
	}
	
	@Test
	public void receiveOneInstructionToBackward() throws Exception {
		Rover rover = new MyPlutoRover(0, 1, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 1);
		
		rover.receiveInstruction("B");
	
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
	}
	
	@Test
	public void receiveMultipleInstructionToBackward() throws Exception {
		Rover rover = new MyPlutoRover(0, 5, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 5);
		
		rover.receiveInstruction("BBBBB");
	
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
	}
	
	@Test
	public void receiveOneInstructionToLeft() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("L");
	
		assertEquals(rover.getDirection(), Directions.WEST);
	}
	
	@Test
	public void receiveMultipleInstructionToLeft() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("LLLL");
	
		assertEquals(rover.getDirection(), Directions.NORTH);
	}
	
	@Test
	public void receiveOneInstructionToRight() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("R");
	
		assertEquals(rover.getDirection(), Directions.EAST);
	}
	
	@Test
	public void receiveMultipleInstructionToRight() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("RRRR");
	
		assertEquals(rover.getDirection(), Directions.NORTH);
	}
	
	@Test
	public void MultipleInstructionTest() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("FFRFF");
	
		assertEquals(rover.getXCoor(), 2);
		assertEquals(rover.getYCoor(), 2);
		assertEquals(rover.getDirection(), Directions.EAST);
	}
	
	@Test
	public void WrapFromLeft() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("LF");
	
		assertEquals(rover.getXCoor(), 9);
		assertEquals(rover.getYCoor(), 0);
		assertEquals(rover.getDirection(), Directions.WEST);
	}
	
	@Test
	public void WrapFromRight() throws Exception {
		Rover rover = new MyPlutoRover(9, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 9);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("RF");
	
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		assertEquals(rover.getDirection(), Directions.EAST);
	}
	
	@Test
	public void WrapFromUp() throws Exception {
		Rover rover = new MyPlutoRover(0, 9, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 9);
		
		rover.receiveInstruction("F");
	
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		assertEquals(rover.getDirection(), Directions.NORTH);
	}
	
	@Test
	public void WrapFromButtom() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		rover.receiveInstruction("B");
	
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 9);
		assertEquals(rover.getDirection(), Directions.NORTH);
	}

}
