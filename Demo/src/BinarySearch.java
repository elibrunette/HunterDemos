
public class BinarySearch {
	public static void main(String ...strings) {
		int b[] = { 2, 5, 7};

		int element = -1;
		for( int x = 0; x < b.length; x++) {
			element = b[x];
			int result = binarySearch(b, element);
			System.out.println("Resulting index for first test array: " + result);
		}

		System.out.println("\n\n\n");
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for( int x = 0; x < a.length; x++) {
			element = a[x];
			int result = binarySearch(a, element);
			System.out.println("Resulting index for first test array: " + result);
		}
		
		System.out.println("\n\n\n");
		int c[] = { 2, 5, 7, 9};
		
		for( int x = 0; x < c.length; x++) {
			element = c[x];
			int result = binarySearch(c, element);
			System.out.println("Resulting index for first test array: " + result);
		}
		
	}
	
	public static int binarySearch(int[] a, int element) {
		int max = a.length - 1;
		int min = 0;
		
		while(max >= min) {
			int mid = ((max + min) /2);
			
			if(a[mid] == element) {
				return mid;
			} else if(a[mid] < element) {
				min = mid + 1;
			} else { 
				max = mid - 1;
			}
			
		}
		return -1;
		
	}
}
