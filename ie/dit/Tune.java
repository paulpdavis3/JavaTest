package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Tune
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	public int getX()
	{
		return x;
	}
	
	public String toString()
    {
        StringBuffer sb = new StringBuffer();
        for(String word:words)
        {
            sb.append(word + ", \n");
        }

        return sb.toString();
}