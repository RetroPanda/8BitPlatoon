package MavenTest.TestApp;

import junit.framework.TestCase;




/**
 * Unit test for simple App.
 */
public class StringsTest extends TestCase
{
 
   
	private Strings test;

	public void testReverseString1()
	{
		test = new Strings();
		String out = test.reverseString("HelloWorld");
		assertEquals("dlroWolleH",out);
		
	}

	public void testReverseString2()
	{
		
		test = new Strings();
		String out = test.reverseString("8BitPlatoon");
		assertEquals("nootalPtiB8", out);	
	
	}
	
}
