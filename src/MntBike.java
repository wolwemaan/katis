import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MntBike {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		double v = 0;
		int n = 0;
		double g = 0;
		List<Val> list = null;

//		try {
			n = sc.nextInt();
			g = sc.nextDouble();

			list = new ArrayList<Val>(n);
			while (i < n) {
				int d = sc.nextInt();
				int o = sc.nextInt();
				list.add(new Val(d, o));
				i++;
			}
//		} catch (RuntimeException m) {
//			return;
//		}
		sc.close();

		StringBuffer s = new StringBuffer("");
		for (i = list.size() - 1; i >= 0; i--) {
			Val val = list.get(i);
			v = calc(g, val.getD(), val.getO(), v);
			s.insert(0, String.format("%.5f%n", v));
		}
		System.out.print(s.toString());

	}

	static class Val {
		int d;
		int o;

		public Val(int d, int o) {
			super();
			this.d = d;
			this.o = o;
		}

		/**
		 * @return the d
		 */
		public int getD() {
			return d;
		}

		/**
		 * @return the o
		 */
		public int getO() {
			return o;
		}

	}

	private static double calc(double g, int d, int o, double v) {

		double a = g * Math.cos(Math.toRadians(o));
		// System.out.println(a);
		double res = Math.sqrt(2 * a * d + (v * v));
		// System.out.println(res);

		return res;
	}

}