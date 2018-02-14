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
	
	public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        Tune t = tb.findTune("Scotsman over the Border");
        t.play();
    }
}