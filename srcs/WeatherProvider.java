package srcs;

public class WeatherProvider {
	private static WeatherProvider instance;
	private String[] weather = {"SUN", "RAIN", "FOG", "SNOW"};

	public static WeatherProvider getInstance()
	{
		if (instance == null)
			instance = new WeatherProvider();

		return instance;
	}

	public String getCurrrentWeather(Coordinates p_coordinates)
	{
		int rand = (int)(Math.random() * 101);
		if (rand == 0)
			rand++;
			
		int total = p_coordinates.getHeight() + p_coordinates.getLatitude() + p_coordinates.getLongitude();
		return this.weather[(total / rand) % 4];
	}
}
