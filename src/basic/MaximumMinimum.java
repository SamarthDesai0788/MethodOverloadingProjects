package basic;

public class MaximumMinimum {

	public static void main(String[] args) {
		        int[] values = {1, 3, 5, 7, 9, 11, 13};
		        int max = values[0];
		        int min = values[0];
		        for (int i = 0; i < values.length; i++) {
		            if (values[i] > max) {
		                max = values[i]; 
		            }
		            if (values[i] < min) {
		                min = values[i];
		            }
		        }
		        System.out.println("Maximum value: " + max);
		        System.out.println("Minimum value: " + min);
		    }
		}


	