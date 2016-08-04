
public class revstr_inplace {

	public revstr_inplace() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1234567";
		//reverse_str(s.toCharArray());
		int i=1234;
		revint(i);

	}

	private static void revint(int i) {
		// TODO Auto-generated method stub
		int res=0;
		while(i!=0){
			int tmp=i%10;
			i=i/10;
			res =res*10+ tmp;
		}
		System.out.println(res);
	}

	private static void reverse_str(char[] s) {
		// TODO Auto-generated method stub
		int length= s.length;
		int i=0;
		while(i < length/2){
			//swap(s[i],s[length-1-i]);
			char t=s[i];
			s[i]=s[length-1-i];
			s[length-1-i]=t;
			i++;
		}
		System.out.println(new String(s));
	}



}
