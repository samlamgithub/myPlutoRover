package jiahaoPlutoRover;

public abstract class Rover {

	int xCoor;
	int yCoor;
	Directions direction;
	PlutoMap map;
	
	public Rover(int xCoor, int yCoor, Directions direction, PlutoMap map) {
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		this.direction = direction;
		this.map = map;
	}

	public int getXCoor() {
		return xCoor;
	}

	public int getYCoor() {
		return yCoor;
	}
	
	public void setXCoor(int xCoor) {
		this.xCoor = xCoor;
	}

	public void setYCoor(int yCoor) {
		this.yCoor = yCoor;
	}
	
	public Directions getDirection() {
		return direction;
	}

	public void setDirection(Directions direction) {
		this.direction = direction;
	}
	
	public void turn(int leftOrRight) {//leftOrRight is either -1 or 1
		this.direction = Directions.values()[ (this.direction.ordinal()+leftOrRight)%4];
	}
	
	public PlutoMap getMyMap() {
		return map;
	}

	public void receiveInstruction(String instructions) throws Exception {
		for (char cha : instructions.toCharArray()) {
			if (Movements.getMovementForChar(cha) != null) {
				doMove(Movements.getMovementForChar(cha));
	        }
		}
	}
	
	public abstract <X,Y> Coordinate<X,Y> doMove(Movements mov);
	

}
