package fr.iutvalence.java.tp.rushhour;

/**
 * Rush Hour game. The aim of the game is to release a vehicle which is jammed
 * on a parking. http://en.wikipedia.org/wiki/Rush_Hour_%28board_game%29
 * 
 * @author A. Combe, C. Jondet
 *
 */
public class RushHourGame
{
	/**
	 * parking where all vehicles are jammed
	 */
	private RushHourParking parking;

	private Player player;

	/**
	 * Create a parking which is a set oh vehicle including the one to release
	 * 
	 * @param parking
	 *            : game's parking
	 */
	public RushHourGame(RushHourParking parking)
	{
		this.parking = parking;
		this.player = new Player();
	}

	/** launch a RushHour's game */
	public void play()
	{
		Movement movement = null;
		while (true)
		{
			if (finished())
				return;

			while (true)
			{
				movement = this.player.getMovement();
				if (this.isValid(movement))
					break;
			}

		}
	}

	/**
	 * Prepare the movement if it's possible to accomplish
	 * @param movement
	 * @return
	 */
	public boolean processMovement(Movement movement)
	{
		Vehicle vehicleToMove = parking.getVehicleOn(movement.getStart());
		if (vehicleToMove == null) return false;
		
		if (!(movement.getOrientation() == vehicleToMove.getOrientation())) return false;
		
		int delta = movement.getDelta(vehicleToMove.getOrientation());
		
		return this.moveVehicle(vehicleToMove, delta);	
		
	}

	/**
	 * Move the vehicle
	 * @param vehicleToMove
	 * @param delta
	 * @return
	 */
	private boolean moveVehicle(Vehicle vehicleToMove, int delta)
	{
		
		if (vehicleToMove.getOrientation() == Orientation.HORIZONTAL)
			parking.isEmpty(new Position(movement.getStart().getX()-delta));
		
		moveVehicle(vehicleToMove, delta+1);
			
		return false;
	}

	/**
	 * Used to move the vehicle forward
	 * @param vehicleToMove 
	 * @return if moved or not
	 */
	private boolean forward(Vehicle vehicleToMove)
	{
		if (vehicleToMove.getOrientation()== Orientation.HORIZONTAL)
			parking.isEmpty(position)
	}
	
	private boolean finished()
	{
		if (parking.getVehicleToRelease().isOn(new Position(6, 3)))
			return true;
		return false;
	}

}
