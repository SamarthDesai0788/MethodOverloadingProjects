package basic;

public class Array {

	public static void main(String[] args) {
		int numbers[]=new int[5];
		numbers[0]=23;
		numbers[1]=45;
		numbers[2]=12;
		numbers[3]=11;
		numbers[4]=67;
System.out.println(numbers[0]);		
System.out.println(numbers[1]);
System.out.println(numbers[2]);
System.out.println(numbers[3]);
System.out.println(numbers[4]);
System.out.println("length:"+numbers.length);
	for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
	}//original array
	int arr[]= {1,3,5,7,9,11,13};
	System.out.println("length of array 2:"+arr.length);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	
	
	
	//reverse array
	int values[]= {1,3,5,7,9,11,13};
	System.out.println("length of array 2:"+values.length);
	for(int j=values.length-1;j>=0;j--) {
		System.out.println(values[j]);
	}
	}
	}
}





