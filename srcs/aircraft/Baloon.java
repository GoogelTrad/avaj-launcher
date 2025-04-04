package aircraft;

import srcs.Coordinates;

public class Baloon extends Aircraft
{
	public Baloon(long p_id, String p_name, Coordinates p_coordinates)
	{
		super(p_id, p_name, p_coordinates);
	}

	public void updateConditions(String weather)
	{
		switch (weather) {
			case "SUN":
				this.coordinates.setLatitude(this.getCoordinates().getLatitude() + 2);
				this.coordinates.setHeight(this.getCoordinates().getHeight() + 4);
				this.announce("Longitude increases with 2, Height increases with 4 !");
				break;
			case "RAIN":
				this.coordinates.setHeight(this.getCoordinates().getHeight() - 5);
				this.announce("Height decreases with 5 !");
				break;
			case "FOG":
				this.coordinates.setHeight(this.getCoordinates().getHeight() - 3);
				this.announce("Height decreases with 3 !");
				break;
			case "SNOW":
				this.coordinates.setHeight(this.getCoordinates().getHeight() - 15);
				this.announce("Height decreases with 15 !");
				break;

			default:
				break;
		}
	}
}
