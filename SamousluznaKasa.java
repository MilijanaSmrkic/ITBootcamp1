package domaci4;

import java.util.Scanner;

public class SamousluznaKasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 1 - dodavanje cene proizvoda na racun (ubacivanje u
		 * potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 */
		Scanner sc = new Scanner(System.in);

		int a, b, sum, c, i;
		System.out.println("Izaberite kategoriju: ");
		System.out.println("0 - Izlaz ");
		System.out.println("1 - Dodavanje cene na racun ");
		System.out.println("2 - Naplata racuna");

		a = sc.nextInt();
		sum = 0;
		while (a != 0) {
			switch (a) {
			case 1:
				System.out.println("Unesite broj artikala: ");
				i = sc.nextInt();

				while (i != 0) {
					System.out.println("Uneste cenu proizvoda: ");
					b = sc.nextInt();
					if (b <= 0) {
						System.out.println("Greska. Uneli ste nepostojecu cenu!");
						break;
					}
					sum += b;
					i--;
				}
				System.out.println("Ukupan racun je: " + sum);
			case 2:
				System.out.println("Unesite kolicinu novca za naplatu: ");
				c = sc.nextInt();
				if (c < sum || sum == 0) {
					System.out.println("Greska!");
				} else {
					sum = c - sum;
					System.out.println("Kusur je: " + sum);
					sum = 0;
				}

				System.out.println("Izaberite kategoriju: ");
				System.out.println("0 - Izlaz ");
				System.out.println("1 - Dodavanje cene na racun ");
				System.out.println("2 - Naplata racuna");
				a = sc.nextInt();
				break;
			case 0:
				System.out.println("Izasli ste iz programa.");
				break;

			default:
				System.out.println("Greska.");

			}

		}
		System.out.println("Izasli ste iz programa.");

	}
}
