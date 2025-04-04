package srcs;

public class Coordinates 
{
	private int longitude;
	private int latitude;
	private int height;

	public Coordinates(int longitude_, int latitude_, int height_) 
	{
		this.longitude = longitude_;
		this.height = height_;
		this.latitude = latitude_;
	}

	public int getLongitude()
	{
		return longitude;
	}

	public int getLatitude()
	{
		return latitude;
	}

	public int getHeight()
	{
		return height;
	}

	public void setLongitude(int longitude_)
	{
		this.longitude = longitude_;
	}

	public void setLatitude(int latitude_)
	{
		this.latitude = latitude_;
	}

	public void setHeight(int height_)
	{
		this.height = height_;
	}
}
