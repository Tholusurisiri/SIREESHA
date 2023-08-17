public class Binarysearch {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter  element  Sorting  for a size");
    //Array Declaration && Creation
    int[] arr = new int[scan.nextInt()];
    //Array Initialization
    for(int i=0;i<arr.length;i++)
    {
     System.out.println("enter the data element"+(i+1)+"  ");
     arr[i]= scan.nextInt();
    }
    int element;
    System.out.println("enter the element");
    element= scan.nextInt();
	
    isElementFoundOrNot(arr,element);
}
	
//METHOD TO KNOW THAT ELEMENT IS FOUND OR NOT IN A ARRAY
	public static void isElementFoundOrNot(int[] arr, int element) {
		 int position =-1;
		 int low=0;
		 int high = arr.length-1;
		 boolean isElementfound=false;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(element==arr[mid])
			{
				isElementfound=true;
				position= mid++;
				break;
			}
			else if(element>arr[mid])
			{
				low =mid+1;
				high=high;
			}
			else
			{
				high = mid -1;
				low =low;
			}
		}
		if(isElementfound==false)
		{
			System.out.println("element is not found in any position");
		}
		else 
		{
			System.out.println("element is found "+position);	
		}
	}
}
		
		
	

	
		