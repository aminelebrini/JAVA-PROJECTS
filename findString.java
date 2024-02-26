public class findString{
	public static void main(String[] args)
	{
		String[] s = {"dog", "lion", "cat"};

		String d = "cat";

		if(s==null)
		{
			System.out.println('0');
		}
		for(int i = 0; i < s.length; i++)
		{
			if (s[i].equals(d))
			{
				System.out.println("0");
			}
			else
			{
				System.out.println("1");
			}
		}
	}
}
