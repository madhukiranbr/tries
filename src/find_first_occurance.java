
public class find_first_occurance {

	public find_first_occurance() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String ip="00000000000000001111111111111";
		int val = mod_bin_srch(ip.toCharArray());
		System.out.println(val);
		int[] a={1,2,3,4,56,88};
		//System.out.println(binary_search(a,6));
	}

	private static int mod_bin_srch(char[] ip) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = ip.length;
		if(ip.length > 0 && ip[0] == '1')
			return 1;
		while( low <= high){
			int mid;
		    mid = (low + high) / 2;
		    //System.out.println(mid);
		    if (mid+1 < ip.length && ip[mid] == '0' && ip[mid+1] == '1')
		    	return mid+2;
		    else if (mid+1 < ip.length && ip[mid] == '0' && ip[mid+1] == '0')
		    	low = mid + 1;
		    else 
		    	high = mid -1;
		}
		return -1;
	}
	
	static int binary_search(int[] arr, int key) throws Exception{
		int length = arr.length;
		int low=0;
		int high= length -1;
		
		while(low<=high){
			int mid=high-low/2;
			
			if(arr[mid] == key){
				return mid;
			}
			if(arr[mid] > key){
				high = mid-1;
			}
			else{
				low = mid+1;
			}
		}
		throw new Exception();
	}
	
	

}
