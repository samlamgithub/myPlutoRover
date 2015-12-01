package jiahaoPlutoRoverTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import java.util.Map;


import org.junit.Test;

import jiahaoPlutoRover.Coordinate;
import jiahaoPlutoRover.Directions;
import jiahaoPlutoRover.MyPlutoRover;
import jiahaoPlutoRover.PlutoMap;
import jiahaoPlutoRover.Rover;
import jiahaoPlutoRover.PlutoMap;

public class ObstacleDetectionTest {

	@Test
	public void noObstacleMoveGood() throws Exception {
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, new PlutoMap(10,10));
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		Coordinate coor = rover.receiveInstruction("FFRFF");
	
		assertEquals(coor, null);
		assertEquals(rover.getXCoor(), 2);
		assertEquals(rover.getYCoor(), 2);
		assertEquals(rover.getDirection(), Directions.EAST);
	}
	
	@Test
	public void ObstacleMoveReturnCoor() throws Exception {
		PlutoMap map = new PlutoMap(10,10);
		map.putObstacle(5, 5);
		Rover rover = new MyPlutoRover(0, 0, Directions.NORTH, map);
		
		assertEquals(rover.getXCoor(), 0);
		assertEquals(rover.getYCoor(), 0);
		
		Coordinate coor = rover.receiveInstruction("FFFFFRFFFFFFFF");
	
		assertNotNull(coor);
		assertEquals(coor.getFst(), 5);
		assertEquals(coor.getSnd(), 5);
		assertEquals(rover.getXCoor(), 4);
		assertEquals(rover.getYCoor(), 5);
		assertEquals(rover.getDirection(), Directions.EAST);
	}

}
