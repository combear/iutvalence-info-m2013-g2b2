package fr.iutvalence.java.tp.rushhour;

/**
 * Position featured by a X(horizontal) and an Y(vertical)
 * @author A. Combe, C. Jondet
 *
 */
public class Position
{
	/**
	 * horizontal
	 */
	private final int x;
	
	/**
	 * vertical
	 */
	private final int y;
	
	/**
	 * Create a position on the parking
	 * @param x : horizontal position
	 * @param y : vertical position
	 */
	public Position(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Say if the position and the position where the method is called of are aligned
	 * @param position the other position 
	 * @param orientation the axis where we want to know the alignation
	 * @return true if the position is aligned to the one where the method is called of
	 */
	public boolean isAligned(Position position, Orientation orientation)
	{
		if (orientation == Orientation.HORIZONTAL) 
			if (this.getX()==position.getX()) return true;
		if (orientation == Orientation.VERTICAL )
			if (this.getY()==position.getY()) return true;
		return false;
	}
	
	/**
	 * Say the position of the neighbour at the positionIndex away from the position where the method is called of
	 * @param orientation : Orientation of the vehicle 
	 * @param positionIndex : index from the head (position)
	 * @return the position of the Neighbour position
	 */
	public Position getNeighbourPosition(Orientation orientation, int positionIndex)
	{
	    if (orientation == Orientation.HORIZONTAL) return new Position(this.getX()+(1*positionIndex),getY());
	    if (orientation == Orientation.VERTICAL) return new Position(this.getX(),getY()+(1*positionIndex));
		return null;
	}
	
	/**
	 * used to get X
	 * @return x, the horizontal position
	 */
	public int getX()
	{
		return x;
	}
	/**
	 * used to get Y
	 * @return y, the horizontal position
	 */
	public int getY()
	{
		return y;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		return "Position [x=" + x + ", y=" + y + "]";
	}


	
	
}
