
public class Cipher
{
	private String input;
	private String encrypted;
	private int a;
	private int b;
	private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
			'r','s','t','u','v','w','x','y','z'};
	private int[] numAlpha = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
	
	public Cipher(String input, int a, int b)
	{
		this.input = formatString(input);
		this.a = a;
		this.b = b;
		encrypted = "";
	}
	
	public String encrypt()
	{
		for(int i = 0; i < input.length(); i++)	
		{
			for(int k = 0; k < 26; k++)
			{
				if(input.charAt(i) == alphabet[k])
				{
					int num = numAlpha[k];						
					int num1 = ((a*num + b)%26);
					for(int j = 0; j < 26; j++)
					{
						if (num1 == j)
						{
							encrypted = encrypted + alphabet[j];
						}
					}
				}
			}
		}
		System.out.println(encrypted);
		return encrypted;
	}
	
	private String formatString(String origString)
	{
		return (origString != null) ? origString.replaceAll("\\s+", "").toLowerCase() : "";
	}
	
}
