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
				if (this.processMovement(this.player.getMovement()))
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
		if (delta>0) 
		{
			this.forward(vehicleToMove);
			moveVehicle(vehicleToMove, delta-1);
			return true;
		}
		if (delta<0)
		{
			this.backward(vehicleToMove);
			moveVehicle(vehicleToMove, delta+1);
			return true;
		}
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
			try
			{
				if (parking.isEmpty(new Position(vehicleToMove.getVehiclePosition().getX()+1,vehicleToMove.getVehiclePosition().getY())))
				{
					vehicleToMove.updatePosition(new Position(vehicleToMove.getVehiclePosition().getX()+1,vehicleToMove.getVehiclePosition().getY()));
					return true;
				}
			} catch (OutOfRangeException e)
			{
				e.printStackTrace();
			}
		if (vehicleToMove.getOrientation()== Orientation.VERTICAL)
			try
			{
				if (parking.isEmpty(new Position(vehicleToMove.getVehiclePosition().getX(),vehicleToMove.getVehiclePosition().getY()+1)))
				{
					vehicleToMove.updatePosition(new Position(vehicleToMove.getVehiclePosition().getX(),vehicleToMove.getVehiclePosition().getY()+1));
					return true;
				}
			} catch (OutOfRangeException e)
			{
				e.printStackTrace();
			}
		return false;
		
	}
	
	/**
	 * Move the vehicle backward
	 * @param vehicleToMove
	 * @return if the vehicle mooved right
	 */
	private boolean backward(Vehicle vehicleToMove)
	{
		if (vehicleToMove.getOrientation()== Orientation.HORIZONTAL)
			try
			{
				if (parking.isEmpty(new Position(vehicleToMove.getVehiclePosition().getX()-(vehicleToMove.getVehicleType().getLength())-1,vehicleToMove.getVehiclePosition().getY())))
				{
					vehicleToMove.updatePosition(new Position(vehicleToMove.getVehiclePosition().getX()-(vehicleToMove.getVehicleType().getLength())-1,vehicleToMove.getVehiclePosition().getY()));
					return true;
				}
			} catch (OutOfRangeException e)
			{
				e.printStackTrace();
			}
		if (vehicleToMove.getOrientation()== Orientation.VERTICAL)
			try
			{
				if (parking.isEmpty(new Position(vehicleToMove.getVehiclePosition().getX(),vehicleToMove.getVehiclePosition().getY()-(vehicleToMove.getVehicleType().getLength())-1)))
				{
					vehicleToMove.updatePosition(new Position(vehicleToMove.getVehiclePosition().getX(),vehicleToMove.getVehiclePosition().getY()-(vehicleToMove.getVehicleType().getLength())-1));
					return true;
				}
			} catch (OutOfRangeException e)
			{
				e.printStackTrace();
			}
		return false;
		
	}
	
	/**
	 * @return
	 */
	private boolean finished()
	{
		if (parking.getVehicleToRelease().isOn(new Position(6, 3)))
			return true;
		return false;
	}

}
