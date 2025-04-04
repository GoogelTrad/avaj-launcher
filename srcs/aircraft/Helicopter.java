package aircraft;

import srcs.Coordinates;
import srcs.WeatherTower;

public class Helicopter extends Aircraft
{
	public Helicopter(long p_id, String p_name, Coordinates p_coordinates)
	{
		super(p_id, p_name, p_coordinates);
	}

	public void updateConditions(String weather)
	{
		switch (weather) {
			case "RAIN":
				this.coordinates.setLongitude(this.getCoordinates().getLongitude() + 5);
				this.announce("Longitude increases with 5 !");
				break;
			case "SUN":
				this.coordinates.setLongitude(this.getCoordinates().getLongitude() + 10);
				this.coordinates.setHeight(this.getCoordinates().getHeight() + 2);
				this.announce("Longitude increases with 10, Height increases with 2 !");
				break;
			case "FOG":
				this.coordinates.setLongitude(this.getCoordinates().getLongitude() + 1);
				this.announce("Longitude increases with 1 !");
				break;
			case "SNOW":
				this.coordinates.setHeight(this.getCoordinates().getHeight() - 12);
				this.announce("Height decreases with 12 !");
				break;

			default:
				break;
		}
	}
}
