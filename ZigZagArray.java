
public class ZigZagArray {
//	static void swap(int a,int b) {
//		int temp=a;
//		a=b;
//		b=temp;
//	}
    static void zigzag(int arr[],int n) {
    	int temp=0;
    	boolean flag=true;
    	for (int i=0;i<n-1;i++) {
    		if(flag) {
        		if(arr[i]>arr[i+1]) {
//        			swap(arr[i],arr[i+1]);
        			temp = arr[i];
    				arr[i] = arr[i + 1];
    				arr[i + 1] = temp;
        		}
        	}
    		else if (arr[i]<arr[i+1]) {
//        			swap(arr[i],arr[i+1]);
    			temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
        		}
    		flag = !flag;
        	
    	}
    	System.out.print("ZiZ Zag Array : ");
    	for (int c: arr) {
    	System.out.print(c+",");
    	}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,5,4,10,2,9};
		int n = arr.length;
		System.out.println("Tushar Kumar Rajput ");
		zigzag(arr,n);
	}

}
