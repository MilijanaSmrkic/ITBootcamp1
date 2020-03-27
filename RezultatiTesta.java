package metode;

import java.util.Scanner;

public class RezultatiTesta {
	/*
	 * U jednoj QA grupi ima 10 polaznika. Predavac ucitava najpre rezultate prvog
	 * testa. Zatim rezultate drugog testa. Nakon toga, zeli da vidi koliko su
	 * procenata uradili uzimajuci u obzir oba testa. (Sistem bodovanja je kao onaj
	 * koji se trenutno primenjuje u nasoj grupi :) )
	 * 
	 * Napraviti metodu koja ucitava niz zadatih dimenzija. Napraviti metodu koja
	 * ispisuje zadati niz. Napraviti metodu kojoj se proslede dva niza, a ona na
	 * osnovu njih pravi treci, na nacin opisan u zahtevima zadatka.
	 * 
	 * Dodatak: Ispisati redni broj polaznika koji ima najbolji prosek, kao i
	 * vrednost preseka.
	 */
	public static int[] ucitaj(int brE) {
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[brE];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;

	}
	public static void ispis (double [] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}
	public static double [] poredjenje(int [] niz1, int [] niz2  ){
		double [] niz3 = new double [10];
		for (int i=0;i<niz3.length;i++) {
			niz3 [i]=(niz1[i]+niz2[i])/2.0;
			
		}
		return niz3;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test1=ucitaj(5);
		int [] test2=ucitaj(5);
		double [] test3=poredjenje(test1,test2);
		ispis(test3);

	}

}
