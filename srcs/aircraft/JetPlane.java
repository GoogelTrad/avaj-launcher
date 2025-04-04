package aircraft;

import srcs.Coordinates;

public class JetPlane extends Aircraft
{
	public JetPlane(long id_, String name_, Coordinates coordinates_)
	{
		super(id_, name_, coordinates_);
	}

	public void updateConditions(String weather)
	{
		switch (weather) {
			case "SUN":
				this.coordinates.setLatitude(this.getCoordinates().getLatitude() + 10);
				this.coordinates.setHeight(this.getCoordinates().getHeight() + 2);
				this.announce("Latitude increases with 10, Height increases with 2 !");
				break;
			case "RAIN":
				this.coordinates.setLatitude(this.getCoordinates().getLatitude() + 5);
				this.announce("Latitude increases with 5 !");
				break;
			case "FOG":
				this.coordinates.setLatitude(this.getCoordinates().getLatitude() + 1);
				this.announce("Latitude increases with 1 !");
				break;
			case "SNOW":
				this.coordinates.setHeight(this.getCoordinates().getHeight() - 7);
				this.announce("Height decreases with 7 !");
				break;

			default:
				break;
		}
	}
}
