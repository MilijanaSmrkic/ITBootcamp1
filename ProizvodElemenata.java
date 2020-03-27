package domaci6;

import java.util.Scanner;

public class ProizvodElemenata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		 * niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti broj elemenata niza ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		System.out.println("Unesite elemente niza ");
		int p = 1;
		for (int i = 0; i < niz.length; i++) {
			System.out.print(i + "->");
			niz[i] = sc.nextInt();

		}
		for (int i = 0; i < niz.length; i++) {
			if (i < niz[i]) {
				p = p * niz[i];

			}

		}
		System.out.println("Proizvod elemenata niza koji su veci od svog indeksa je " + p);
	}

}
