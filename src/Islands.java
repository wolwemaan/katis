import java.util.Scanner;

public class Islands {

	static int memnum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		sc.nextLine();
		char[][] arr = new char[row][col];
		for (int i = 0; i < row; i++) {
			arr[i] = sc.nextLine().toCharArray();
		}

		sc.close();

		final char land = 'L';
		final char water = 'W';
		final char cloud = 'C';

		if (hor(arr, row, col, cloud) == (row * col) || hor(arr, row, col, cloud) == (row * col)) {
			System.out.println("0");
			return;
		}

		int hct = hor(arr, row, col, land, cloud);
		int vct = ver(arr, row, col, land, cloud);

		System.out.println(Math.abs(hct - vct));

	}

	private static int ver(char[][] arr, int row, int col, char c, char c2) {
		int res = 0;
		boolean unint = false;
		for (int j = 0; j < col; j++) {
			for (int i = 0; i < row; i++) {
				if (arr[i][j] == c || arr[i][j] == c2 ) {
					if (!unint) {
						res++;
						unint = true;
					}
				} else unint = false;
			}
		}
		return res;
	}

	private static int hor(char[][] arr, int row, int col, char c, char c2) {
		int res = 0;
		boolean unint = false;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == c || arr[i][j] == c2) {
					if (!unint) {
						res++;
						unint = true;
					}
				} else unint = false;
			}
		}
		return res;
	}
	
	private static int hor(char[][] arr, int row, int col, char c) {
		int res = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == c)
					res++;
			}
		}
		return res;
	}

}