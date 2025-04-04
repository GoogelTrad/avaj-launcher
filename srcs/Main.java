package srcs;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

import aircraft.Baloon;
import aircraft.Helicopter;
import aircraft.JetPlane;

public class Main 
{
	public static void main(String[] args)
	{
		Tower tower = new Tower();

		Coordinates coord = new Coordinates(22, 33, 20);
		Coordinates coord2 = new Coordinates(18, 27, 42);

		WeatherTower weather = new WeatherTower();
		Helicopter heli = new Helicopter(1, "coucou", coord);
		JetPlane jet = new JetPlane(2, "prout", coord2);
		Baloon bal = new Baloon(3, "oui", coord2);

		tower.register(heli);
		tower.register(jet);
		tower.register(bal);

		tower.conditionChange();
		tower.unregister(heli);

		// try
		// {
		// 	File file = new File(args[0]);
		// 	Scanner read = new Scanner(file);
		// 	String data = "";
		// 	while(read.hasNextLine()) {
		// 		data += read.nextLine();
		// 		data += "\n";
		// 	}
		// 	System.out.print(data);
		// 	read.close();
		// }
		// catch(FileNotFoundException e)
		// {
		// 	System.out.println("An error has occured.");
		// 	e.printStackTrace();
		// }
	}
}