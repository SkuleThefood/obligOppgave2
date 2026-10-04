package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int x = 0; x < matrise.length; x++){
			for (int y = 0; y < matrise[x].length; y++){
				System.out.print(matrise[x][y] + ", ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String toReturn = "";
		for (int x = 0; x < matrise.length; x++){
			for (int y = 0; y < matrise[x].length-1; y++){
				toReturn += matrise[x][y] + " ";
			}
			toReturn += matrise[x][matrise[x].length-1];
			toReturn += "\n";
		}
		return toReturn;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] toReturn = new int[matrise.length][matrise[0].length];
		for (int x = 0; x < matrise.length; x++){
			for (int y = 0; y < matrise[x].length; y++){
				toReturn[x][y] = matrise[x][y]*tall;
			}
		}
		return toReturn;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean toReturn = true;
		if (a.length == b.length) {
			for (int x = 0; x < a.length; x++) {
				if (a[x].length == b[x].length && toReturn == true) {
					for (int y = 0; y < a[x].length; y++) {
						if (a[x][y] != b[x][y]) {
							toReturn = false;
						}
					}
				}
				else {
					toReturn = false;
				}
			}
		}
		else {
			toReturn = false;
		}
		return toReturn;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] speiletMatrise = new int[matrise.length][matrise[0].length];
		for (int x = 0; x < matrise.length; x++) {
			for (int y = 0; y < matrise[x].length; y++) {
				speiletMatrise[y][x] = matrise[x][y];
			}
		}
		return speiletMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] toReturn = new int[a.length][b[0].length];
		int sum = 0;
		for (int x = 0; x < toReturn.length; x++){
			for (int y = 0; y < toReturn[x].length; y++) {
				sum = 0;
				for (int z = 0; z < a[0].length; z++) {
					sum += (a[x][z] * b[z][y]);
				}
				toReturn[x][y] = sum;
			}
		}
		return toReturn;
	}
}
