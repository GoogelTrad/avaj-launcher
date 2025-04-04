package srcs;

public class WeatherProvider {
	private static WeatherProvider instance;
	private String[] weather = {"SUN", "RAIN", "FOG", "SNOW"};

	private static WeatherProvider getInstance()
	{
		if (instance == null)
			instance = new WeatherProvider();

		return instance;
	}

	public String getCurrrentWeather(Coordinates coordinates_)
	{
		int rand = (int)(Math.random() * 101);
		if (rand == 0)
			rand++;
			
		int total = coordinates_.getHeight() + coordinates_.getLatitude() + coordinates_.getLongitude();
		return this.weather[(total / rand) % 4];
	}
}
