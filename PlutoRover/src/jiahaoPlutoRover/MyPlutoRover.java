package jiahaoPlutoRover;

public class MyPlutoRover extends Rover {

	public MyPlutoRover(int xCoor, int yCoor, Directions direction, PlutoMap map) {
		super(xCoor, yCoor, direction, map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Coordinate<Integer, Integer> doMove(Movements mov) {
		Directions currentDirection = getDirection();
		switch(mov) {
			case F:
				switch(currentDirection) {
				case NORTH:
					if(map.isObstacle(getXCoor()+1,getYCoor())) {
						 return new Coordinate<>(getXCoor()+1, getYCoor());
					}
					xCoor++;
					break;
				case SOUTH:
					if(map.isObstacle(getXCoor()-1,getYCoor())) {
						 return new Coordinate<>(getXCoor()-1, getYCoor());
					}
					xCoor--;
					break;
				case EAST:
					if(map.isObstacle(getXCoor(),getYCoor()+1)) {
						 return new Coordinate<>(getXCoor(), getYCoor()+1);
					}
					yCoor++;
					break;
				case WEST:
					if(map.isObstacle(getXCoor(),getYCoor()-1)) {
						 return new Coordinate<>(getXCoor(), getYCoor()-1);
					}
					yCoor--;
					break;
				default:
					break;
				}
				break;
			case B:
				switch(currentDirection) {
				case NORTH:
					if(map.isObstacle(getXCoor()-1,getYCoor())) {
						 return new Coordinate<>(getXCoor()-1, getYCoor());
					}
					xCoor--;
					break;
				case SOUTH:
					if(map.isObstacle(getXCoor()+1,getYCoor())) {
						 return new Coordinate<>(getXCoor()+1, getYCoor());
					}
					xCoor++;
					break;
				case EAST:
					if(map.isObstacle(getXCoor(),getYCoor()-1)) {
						 return new Coordinate<>(getXCoor(), getYCoor()-1);
					}
					yCoor--;
					break;
				case WEST:
					if(map.isObstacle(getXCoor(),getYCoor()+1)) {
						 return new Coordinate<>(getXCoor(), getYCoor()+1);
					}
					yCoor++;
					break;
				default:
					break;
				}
				break;
			case L:
				turn(-1);
				break;
			case R:
				turn(1);
				break;
			default:
				break;
		}

		wrapAroundTheMap();
		return null;
	}
		
	private void wrapAroundTheMap() {
		if(xCoor >= map.getWidth()) {
			xCoor = 0;
		}
			
		if(yCoor >= map.getHeight()) {
			yCoor = 0;
		}
			
		if(xCoor < 0) {
			xCoor = map.getWidth() -1;
		}
			
		if(yCoor < 0) {
			yCoor = map.getHeight() - 1;		
		}
	}

}
