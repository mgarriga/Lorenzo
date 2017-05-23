package it.polimi.ingsw.GC_00;

public class Fattoriale {
	/* Calcola il fattoriale di n. */
	public static int fattoriale(int n) {
		// pre: n>=0
		int fatt; // il fattoriale di n
		int i; // per iterare tra 1 e n
		/* calcola il fattoriale di n */
		fatt = 1;
		for (i=1; i<=n; i++) {
			fatt *= i;
		}
		return fatt;
	}
	public static void main(String[] args) {
		System.out.println(fattoriale(4));
	}
}