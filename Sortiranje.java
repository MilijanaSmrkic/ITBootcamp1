package nizovi222;

import java.util.Arrays;

public class Sortiranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 10, 0, -10, 2, -20 };

		for (int i = 0; i < n.length; i++) {
			int poz = i;
			int min = n[i];

			for (int j = i; j < n.length; j++) {
				if (n[j] < min) {
					poz = j;
					min = n[j];
				}
			}

			int temp = n[i];
			n[i] = n[poz];
			n[poz] = temp;
		}

		System.out.println(Arrays.toString(n));

	}

}
