package jiahaoPlutoRover;

//move actions for the rover
public enum Movements {
	F('F'), B('B'), L('L'), R('R');
	
	private char chater;

	Movements(char cha) 
    {
        this.chater = cha;
    }
	
	public static Movements getMovementForChar(final char cha)
    {
        for (Movements mov : Movements.values())
            if (mov.chater == cha)
                return mov;

        return null;
    }
}
