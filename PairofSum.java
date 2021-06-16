import java.util.Arrays;

public class PairofSum {
	//Approach 1:normal
//		static void pairSum(int arr[]) {
//			int n = arr.length;
//			int k = 10;
//			int sum = 0;
//			for(int i = 0; i < n; i++) {
//				for(int j = i + 1; j < n; j++) {
//					sum = arr[i] + arr[j];
//					if(sum == k) {
//						System.out.println("K"+k+" is sum of  " + arr[i] + "&" + arr[j]);
//						return;
//					}
//				}
//			}
//		}
		//Approach 2: hash
//		static void pairSum(int arr[]) {
//			int n = arr.length;
//			int k = 10;
//			int hash[] = new int[10]; 
//			for(int i = 0; i < n; i++) {
//				int index = k - arr[i];
////				System.out.print(index+",");
//				if(hash[index] == 1) {
//					System.out.println("K"+k+" is sum of  " + arr[i] + "&" + index);
//					break;
//				}
//				hash[arr[i]] = 1;
//			}
//		}
	//Approach 3: two pointer algo
		static void pairSum(int arr[]) {
			int n=arr.length;
			Arrays.sort(arr);
			int k=5;
			int i=0;
			int j=n-1;
			while(i<j) {
				if((arr[i]+arr[j])==k) {
					System.out.println(k+" is sum of  " + arr[i] + " & " + arr[j]);
					return;
				}
				else if((arr[i]+arr[j])<k){
					i++;
				}
				else if((arr[i]+arr[j])>k) {
					j--;
				}
			}
		
		}
		public static void main (String[] args) {
			// TODO Auto-generated method stub
			int arr[] = {1,4,5,6,3,8};
			System.out.println("Tushar Kumar Rajput ");
			pairSum(arr);

		}

	}
	
	
