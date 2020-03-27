package domaci6;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		 * palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		 * palindrom). Korisnik unosi int [ ]
		 */

		int i, j, br = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza");
		int n = sc.nextInt();
		System.out.println("Unesite elemente niza");
		int[] niz = new int[n];

		for (i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		i = niz.length - 1;
		for (j = 0; j < (niz.length / 2); j++, i--) {
			if (i > (niz.length / 2)) {
				if (niz[i] == niz[j]) {
					br = 1;
				}
			}
		}
		if (br == 1) {
			System.out.println("Niz je palindrom");

		} else
			System.out.println("Niz nije palindrom ");
	}
}
