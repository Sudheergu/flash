package codingExamAapna;

import org.junit.Test;

public class SecondCode 
{
	@Test
	public void ifFantastic()
	{
		String[] StringValue = new String[5];   // Allocating memory Dynamically
		StringValue[0] = "Fantastic";           // String at 1st position
		StringValue[1] = "Fantastically";       // String at 2nd position
		StringValue[2] = "Anjali";              // String at 3rd position
		StringValue[3] = "Rohan";               // String at 4th position
		StringValue[4] = "Sudhir";              // String at 5th position
		String fant = "Fantastic";             // String to be compared with
		int len= fant.length();
		for(int i=0;i<5;i++)
		{
			int lengString=StringValue[i].length();
			if(len==lengString)                           // if compared strings length is unequal no need to compare the String
			{
				
				if(fant==StringValue[i])
				{
					System.out.println("Successful");
				}
				else
					System.out.println("Unsuccessful");	
			}
			else 
				System.out.println("Unsuccessful");
		}
	}
}
