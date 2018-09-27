import java.util.Scanner;

public class Stack {

	static int memnum = 0;

	static char arr[];
	static int ctr;
	static final char charNull = '\u0000';

	boolean isEmpty() {
		return (ctr < 0);
	}

	// Is already on stack?
	static boolean already(char val) {
		if (arr.length > 0)
			for (char value : arr) {
				if (val == value)
					return true;
			}
		return false;
	}

	static boolean push(char val) {
		if (ctr >= (2000 - 1)) {
			System.err.println("invalid: too many in stack");
			return false;
		}
		arr[++ctr] = val;
		System.out.println(val + " push ok");
		return true;

	}

	static char pop() {
		if (ctr < 0) {
			System.err.println("invalid: stack less than 0");
			return charNull;
		}
		char val = arr[ctr--];
		return val;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		int n = Integer.valueOf(sc.nextLine()).intValue();
		for (int i = 0; i++ < n;) {
			char[] s = sc.nextLine().toCharArray();
			ctr = -1;
			arr = new char[2000];
			System.out.println("[" + getstring(s) + "]n=" + s.length);
			for (int j = 0; j < s.length; j++) {
				if (already(s[j]))
				boolean ok = push(s[j]);
				char result = pop();
				System.out.println(result);
			}
			if (i == 1) break;

		}
		sc.close();

		System.out.println(ans);

	}

	private static String getstring(char[] s) {
		String ans = "";
		for (char val : s) {
			ans += val;
		}
		return ans;
	}

}