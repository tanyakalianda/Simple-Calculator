
public class CalculatorMain 
{

	public static void main(String[] args)
	{
		//This is how we create an object
		// new --> Java keyword which creates an object
		Calculator calc = new Calculator(); 
		System.out.println(calc.add(2, 6));
		System.out.println(calc.subtract(9, 4)); 
		
		String name = "The difference of 9 and 4 is "; 
		System.out.println(name + calc.subtract(9, 4));
	}
	

}
