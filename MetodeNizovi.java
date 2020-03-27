package metode;

import java.util.Scanner;

public class MetodeNizovi {
	public static int[] niz(int n) {
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[n];
		System.out.println("Unesite elemente niza");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	public static int minimum(int[] niz) {
		int min = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < niz[0]) {
				min = niz[i];
			}
		}
		System.out.println("Najmanji element je " + min);
		return min;
	}

	public static void ispisi(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// Napisati program koji unosi velicinu niza
		// preko metode unosi njegove elemente
		// preko metode racuna najmanji element niza i ispisuje ga u glavnom programu
		// preko metode ispisuje sve elemente niza

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite velicinu niza");
		int n = sc.nextInt();

		int[] r = niz(n);
		minimum(r);
		ispisi(r);

	}

}
