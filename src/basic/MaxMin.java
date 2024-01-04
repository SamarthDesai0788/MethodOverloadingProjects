package basic;

public class MaxMin {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,50,68,28};
			int minimum=arr[0];
			
			for(int i=1;i<=arr.length;i++) {
				if(arr[i]<minimum) {
				minimum=arr[i];
			}
				System.out.println("minimum element the given value: "+minimum);
			
				}
			}
		        
}