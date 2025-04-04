package srcs;

public class WeatherTower {
	private WeatherProvider provider = WeatherProvider.getInstance();

	public String getWeather(Coordinates coord)
	{
		return provider.getCurrrentWeather(coord);
	}

	public void changeWeather()
	{
		
	}
}
