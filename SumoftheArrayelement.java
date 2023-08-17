public class SumoftheArrayelement {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     //Array Declaration&& creartion
		System.out.println("enter array size");
		int[] arr= new int[scan.nextInt()];
		// Array Intilization
		
		System.out.println("enter the data");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("enter the arr"+(i+1)+" values");
		arr[i]=scan.nextInt();
		}
		sumoftheArrayElement(arr);
		scan.close();
	}

	// Array Travsersing
	    


	private static int  sumoftheArrayElement(int[] arr) {
		int sum=0;
		
	for(int i=0;i<arr.length;i++)
	{
		sum =sum+arr[i];
		System.out.println(sum);
	}
	return sum;	
	}
		
	}


