import java.util.Arrays;

public class UniquenNumber {
		static int unique(int arr[], int n) {
			//Approach 1: Simple
			int i=0;
			while(i<n) {
				if(arr[i]!=arr[i+1]) {
					//System.out.println("The number without repeation is  " + arr[i]);
						return arr[i];
				}
				i=i+2;
			}
			return -1;
			
			//Approach-2:Hash
//			int hash[] = new int[100];
//			for(int i = 0; i < n; i++) {
//				hash[arr[i]] = ++hash[arr[i]];
//			}
//			for(int i = 0; i < hash.length; i++) {
//				if(hash[i] == 1) {
//					//System.out.println("The number without repeation is  " + i);
//					return i;
//				}
//			
//			}
//			return -1;
			
			//Approach-2:XOR
//			int ans=0;
//			for(int i = 0; i < n; i++) {
//				ans=ans^arr[i];
//			}
//			//System.out.println("The number without repeation is  " + ans);
//			return (ans>0 ? ans : -1);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,5,3,6,4,1,2,5,4,3,6};
		Arrays.sort(arr);
		int n=arr.length;
		System.out.println("Tushar Kumar Rajput ");
		//unique(arr,n);
		System.out.println("The number without repeation is  "+unique(arr,n));
	}

}
