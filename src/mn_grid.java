
public class mn_grid {

	public mn_grid() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr={
				{1,1,0,0},
				{0,1,0,0},
				{0,0,1,0},
				{0,0,1,1}
		};
		//
		System.out.println(check_path(arr,0,0));
	}

	private static int  check_path(int[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		if(row> arr[0].length-1 || col > arr.length-1||  arr[row][col]==0) return 0;
		if (row >= arr[0].length-1 && col >=arr.length-1)return 1;
		//if (row == arr[0].length && col == arr.length)return true;
		
		else {
			//return check_path(arr, row, col+1)+check_path(arr, row+1, col)+check_path(arr, row+1, col+1);
			int a = check_path(arr, row, col+1);
			if( a == 1){
				System.out.println(row +"|"+(col+1));
			}
			int b = check_path(arr, row+1, col);
			if(b == 1){
				System.out.println((row+1) +"||"+col);
			}
			int c=check_path(arr, row+1, col+1); 
			if(c == 1){
				System.out.println((row+1) +"|||"+(col+1));
			}
			return a+b+c;
		}
	}

}
