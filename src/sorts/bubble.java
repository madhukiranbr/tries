package sorts;

public class bubble {

	public bubble() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,7,53,6,4,5,34,34,6,4,2};
		bubble_sort(arr);
	}

	private static void bubble_sort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		for(int i=0;i<len;i++){
			boolean swapped = false;
			for(int j=1;j<len;j++){
				if(arr[j-1] > arr[j]){
					swapped = true;
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
			if(!swapped){
				//everything should be sorted
				break;
			}
		}
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
