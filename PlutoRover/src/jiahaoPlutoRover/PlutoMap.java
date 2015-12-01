package jiahaoPlutoRover;

import java.util.Arrays;

public class PlutoMap {

    boolean[][] grid;
	
	public PlutoMap(int width, int height) throws Exception {
		if(width>0 && height>0) {
			grid = new boolean[width][height];
			for (boolean[] arr: grid) {
				for (boolean b: arr) {
					b = false;
				}
			}
		} else {
			throw new Exception();
		}
	}
	
	public int getWidth() {
		return grid[0].length;
	}
	
	public int getHeight() {
		return grid[0].length;
	}
	
	public boolean onPluto(int x, int y) {
		return ((x>=0 && x<getWidth()) && (y>=0 && y<getHeight()));
	}
	
	public void putObstacle(int x, int y) {
		if(onPluto(x,y)) {
			grid[x][y] = true;
		}
	}
	
	public boolean isObstacle(int x, int y) {
		return onPluto(x,y)?grid[x][y]:false;
	}

}
