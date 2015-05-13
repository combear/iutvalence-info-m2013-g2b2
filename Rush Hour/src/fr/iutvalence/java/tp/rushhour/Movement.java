package fr.iutvalence.java.tp.rushhour;

/**
 * Define movement by a start and an ending position
 * @author A. Combe, C. Jondet */
public class Movement
{
	/**
	 * Start position
	 */
	private final Position start;
	/**
	 * End position
	 */
	private final Position ending;
	
	/**
	 * Create movement
	 * @param start : position of start
	 * @param ending : position of end
	 */
	public Movement(Position start, Position ending)
	{
		super();
		this.start = start;
		this.ending = ending;
	}

	/**
	 * Getters of start position
	 * @return start position
	 */
	public Position getStart()
	{
		return start;
	}

	/**
	 * Getters of end position
	 * @return end position
	 */
	public Position getEnding()
	{
		return ending;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ending == null) ? 0 : ending.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
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
		Movement other = (Movement) obj;
		if (ending == null)
		{
			if (other.ending != null)
				return false;
		} else if (!ending.equals(other.ending))
			return false;
		if (start == null)
		{
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Movement [start=" + start + ", ending=" + ending + "]";
	}

	public Orientation getOrientation()
	{
		if (this.start.getX()==this.ending.getX()) return Orientation.HORIZONTAL;
		if (this.start.getY()==this.ending.getY()) return Orientation.VERTICAL;
		return null;
	}
	
	
}
