
public class intro_comma {

	public intro_comma() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ip=1100000;
		char style='i';
		String res=intro_comma_method(ip,style);
		//System.out.println(res);
	}
	static String intro_comma_method(int ip,char style){
		String res="";
		int offset =3;
		//if(style == 'i') offset=2;
		int i=0;
		while(ip!=0){
			int tmp=ip%10;
			res=res+ Integer.toString(tmp);
			ip=ip/10;
		}
		//for(int i1=0;i1<arr.length;i1++)
		//System.out.println(res);
		char[] a = res.toCharArray();
		res="";
		for(int j=a.length-1;j>=0;j--){
			if((j+1 < a.length)&&(j+1)%offset==0){
				res=res+",";
				if(style == 'i')
					offset=2;
				
			}
			res=res+Character.toString(a[j]);
			
		}
		System.out.println(res);

		return res;
	}
}
