package metode;

import java.util.Scanner;

public class Kalkulator {

	public class Test {

	      //Ovaj kod predstavlja kalkulator povrsina 
		//kvadrata, pravougaonika i kruga.
		//Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
		//Ukoliko se unese 'izadji', program treba da se zavrsi.
		//Program treba da se ponavlja dokle god se ne unese izadji.


		
		}

		public static void racunajKrug() {
			Scanner sc= new Scanner(System.in);
			double r;
			r=sc.nextDouble();
			if(r<=0) { System.out.println("Los unos!");return;}
			System.out.println("Povrsina kruga je: "+pKruga(r));
		}

		public static void racunajPravougaonik() {
			Scanner sc= new Scanner(System.in);
			double a, b;
			a=sc.nextDouble();
			b=sc.nextDouble();
			if(a<=0 || b<=0) { System.out.println("Los unos!");return;}
			System.out.println("Povrsina pravougaionika je: "+pPravougaonika(a, b));
			
			
		}

		public static void racunajKvadrat() {
			Scanner sc= new Scanner(System.in);
			double a;
			a=sc.nextDouble();
			if(a<=0) { System.out.println("Los unos!");return;}
			System.out.println("Povrsina kvadrata je: "+pKvadrata(a));
			
		}
		public static double pKruga(double r) {
			return r*r*3.14;
		}
		public static double pKvadrata(double a) {
			return a*a;
		}
		public static double pPravougaonika(double a, double b) {
			return a*b;
		}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			String figura;
			while(true) {
				figura=sc.next();
				switch(figura) {
				case "kvadrat":racunajKvadrat();
				break;
				case "pravougaonik":racunajPravougaonik();
				break;
				case "krug":racunajKrug();		
				break;
				case "izadji":return;
		
				}
			}
		}
	}





