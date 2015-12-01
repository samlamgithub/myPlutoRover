package jiahaoPlutoRoverTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

import jiahaoPlutoRover.PlutoMap;



public class RoverMapTest {

	@Test
	public void mapSizeTest() throws Exception {
		PlutoMap map = new PlutoMap(10,10);
		
		assertEquals(map.getHeight(), 10);
		assertEquals(map.getWidth(), 10);
	}
	
	@Test(expected=Exception.class)
	public void wrongMapSizeTest() throws Exception {
		PlutoMap map = new PlutoMap(0, 0);
	}
	
	@Test(expected=Exception.class)
	public void wrongMapSizeTest2() throws Exception {
		PlutoMap map = new PlutoMap(-1, -1);
	}
	
	@Test
	public void onMapTest() throws Exception {
		PlutoMap map = new PlutoMap(10,10);
		assertTrue(map.onPluto(5, 5));
	}
	
	@Test
	public void NotonMapTest() throws Exception {
		PlutoMap map = new PlutoMap(10,10);
		assertFalse(map.onPluto(-1, -1));
	}
	
	@Test
	public void putObstacleTest() throws Exception {
		PlutoMap map = new PlutoMap(10,10);
		
		map.putObstacle(5, 5);
		assertTrue(map.isObstacle(5, 5));
	}

}
