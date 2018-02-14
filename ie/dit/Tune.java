package ie.dit;

import java.util.ArrayList;
import java.io.BufferedReader;


public class Tune
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	ArrayList<String> words = new ArrayList<String>();
	
	public int getX()
	{
		return x;
	}
	
	public String toString()
    {
		loadText();
		
        StringBuffer sb = new StringBuffer();
        for(String word:words)
        {
			String number;
			String ww;
			
			if(word.contains("X:"))
			{
				number = word.substring(1,1); //gets the number of the tune
			}
			if(word.contains("T:"))
			{
				ww = word.substring(2);
				sb.append(number + ", " + ww); //appends the number then a comma and then the title of the tune
			}
        }

        return sb.toString();
	}
	
	public void loadText()
    {
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("hnj0.abc"));
            
            String l;
            while ((l = inputStream.readLine()) != null) {
                words.add(l);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
	
	 public static void main(String[] args)
	{
		Tune main = new Tune();
		
		main.toString();
	} 
}