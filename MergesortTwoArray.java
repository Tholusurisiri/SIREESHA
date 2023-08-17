public class MergesortTwoArray {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter  element Array for a size");
	//Array Declaration && creation
	System.out.println("enter the Array element ");
	 int[] arr = new int [scan.nextInt()];
	 System.out.println("enter the Array element ");
     int[] brr = new int [scan.nextInt()];
     // Array Intilization
     System.out.println("enter the first array");
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println("enter the data"+(i+1)+" ");
		 arr[i]= scan.nextInt();
	 }
	
	 System.out.println("enter the second array");
	 for(int i=0;i<brr.length;i++)
	 {
		 System.out.println("enter the data"+(i+1)+" ");
	 
	 
		 brr[i]= scan.nextInt();
	 }
	

	int[] crr = mergeSortTwoElements(arr,brr);
	System.out.println("merged array elements are = ");
	for(int i=0;i<crr.length;i++)
	{
		System.out.println(crr[i]);
	}
	scan.close();
}

	  static int[]  mergeSortTwoElements(int[] arr, int[] brr) {
		 int[] crr = new int[arr.length+brr.length];
			for(int i=0;i<arr.length;i++)
			{
				crr[i]=arr[i];
			}
				int j=0;
				for(int i=arr.length; i<crr.length;i++)
				{
					crr[i]=brr[j];
					j++;
				}
				return crr;
			
			}	
		}
	
		
	


	

      

	 
	

		

	 

     
