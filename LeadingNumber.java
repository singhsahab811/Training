
public class LeadingNumber {
	static void leading(int arr[]) {
		int n=arr.length;
		int max =0;
		for (int i=n-1;i>0;i--) {
			if(arr[i]>max) {
				System.out.println("Leader is "+arr[i]);
				max=arr[i];
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,12,5,23,11,10};
		System.out.println("Tushar Kumar Rajput ");
		leading(arr);
	}

}
