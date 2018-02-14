package ie.dit;

import java.util.ArrayList;
import java.io.BufferedReader;


public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();
	
	public Tune findTune(String title) //finds the title of the song in the array list of tunes
	{
		for(String tune:tunes)
        {
			if(tune.contains(title))
			{
				return title;
			}
        }
	}
}