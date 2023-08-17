public class MaxMinProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration & Creation
		System.out.println("enter the size");
		int[] arr = new int[scan.nextInt()];
		//Array IntiliZation
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the values");
			arr[i]= scan.nextInt();
		}
			//Array Traversing
		
		
		 int max=-2147483648,min=2147483647;
			for(int i=0;i<arr.length;i++)
			{
					
			 if(arr[i]>max)
			{
			 max=arr[i];
			}
			}
	System.out.println("largest number is"+max);
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min =arr[i];
		}
	}
	System.out.println("smallest number is"+min);
	}
}

	
			