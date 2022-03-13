package tests;

public class StringReplace 
{
	public static void main(String[] args) 
	{
		String x = "jhgjhcfc657%^*kjh8787";
		String y = x.replaceAll("[^0-9]", "");
		System.out.println(y);
	}
}
