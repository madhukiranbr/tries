
public class fibbonachi {

	public fibbonachi() {
		// TODO Auto-generated constructor stub
	}
	
	public static int fib_rec(int i){
		if (i <=1) return i;
		return fib_rec(i-1)+fib_rec(i-2);
	}
	public static int fib_iter(int i){
		int res=0;
		int k=2;
		int a=1,b=1;
		if (i<=1) return i;
		for(int j=0;j<i-2;j++){
			res =   a+b;
			a=b;
			b=res;
			
		}
		return res;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++){
		  System.out.println(fib_iter(i));
		}
		
		System.out.println(fib_iter(3));
	}

}
