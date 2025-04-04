package srcs;

public class WeatherTower extends Tower
{
	private WeatherProvider provider = WeatherProvider.getInstance();

	public String getWeather(Coordinates p_coordinates)
	{
		return provider.getCurrrentWeather(p_coordinates);
	}

	public void changeWeather()
	{
		this.conditionChange();
	}
}
