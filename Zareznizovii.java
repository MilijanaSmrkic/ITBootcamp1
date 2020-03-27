package nizovi222;

public class Zareznizovii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ucitati niz i odvojiti ga zarezom a da zarez ne bude posle poslednjeg broja

		int[] n = { 1, 3, 5, 18, 22, 8 };

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);
			if (i != n.length - 1)
				System.out.print(", ");
		}
		// nije idealno za dugacke nizvove
		// previse poredjenja
		for (int i = 0; i < n.length - 1; i++) {
			System.out.print(n[i] + ", ");
		}
		System.out.println(n[n.length - 1]);

	}

}
