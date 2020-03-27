package nizovi222;
import java.util.Scanner;

public class Split_niz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ucitamo recenicu od korisnika i koliko u toj recenici ima reci koje se
		// zavrsavaju na slovo a , bez tacke
		//

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite recenicu ");
		String recenica = sc.nextLine();
		String[] reci = recenica.split(" ");

		int broj = 0;
		for (int i = 0; i < reci.length; i++) {

			String r = reci[i]; // svaka pojedinacna rec
			if (r.charAt(r.length() - 1) == 'a') { // -1 zbog razmaka mozdaa
				broj++;
			}

		}

		System.out.println("Ima " + broj + "reci");

	}

}
