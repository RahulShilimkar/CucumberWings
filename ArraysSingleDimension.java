package BasicPackage;

public class ArraysSingleDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays is a container which can store's multiple value's of same Data type.
		
		int a[] = new int[5]; //Declaration of  Array
		a[0] = 2; //Valuing into the Array
		a[1] = 4;
		a[2] = 6;
		a[3] = 27;
		a[4] = 5;
		
		for(int i = 0; i < a.length;i++)
		{
			System.out.println("Array value at position "+i+" is "+a[i]);
		}
		
		int b[] = {1,2,3,4,5};
		for(int j = 0; j < b.length;j++)
		{
			System.out.println("Array value at position "+j+" is "+b[j]);
		}
	}

}
