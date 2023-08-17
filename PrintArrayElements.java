public class PrintArrayElements {

  public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		//Array Declarartion&& creation
	    int [] arr= new int[scan.nextInt()];
	    System.out.println("enter the data");
	
		//Array Intilization
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("enter the data"+(i+1)+" ");
		arr[i]= scan.nextInt();
		}
		copyArrayElement(arr);
	
	}

	public  static void copyArrayElement(int[] arr) {
		System.out.println("enter elements are");
	for(int i=0;i<arr.length;i++)
	{
	 
	System.out.println(arr[i]);
		
	}
}
}
