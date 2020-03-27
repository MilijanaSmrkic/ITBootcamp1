package nizovi222;

import java.util.Scanner;

public class Niz_sumaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] brojevi = new int[10];
		int suma = 0;
		int proizvod = 1;
		int i = 0;

		for (i = 0; i < brojevi.length; i++) {

			brojevi[i] = sc.nextInt();
			suma = suma + brojevi[i];
			proizvod = proizvod * brojevi[i];

		}
		for (i = 0; i < 9; i++) {

			System.out.print(brojevi[i]);
			System.out.print(" , ");

		}
		System.out.println();

		System.out.println("Suma je " + suma);
		System.out.println("Proizvod je " + proizvod);

	}

}
