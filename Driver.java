import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String go = "yes";
		while(!go.equals("no"))
		{
			System.out.println("Provide a word to be encrypted");
			String input = sc.nextLine();
			Cipher c = new Cipher(input,7,35);
			c.encrypt();
			System.out.println("again?");
			go = sc.nextLine();
		}
		
	}
}
