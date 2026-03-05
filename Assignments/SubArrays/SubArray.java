public class SubArray
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {1,2,3,4};
		subArray(arr);
	}
	
	public static void subArray(int[] arr) {
	    for (int i = 0; i< arr.length; i++) {
	        
	        for(int j = i; j < arr.length; j++) {
    	        System.out.print("[");
	            for(int k = i; k <= j; k++) {
	             if (k == j) System.out.print(arr[k]);
	             else System.out.print(arr[k]+",");
	            }
	            System.out.print("] ");
	        }
	    }
	}
}