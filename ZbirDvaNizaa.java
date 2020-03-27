package nizovi222;

import java.util.Scanner;

public class ZbirDvaNizaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ako imaju isti br elemenata
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko elemenata zelite da ima prvi niz");
		int n = sc.nextInt();

		int[] niz1 = new int[n];
		int[] niz2 = new int[n];

		System.out.println("Unesite elemente prvog niza ");
		for (int i = 0; i < n; i++) {
			niz1[i] = sc.nextInt();

		}
		System.out.println("Unesite elemente drugog niza ");
		for (int i = 0; i < n; i++) {
			niz2[i] = sc.nextInt();

		}
		int[] niz3 = new int[n];
		for (int i = 0; i < n; i++) {
			niz3[i] = niz1[i] + niz2[i];
		}
		System.out.println("Zbir je");

		for (int i = 0; i < n; i++) {
			System.out.println(niz3[i] + " ");
		}
	}

}
