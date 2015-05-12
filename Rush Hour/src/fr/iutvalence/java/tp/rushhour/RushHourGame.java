package fr.iutvalence.java.tp.rushhour;

import java.awt.Dialog.ModalExclusionType;
import java.util.Scanner;

/**
 * Rush Hour game. The aim of the game is to release a vehicle which is jammed on a parking.
 * http://en.wikipedia.org/wiki/Rush_Hour_%28board_game%29
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
	 * @param parking : game's parking
	 */
	public RushHourGame(RushHourParking parking)
	{
		 this.parking = parking;
		 this.player = new Player();
	}
	
	
	/**launch a RushHour's game*/
	public void play()
	{
		Movement movement = null;
		while (true)
		{
			if (finished()) return;
			
			while (true)
			{
				movement = this.player.getMovement();
				if (this.isValid(movement)) break;
			}
						
		}
	}


	/**
	 * Say if a movement is feasible
	 * @param movement : the movement we ask if it's possible
	 * @return true if it's possible false if it's not
	 */
	private boolean isValid(Movement movement)
	{
		try {
			
			if (parking.isEmpty(movement.getStart()))
				return false;
			}
			catch (OutOfRangeException e)
			{
				e.printStackTrace();
			}
		if (movement.getStart().isAligned(movement.getEnding(), parking.getVehicleOn(movement.getStart()).getOrientation())) return false;
		
		Vehicle vehicleToMove = parking.getVehicleOn(movement.getStart());
		
		
		if (vehicleToMove.getVehicleType() == VehicleType.CAR)
			{
				if (vehicleToMove.getOrientation() == Orientation.HORIZONTAL) 
				
					{
						if (movement.getStart().getX() > movement.getEnding().getX())
						
						{
							for(int movementIndex=(movement.getStart().getX())-1;movementIndex<movement.getEnding().getX();movementIndex--)
							{
								try {
									if (parking.isEmpty(new Position(movementIndex,movement.getStart().getY()))) return false;
								}
								catch (OutOfRangeException e)
								{
									return false;
								}
								
							}
							return true;
						}
						else if (movement.getStart().getX() < movement.getEnding().getX())
							
						{
							for(int movementIndex=(movement.getStart().getX());movementIndex>movement.getEnding().getX();movementIndex++)
							{
								try {
									if (parking.isEmpty(new Position(movementIndex,movement.getStart().getY()))) return false;
								}
								catch (OutOfRangeException e)
								{
									return false;
								}
								
							}
							return true;
						}
					}
				else if (vehicleToMove.getOrientation() == Orientation.VERTICAL)
				{
					if (movement.getStart().getY() > movement.getEnding().getY())
					
					{
						for(int movementIndex=(movement.getStart().getY())-1;movementIndex<movement.getEnding().getY();movementIndex--)
						{
							try {
								if (parking.isEmpty(new Position(movementIndex,movement.getStart().getX()))) return false;
							}
							catch (OutOfRangeException e)
							{
								return false;
							}
							
						}
						return true;
					}
					else if (movement.getStart().getY() < movement.getEnding().getY())
						
					{
						for(int movementIndex=(movement.getStart().getY());movementIndex>movement.getEnding().getY();movementIndex++)
						{
							try {
								if (parking.isEmpty(new Position(movementIndex,movement.getStart().getX()))) return false;
							}
							catch (OutOfRangeException e)
							{
								return false;
							}
							
						}
						return true;
					}
				}
			}
		else if (vehicleToMove.getVehicleType() == VehicleType.TRUCK)
		{
			if (vehicleToMove.getOrientation() == Orientation.HORIZONTAL) 
			
				{
					if (movement.getStart().getX() > movement.getEnding().getX())
					
					{
						for(int movementIndex=(movement.getStart().getX())-1;movementIndex<movement.getEnding().getX();movementIndex--)
						{
							try {
								if (parking.isEmpty(new Position(movementIndex,movement.getStart().getY()))) return false;
							}
							catch (OutOfRangeException e)
							{
								return false;
							}
							
						}
						return true;
					}
					else if (movement.getStart().getX() < movement.getEnding().getX())
						
					{
						for(int movementIndex=(movement.getStart().getX());movementIndex>movement.getEnding().getX();movementIndex++)
						{
							try {
								if (parking.isEmpty(new Position(movementIndex,movement.getStart().getY()))) return false;
							}
							catch (OutOfRangeException e)
							{
								return false;
							}
							
						}
						return true;
					}
				}
			else if (vehicleToMove.getOrientation() == Orientation.VERTICAL)
			{
				if (movement.getStart().getY() > movement.getEnding().getY())
				
				{
					for(int movementIndex=(movement.getStart().getY())-1;movementIndex<movement.getEnding().getY();movementIndex--)
					{
						try {
							if (parking.isEmpty(new Position(movementIndex,movement.getStart().getX()))) return false;
						}
						catch (OutOfRangeException e)
						{
							return false;
						}
						
					}
					return true;
				}
				else if (movement.getStart().getY() < movement.getEnding().getY())
					
				{
					for(int movementIndex=(movement.getStart().getY());movementIndex>movement.getEnding().getY();movementIndex++)
					{
						try {
							if (parking.isEmpty(new Position(movementIndex,movement.getStart().getX()))) return false;
						}
						catch (OutOfRangeException e)
						{
							return false;
						}
						
					}
					return true;
				}
			}
		}
		return false;
		
					
			
	}


	private boolean finished()
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
