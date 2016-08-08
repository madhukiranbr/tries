import java.util.Arrays;


public class parity {

	public parity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s ="1111";
		find_parity(s.toCharArray());
	}

	private static void find_parity(char[] ip) {
		// TODO Auto-generated method stub
		int len = ip.length;
		char prev ='0';
		int parity=0;
		byte[] by = new byte[len];
		for(int i=0;i<len;i++){
			String c = String.valueOf(ip[i]);
			parity = ip[i] ^ prev;
			prev=ip[i];
		}
		System.out.println(parity +" is the parity of string "+ new String(ip));
	}

}
