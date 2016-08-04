package sorts;

public class selection {

	public selection() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,5,6,4,32,5,456,2,3,545,23,3,3,2};
		int[] nar = {45,2,1};
		selection_sort(nar);
	}

	private static void selection_sort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		
		for(int i=0;i<len -1;i++){
			int min = i;
			for(int j=i+1;j<len;j++){
				if(arr[j] < arr[min]){
					//swap(arr,j,min);
					min = j;
				}
			}
			if(min != i){
				int tmp=arr[i];
				arr[i]=arr[min];
				arr[min]=tmp;
			}
		}
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		int t=0;
		swap(t);
		System.out.println(t);
		
	}
	private static void swap(int a) {
		// TODO Auto-generated method stub
		 a=5;
		
	}

}
