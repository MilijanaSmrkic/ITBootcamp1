package domaci5;

import java.util.Scanner;

public class InverzniRedosled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj clanova niza:");
		int n = sc.nextInt();
		int[] niz = new int[n];
		System.out.println("Unesite clanove niza:");
		for (int i = 0; i < n; i++)
			niz[i] = sc.nextInt();
		System.out.println("Inverzni redosled: ");

		for (int i = n - 1; i >= 0; i--)
			System.out.println(niz[i]);
	}

}
