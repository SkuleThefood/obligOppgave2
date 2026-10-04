package no.hvl.dat100.tabeller;

public class Tabeller {
	// a)
	public static void skrivUt(int[] tabell) {
		for (int i: tabell){
			System.out.print(i + ", ");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String toReturn = "[";
		if (tabell.length >0) {
			for (int i = 0; i < tabell.length - 1; i++) {
				toReturn = toReturn + tabell[i] + ",";
			}
			toReturn = toReturn + tabell[tabell.length-1];
		}
		toReturn = toReturn + "]";
		return toReturn;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i< tabell.length; i++){
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean sannEllerFalsk = false;
		for (int i = 0; i<tabell.length; i++){
			if (tabell[i] == tall){
				sannEllerFalsk = true;
			}
		}
		return sannEllerFalsk;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int index = -1;
		for (int i = 0; i<tabell.length; i++){
			if (tabell[i] == tall){
				index = i;
			}
		}
		return index;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversTabell = new int[tabell.length];
		int teller = 0;
		for (int i = tabell.length; i > 0; i--){
			reversTabell[teller] = tabell[i-1];
			teller++;
		}
		return reversTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean toReturn = true;
		int skjekker = Integer.MIN_VALUE;
		for (int i = 0; i < tabell.length; i++){
			if (tabell[i] > skjekker){
				skjekker = tabell[i];
			}
			else {
				toReturn = false;
			}
		}
		return toReturn;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sattSammen = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < sattSammen.length; i++){
			if (i < tabell1.length) {
				sattSammen[i] = tabell1[i];
			}
			else if (i < tabell1.length +tabell2.length){
				sattSammen[i] = tabell2[i- tabell1.length];
			}
		}
		return sattSammen;
	}
}
