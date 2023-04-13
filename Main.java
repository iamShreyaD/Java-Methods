
public class Main
{
	public static void main(String[] args)
	{
		String name = "Shreya";
		
		// this is the equals method which checks if the word is a replica although this case sensitive
		boolean result = name.equals("shreya");
		System.out.println(result);
		
		// this is the same method as last one just it is not case sensitive
		boolean result1 = name.equalsIgnoreCase("shreya");
		System.out.println(result1);
		
		// this method displays the length of thw word
		int result2 = name.length();
		System.out.println(result2);
		
		// this method returns the character at the given index
		char result3 = name.charAt(3);
		System.out.println(result3);
		
		// this method returns the integer at which the character is placed although this is case sensitive
		int result4 = name.indexOf("S");
		System.out.println(result4);
		
		// this method checks if the provided string is empty
		boolean result5 = name.isEmpty();
		System.out.println(result5);
		
		// this method displays the name in upper case
		String result6 = name.toUpperCase();
		System.out.println(result6);
		
		// this method displays the name in lower case
		String result7 = name.toLowerCase();
		System.out.println(result7);
		
		// in case the provided string has spaces before or after the letters, it trims it completely
		String result8 = name.trim();
		System.out.println(result8);
		
		// this result helps in replacing the certain character in the string
		String result9 = name.replace('e', 'o');
		System.out.println(result9);
	}
}
