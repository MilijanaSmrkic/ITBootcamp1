package domaci5;

import java.util.Scanner;

public class RastuciNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5054 Ispis: Niz je rastuci.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Ucitaj broj clanova niza:");
		int n = sc.nextInt();
		int[] niz = new int[n];
		System.out.println("Ucitaj clanove niza:");

		for (int i = 0; i < niz.length; i++) {
			System.out.print(i + "--> ");
			niz[i] = sc.nextInt();

		}
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] >= niz[i + 1]) {
				System.out.println("Niz nije rastuci.");
				break;
			}
		}
		System.out.println("Niz je rastuci.");
	}

}
