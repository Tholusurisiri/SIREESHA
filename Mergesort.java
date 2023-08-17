public class Mergesort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		Array Declaration && creation
		System.out.println("enter the arr size ");
		 int[] arr = new int [scan.nextInt()];
		 System.out.println("enter the brr size ");
		 int[] brr = new int [scan.nextInt()];
		 System.out.println("enter the crr size ");
		 int[] crr = new int [scan.nextInt()];
		 
		 //Array initialization
		 System.out.println("enter the first array");
		 for(int i :arr)
		 {
			 System.out.print(i+" ");
		 }
		 System.out.println("enter the second  array");
		 for(int i :brr)
		 {
		System.out.print(i+" ");
		 }
	
		 // Array Traversing
		int[] crr mergeSortArrayElements(arr,brr);
		 System.out.println("enter the Merge  array");
		 for(int i :crr)
		 {
		System.out.print(i+" ");
		 }
}
	   

	public static int[] mergeSortArrayElements(int[] arr, int[] brr) {
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
	
		
		
	
	 

