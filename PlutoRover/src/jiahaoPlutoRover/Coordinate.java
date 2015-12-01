package jiahaoPlutoRover;

// class to store coordinate points
public class Coordinate<X,Y> {

	X first;
	Y second;
	
	public Coordinate(X first, Y second) {
		this.first = first;
		this.second = second;
	}
	
	public X getFst() {
		return first;
	}
	
	public Y getSnd() {
		return second;
	}

}
