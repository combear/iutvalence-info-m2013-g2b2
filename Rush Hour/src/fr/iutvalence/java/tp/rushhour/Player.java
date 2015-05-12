package fr.iutvalence.java.tp.rushhour;

/**
 * Player class, simulation of user's choices
 * @author A. Combe, C. Jondet
 *
 */
public class Player
{
	/**
	 * Allows to send a new position 
	 * @return movement
	 */
	public Movement getMovement()
	{
		return new Movement(new Position(1,1), new Position(4,1));			
	}
}
