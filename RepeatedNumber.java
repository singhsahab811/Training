public class RepeatedNumber {
	static void printRepeating(int arr[], int size) 
	{/*
		 * int count[] = new int[size]; int i;
		 * 
		 * System.out.println("Repeated elements are : "); for (i = 0; i < size; i++) {
		 * if (count[arr[i]] == 1) System.out.print(arr[i] + " "); else count[arr[i]]++;
		 * }
		 */
		int i;
        System.out.println("The repeating elements are : ");
         
        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    
    }
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
		int n=arr.length;
		System.out.println("Tushar Kumar Rajput ");
        printRepeating(arr, n);
		
	}
}
