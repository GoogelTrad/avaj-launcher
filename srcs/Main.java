package srcs;
import java.io.File; 
import java.io.FileNotFoundException;
import java.text.spi.NumberFormatProvider;
import java.util.ArrayList;
import java.util.Scanner;

import aircraft.Baloon;
import aircraft.Helicopter;
import aircraft.JetPlane;

public class Main 
{
	public static void main(String[] args)
	{
		ArrayList<String> data = new ArrayList<String>();
		try
		{
			File file = new File(args[0]);
			Scanner read = new Scanner(file);
			while(read.hasNextLine()) {
				data.add(read.nextLine());
			}
			// System.out.print(data);
			read.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
		for (String item : data) {
            System.out.println(item);
        }
	}

	public boolean check_scenario(ArrayList<String> data)
	{
		int cycle = 0;
		if (data.size() >= 0)
		{
			try {
				cycle = Integer.parseInt(data.getFirst());
			}
			catch (NumberFormatException e) {
				System.out.println("Error : Intructions incorrect !");
				return false;
			}

			if (cycle <= 0)
			{
				System.out.println("Error : First line is incorrect !");
				return false;
			}
		}
		for (String element : data) 
		{
			String[] split = element.split(" ");

			for (int k = 0; k < split.length; k++) 
			{
				if (split.length >= 0 && !isClassExisting(split[0])) 
				{
					System.out.println("Error : " + split[0] + " is not an existant class !");
					return false; 
				}
				for (int j = 2; j < 5; j++)
				{
					if (checkIfInteger(split, j) == false)
						return false;
				}
			}
		}
		return true;
	}


	public static boolean isClassExisting(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

	private static boolean checkIfInteger(String[] array, int index) {
        if (index >= array.length || array[index] == null) {
            return false;
        }

        try {
            int value = Integer.parseInt(array[index]);
        } catch (NumberFormatException e) {
            System.out.println("Error : Coordinate number" + index + " is not valid !");
			return false;
        }
		return true;
    }
}
