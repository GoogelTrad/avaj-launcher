package aircraft;

import javax.naming.directory.NoSuchAttributeException;

import aircraft.Flyable;
import srcs.Coordinates;

public class AircraftFactory {

	private static long ids = 0;
	private static AircraftFactory instance;

	public static AircraftFactory getInstance()
	{
		if (instance == null)
			instance = new AircraftFactory();

		return instance;
	}


	public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates)
	{
		try
		{
			if (p_coordinates == null || p_type == null || p_name == null)
				throw new NoSuchAttributeException("Type, name and coordinates can't be null !");
	
			if (p_coordinates.getHeight() < 0 || p_coordinates.getLatitude() < 0 || p_coordinates.getLongitude() < 0)
				throw new ArithmeticException("Error: Cannot have negatives coordinates !");
	
			if (p_coordinates.getHeight() > 100)
				p_coordinates.setHeight(100);
	
			if (p_type.toLowerCase().equals("helicopter"))
				return new Helicopter(ids++, p_name, p_coordinates);
			else if (p_type.toLowerCase().equals("baloon"))
				return new Baloon(ids++, p_name, p_coordinates);
			else if (p_type.toLowerCase().equals("jetplane"))
				return new JetPlane(ids++, p_name, p_coordinates);
			else
				return null;
		}
		catch(NoSuchAttributeException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}

		return null;
	}
}
