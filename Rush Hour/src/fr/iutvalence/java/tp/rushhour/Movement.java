package fr.iutvalence.java.tp.rushhour;

public class Movement
{
	private final Position start;
	private final Position ending;
	
	public Movement(Position start, Position ending)
	{
		super();
		this.start = start;
		this.ending = ending;
	}

	public Position getStart()
	{
		return start;
	}

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
	
	
}
