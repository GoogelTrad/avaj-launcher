package aircraft;

import srcs.WeatherTower;

public abstract class Flyable {

	protected WeatherTower weatherTower;

	public abstract void updateConditions(String weather);
	public void registerTower(WeatherTower p_tower)
	{
		this.weatherTower = p_tower;
	}
}
