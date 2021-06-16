
public class MissingNumber {
    static int missing(int arr[], int n) {
    	// Approach 1
    	//for 1 to n naturaal numbers
    	int missing=0;
//    	int sum=0;
//    	for (int i=0;i<n;i++) {
//    		sum+=arr[i];
//    	}
//    	int total=(n+1)*(n+2)/2;
//    	missing=total-sum;

    	//Approach 2-Xor
    	int x = 0;
		int y = 0;
		int min = 1;
		int max = n+1;//size of array
		
		for(int i = 0; i < n; i++) {
			x = x ^ arr[i];
//			System.out.println(x);
		}
		for(int i = min; i <= max; i++) {
			y = y ^ i;
		}
		missing = x ^ y;
    	return missing;
    }
	public static void main(String[] args) {
		
		int arr[]= {20,25,21,22,23}; 
		int n=arr.length;
		System.out.println("Tushar Kumar Rajput ");
		System.out.println("Missing Number is "+missing(arr,n));
	}

}
