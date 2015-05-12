package fr.iutvalence.java.tp.rushhour;

public class Position
{
	private final int x;
	private final int y;
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
	
	public Position getNeighbourPosition(Orientation orientation, int positionIndex)
	{
	    if (orientation == Orientation.HORIZONTAL) return new Position(this.getX()+(1*positionIndex),getY());
	    if (orientation == Orientation.VERTICAL) return new Position(this.getX(),getY()+(1*positionIndex));
		return null;
	}
	
	public int getX()
	{
		return x;
	}
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
