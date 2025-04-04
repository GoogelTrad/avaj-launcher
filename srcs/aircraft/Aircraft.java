package aircraft;
import srcs.Coordinates;

public abstract class Aircraft extends Flyable
{
	protected long id;
	protected String name;
	protected Coordinates coordinates;

	protected Aircraft(long p_id, String p_name, Coordinates p_coordinates)
	{
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinates;
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
