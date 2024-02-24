public class longstring{
	public static void main(String[] args){

		String[] s = {"chat", "lion"};

		if(s == null || s.length == 0)
		{
			System.out.println("null");
			return;
		}
		int i = 0;
		int longlength  = s[0].length();
		String longstring = s[0];
		for(i = 0; i < s.length; i++)
		{
			if(s[i].length() > longlength)
			{
				longlength = s[i].length();
				longstring = s[i];
			}
		}
		System.out.println("the long string is :" + longstring);
	}
}	
