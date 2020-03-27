package primeri;

import java.util.Scanner;

public class Minikalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji od korisnika trazi da unese dva broja, a nakon toga i
		 * broj koji predstavlja operaciju koju zeli (1 za sabiranje, 2 za oduzimanje, 3
		 * za mnozenje, 4 za deljenje). Prikazati rezultat.
		 */
		//Omoguciti da program ucitava dva broja i zeljenu operaciju sve dok korisnik
		//ne unese broj 5 umesto operacije. (5 je ‘znak’ da zeli da se program zavrsi).

		Scanner sc = new Scanner(System.in);
		double broj1 = sc.nextDouble();
		double broj2 = sc.nextDouble();
		int operacija = sc.nextInt();
		double rez = 0;
		boolean error = false;
		while (operacija != 5) {

		switch (operacija) {
		case 1:
			rez = broj1 + broj2;
			break;
		case 2:
			rez = broj1 - broj2;
			break;
		case 3:
			rez = broj1 * broj2;
			break;
		case 4:
			if (broj2 != 0)
				rez = broj1 / broj2;
			else {
				System.out.println("Ne mozete deliti sa nulom");
				error = true;
			}
			break;
		default:
			System.out.println("Greska u izboru operacije");
			error = true;
		}
		if (!error)
			System.out.println("Rezultat je " + rez);
		broj1 = sc.nextDouble();
		broj2 = sc.nextDouble();
		operacija = sc.nextInt();
		
		error = false;
	}
		
	}
}
