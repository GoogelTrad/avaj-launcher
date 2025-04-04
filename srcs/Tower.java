package srcs;

import java.util.ArrayList;

import aircraft.Flyable;

public class Tower {

	private ArrayList<Flyable> observers = new ArrayList<Flyable>();

	public void register(Flyable p_flyable)
	{
		observers.add(p_flyable);
	}

	public void unregister(Flyable p_flyable)
	{
		observers.remove(p_flyable);
	}

	protected void conditionChange()
	{
		for (Flyable flyable : observers) {
			flyable.updateConditions("FOG");
		}
	}
}
