package MavenTest.TestApp;



public class Integers
{
	public static void main(String[] args)
	{
		new Integers();
	}
	public boolean isEven(int number)
	{
		if(number%2 == 0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isPrime(int number)
	{
		if(number < 2) {
		      return false;
		    }
	    if (number % 2 == 0)
	    {
	    	return false;
	    }
	   
	    for(int i = 3; i*i <= number ; i += 2) 
	    {
	        if(number % i == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
	
	public boolean isPalindrome(int number) 
	{
		int divide = 1;
		
	    if (number < 0)
	    {
	        return false;
	    }
	    
	    while (number / divide >= 10) {
	        divide *= 10;
	    }
	    
	    while (number != 0) 
	    {
	        int i = number / divide;
	        int real = number % 10;
	        if (i != real)
	        {
	            return false;
	        }
	        number = (number % divide) / 10;
	        divide /= 100;
	    }
	    
	    return true;
	}
}
