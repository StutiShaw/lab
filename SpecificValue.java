package array;

public class SpecificValue {  // class 
	public static boolean contains(int[] arr, int item) {  // using for if loop to check element
	      for (int n : arr) {
	         if (item == n) {   // condition
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] my_array1 = { // initializing array
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
	      System.out.println(contains(my_array1, 2013));  // array initialization output
	      System.out.println(contains(my_array1, 2015));  // array initialization output
	   }
}
