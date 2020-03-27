package domaci4;

import java.util.Scanner;

public class Zvezdice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Primer: ulaz m=3, n=7; Izlaz (vidljivo u konzoli) Hint: koristiti dve for
		 * petlje;
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi prvu stranicu:");
		int stranica1 = sc.nextInt();
		System.out.println("Unesi drugu stranicu:");
		int stranica2 = sc.nextInt();

		for (int m = 0; m < stranica1; m++) {

			for (int n = 0; n < stranica2; n++) {
				System.out.print("*   ");
			}
			System.out.println();

		}

	}

}
