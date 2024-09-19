package BasicPackage;

public class ArraysMultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];  //2 row's and 3 column's.
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		System.out.println(a[1][2]);
		
		int b[][] = {{1,2,3},{4,5,6}};
		System.out.println(b[0][1]);
			
		for(int i = 0 ; i < a.length;i++)  //a.length -> will give number of rows.
		{
			for(int j = 0 ; j < a[i].length;j++)  //a[i].length -> will give number of entries/column in row's.
			{
				System.out.println("Value at ["+i+"]["+j+"]"+" is "+a[i][j]);
			}
		}
		

	}

}
