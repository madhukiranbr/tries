
public class largest_palindrome_string {

	public largest_palindrome_string() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abccbac";
		lps(str.toCharArray());
	}

	private static void lps(char[] ip) {
		// TODO Auto-generated method stub
		int last = ip.length;
		int maxlen=1;
		int start =0;
		for(int i=0;i<ip.length;i++){
			int low=i-1;int high=i;
			while(low >=0 && high < ip.length && ip[low] == ip[high]){
				if(high-low+1 > maxlen){
					maxlen = high-low+1;
					start = low;
				}
				low--;
				high++;
			}
			
			low=i-1;high=i+1;
			while(low >=0 && high < ip.length && ip[low] == ip[high]){
				if(high-low+1 > maxlen){
					maxlen = high-low+1;
					start = low;
				}
				low--;
				high++;
			}
		}
		String a= new String(ip);
		System.out.println(a.substring(start, start+maxlen));
	}

}
