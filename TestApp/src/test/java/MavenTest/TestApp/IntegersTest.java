package MavenTest.TestApp;

import junit.framework.TestCase;


public class IntegersTest extends TestCase
{
   

    private Integers integer;
    
 
	//isEven Tests
	
	public void testEven1()
	{
		int number = 0;
		integer = new Integers();
		assertEquals(true, integer.isEven(number));
	}
	
	public void testEven2()
	{
		int number = 3;
		integer = new Integers();
		assertEquals(false, integer.isEven(number));
	}
	
	public void testEven3()
	{
		int number = 6;
		integer = new Integers();
		assertEquals(true, integer.isEven(number));
	}
	
	//isPrime tests
	
	
	public void testPrime1()
	{
		int number = 1;
		integer = new Integers();
		assertEquals(false, integer.isPrime(number));
	}
	
	public void testPrime2()
	{
		int number = 3;
		integer = new Integers();
		assertEquals(true, integer.isPrime(number));
	}
	
	public void testPrime3()
	{
		int number = 110;
		integer = new Integers();
		assertEquals(false, integer.isPrime(number));
	}
	
	public void testPrime4()
	{
		int number = 113;
		integer = new Integers();
		assertEquals(true, integer.isPrime(number));
	}
	//isPalindrome tests
	
	public void testPalindrome1()
	{
		int number = 10;
		integer = new Integers();
		assertEquals(false, integer.isPalindrome(number));
	}
	
	public void testPalindrome2()
	{
		int number = 101;
		integer = new Integers();
		assertEquals(true, integer.isPalindrome(number));
	}
	
	public void testPalindrome3()
	{
		int number = 123321;
		integer = new Integers();
		assertEquals(true, integer.isPalindrome(number));
	}
}
