package fr.iutvalence.java.tp.rushhour;

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


	private boolean isValid(Movement movement)
	{
		// TODO Auto-generated method stub
		return false;
	}


	private boolean finished()
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
