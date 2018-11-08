import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Classy {
	final private static Map<String, Integer> map = new HashMap<String, Integer>(3);

	public static void main(String[] args) {

		List<Klas> klasList = new ArrayList<Klas>();
		Scanner sc = new Scanner(System.in);

		map.put("upper", Integer.valueOf(3));
		map.put("middle", Integer.valueOf(2));
		map.put("lower", Integer.valueOf(1));
		int n = sc.nextInt();
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {

			try {

				for (int j = 0; j < t; j++) {

					String line[] = sc.nextLine().split(":?\\s");
					String name = line[0];
					List<Integer> klas = getKlas(line[1].split("-"));
					strip(klas);
					// print(name, klas);
					klasList.add(new Klas(name, klas));
					// System.out.println(line[2]);

				}
			} catch (RuntimeException e) {
				System.out.println("dead2");
				System.exit(0);
				return;
			}

			//
			// a negative integer : first argument is less than,
			// zero, : first equal to,
			// a positive integer : first arg greater than the second.
			Collections.sort(klasList, new Comparator<Klas>() {

				@Override
				public int compare(Klas arg0, Klas arg1) {
					int ans = 0;

					// arg0.getKlas().get(ListEx.field).compareTo(arg1.getKlas().get(ListEx.field));
					List<Integer> list0 = arg0.getKlas();
					List<Integer> list1 = arg1.getKlas();
					int max = (list0.size() > list1.size()) ? list0.size() : list1.size();
					for (int m = 0; m < max; m++) {
						if (m == list0.size() || m == list1.size()) {
							if (m == list0.size())
								ans = 1;
							else if (m == list1.size())
								ans = -1;
							else if (m == list0.size() && m == list1.size())
								ans = 0;
							break;
						}
						int a = list0.get(m).intValue();
						int b = list1.get(m).intValue();
						if (a > b) {
							ans = -1;
							break;
						} else if (a < b) {
							ans = 1;
							break;
						} else if (a == b)
							ans = 0;
						// System.out.println("aname=" + arg0.getName() + ",bname=" + arg1.getName() +
						// ",a=" + a + ",b="
						// + b + ",ans=" + ans);
					}
					// System.out.println("before name compare:" + ans);
					if (ans == 0)
						return arg0.getName().compareTo(arg1.getName());
					return ans;
				}
			});
			for (Klas klas : klasList) {
				System.out.println(klas.getName());
			}
			System.out.println("==============================");

		}
		sc.close();

		// System.out.println(ans);

	}

	static class Klas {
		private List<Integer> klas;
		private String name;

		public Klas(String name, List<Integer> klas) {
			super();
			this.klas = klas;
			this.name = name;
		}

		public List<Integer> getKlas() {
			return klas;
		}

		public String getName() {
			return name;
		}

	}

	private static void strip(List<Integer> klas) {
		try {

			if (klas.get(klas.size() - 1) == Integer.valueOf(2)) {
				klas.remove(klas.size() - 1);
				strip(klas);
			}
		} catch (RuntimeException e) {
			System.out.println("dead1");
			System.exit(0);
		}
	}

	private static void print(String name, List<Integer> klas) {
		System.out.print(name);
		for (Integer k : klas) {
			System.out.print(" >" + k);
		}
		System.out.println();

	}

	private static List<Integer> getKlas(String[] split) {
		try {
			List<Integer> ans = new ArrayList<Integer>();

			for (int k = split.length - 1; k >= 0; k--) {
				ans.add(map.get(split[k]));
			}

			return ans;
		} catch (RuntimeException e) {
			System.out.println("dead2");
			System.exit(0);
			return null;
		}
	}

	private static String getstring(char[] s) {
		String ans = "";
		for (char val : s) {
			ans += val;
		}
		return ans;
	}

}