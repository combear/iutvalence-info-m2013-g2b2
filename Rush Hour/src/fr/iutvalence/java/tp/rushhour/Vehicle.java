package fr.iutvalence.java.tp.rushhour;

/**
 * Class vehicle
 * @author A. Combe, C. Jondet
 */
public class Vehicle
{
	/** The vehicle is impossible to move at the position wanted*/
	public static final boolean IMPOSSIBLE_TO_MOVE=false;
	
	/** The vehicle were succesfully moved to the position wanted */
	public static final boolean MOVED=true;
	
	/**vehicle horizontal*/
	public static final boolean HORIZONTAL=false;
	
	/**vehicle vertical*/
	public static final boolean VERTICAL=true;

	/** Size of the vehicle*/
	private final VehicleType vehicleType;
	
	
	/**Orientation of the vehicle*/
	private final boolean orientation;
	
	/** Head position for horizontal axis */
	private Position vehiclePosition;
	

	
	/**
	 * Constructor for a Car object used as the head of the car
	 * @param vehicleType : Size of the vehicle
	 * @param orientation : orientation of vehicle (Horizontal or vertical)
	 */
	public Vehicle(VehicleType vehicleType, boolean orientation, int horizontalHeadPosition, int verticalHeadPosition)
	{ 
		this.vehicleType=vehicleType;
		this.orientation=orientation;
		this.vehiclePosition= new Position (horizontalHeadPosition,verticalHeadPosition);
		
		
	}
	
	
	/**
	 * @param x horizontal position axis
	 * @param y vertical position axis
	 * @return true if the position (x,y) is empty, false is it's not.
	 * @throws OutOfRangeException if we ask for a position out of the parking range
	 */
	public boolean isEmpty(Position position) throws OutOfRangeException
	{
		if (position.getX()>6 || position.getY()>6) throw new OutOfRangeException();
		
		if (this.vehiclePosition.getX()==position.getX() || this.vehiclePosition.getY()==position.getY())
			return false;
		
		if (this.vehicleType==VehicleType.CAR && this.orientation==HORIZONTAL)
			if (this.vehiclePosition.getY()-1==position.getY())
				return false;
		if (this.vehicleType==VehicleType.CAR && this.orientation==VERTICAL)
			if (this.vehiclePosition.getX()-1==position.getX())
				return false;
		if (this.vehicleType==VehicleType.TRUCK && this.orientation==HORIZONTAL)
			if (this.vehiclePosition.getY()-1==position.getY() && this.vehiclePosition.getY()-2==position.getY())
				return false;
		if (this.vehicleType==VehicleType.TRUCK && this.orientation==VERTICAL)
			if (this.vehiclePosition.getX()-1==position.getX() && this.vehiclePosition.getX()-2==position.getX())
				return false;
		
		return true;
	//TODO DEPLACER DANS PARKING	
	}
	
	
	/**
	 * Update the vehicle position to destination
	 * @param destination (x,y) position
	 */
	public void updatePosition(Position destination)
	{
		this.vehiclePosition= new Position(destination.getX(), destination.getY());
	}
	
}
