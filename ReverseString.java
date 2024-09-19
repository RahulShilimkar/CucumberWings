package BasicPackage;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "Rahul";
		System.out.println("Original string is :- "+original);
		String dummy = "";
		
		for(int i = original.length()-1;i>=0;i--)
		{
			dummy = dummy + original.charAt(i);
		}
		
		System.out.println("Dummy string is now:- "+dummy);
		
		String palindrom = "madam";
		System.out.println("Original string2 is :- "+palindrom);
		String proxy = "";
		
		for(int i = palindrom.length()-1;i>=0;i--)
		{
			proxy = proxy + palindrom.charAt(i);
		}
		
		System.out.println("Dummy string is now:- "+proxy);
		
		if(proxy.equals(palindrom))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Hard luck");
		}

	}

}
