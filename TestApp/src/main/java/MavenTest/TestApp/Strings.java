package MavenTest.TestApp;




/**
 * Hello world!
 *
 */
public class Strings 
{
    public static void main( String[] args )
    {
        new Strings();
        String out = new Strings().reverseString("123");
        System.out.println(out);
    }
    
	public String reverseString(String input)
	{
	  
		String output ="";
          
        output = new StringBuilder(input).reverse().toString(); 
	            
	    return output;
	
	}
}
