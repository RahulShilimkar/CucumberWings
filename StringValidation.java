package BasicPackage;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Payment $100 paid";
		
		String str2 = new String("Payment done for $50");
		
		//To get char at 8th index.
		char value = str.charAt(8);
		System.out.println("Char at 8th point is "+value);
		
		//Getting Index of $
		int indexDollar = str2.indexOf("$");
		System.out.println("Dollar in String2 is at Index :- "+indexDollar);
		
		//Printing selected part
		
		System.out.println("Substring is "+str.substring(8));
		System.out.println("Substring at interval from 8 to 15 is "+str2.substring(8, 15));
		
		

	}

}
