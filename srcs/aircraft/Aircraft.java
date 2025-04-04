package aircraft;
import srcs.Coordinates;

public abstract class Aircraft implements Flyable
{
	protected long id;
	protected String name;
	protected Coordinates coordinates;

	public Aircraft(long id_, String name_, Coordinates coordinates_)
	{
		this.id = id_;
		this.name = name_;
		this.coordinates = coordinates_;
	}

	public Coordinates getCoordinates()
	{
		return this.coordinates;
	}

	public void announce(String msg)
	{
		System.out.println(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): " + msg);
	}
}
