package practice;

public class permutation {
	public static void swap(char [] arr, int i, int j){
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void perm(char[] arr, int i ,int j){
		if(i==j) System.out.println(arr);
		else {
			for(int k=i;k<j;k++){
				swap(arr,i,k);
				perm(arr,i+1,j);
				swap(arr,i,k);
			}
		}
	}
	
	static String in;
	static StringBuilder res = new StringBuilder();
	public static void combine(int start){
		for(int i=start;i<in.length();i++){
			res.append(in.charAt(i));
			System.out.println();
			combine(i+1);
			res.setLength(in.length()-1);
		}
		res.append(in.charAt(in.length() -1));
		System.out.println(res);
		res.setLength(in.length()-1);
	}
	public static void main(String[] args){
		//perm("123".toCharArray(),0,3);
		in = "1234";
		combine(0);
		
	}
	
}
