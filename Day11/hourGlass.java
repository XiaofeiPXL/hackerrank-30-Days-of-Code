public static int hourGlass(int[][] task) {
	   int Max = Integer.MIN_VALUE;
	   for(int row=0;row<4;row++){
		   for(int col=0;col<4;col++){
			   int sum = sum(task,row,col);
			   Max = Math.max(Max, sum);
		   }
	   }
        return Max;
	}
	
	public static int sum(int[][] task, int r, int c)
	{
		int sum = task[r][c] + task[r][c+1] + task[r][c+2] + 
				task[r+1][c+1] + 
				task[r+2][c] + task[r+2][c+1] + task[r+2][c+2];
		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
        System.out.println(hourGlass(arr));
		scanner.close();
	}