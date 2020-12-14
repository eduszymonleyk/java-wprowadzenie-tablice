class Lighthouses {
	public static void main(String args[]){
		
		int[][] tab = new int[4][4];
		
		// latarnia    -  liczba określa ile statków powinno być w zasięgu
		// puste pole  -  -1
		// statek      -  -2
		
		// wprowadzenie danych
		tab[0][0] = -1;
		tab[0][1] = -1;
		tab[0][2] = -2;
		tab[0][3] = -1;
		
		tab[1][0] = 1;
		tab[1][1] = -1;
		tab[1][2] = -1;
		tab[1][3] = -1;
		
		tab[2][0] = -1;
		tab[2][1] = -1;
		tab[2][2] = -1;
		tab[2][3] = 0;
		
		tab[3][0] = -1;
		tab[3][1] = -1;
		tab[3][2] = -1;
		tab[3][3] = -1;
		
		// wyświtlanie
		// jeżeli jest -1, to wyświetl " "
		// jeżeli jest -2, to wyświetl "X"
		// w przeciwnym wypadku wyświetl co 
		
		System.out.println(tab[0][0] +" "+tab[0][1] +" "+tab[0][2] + " " +tab[0][3]);
		System.out.println(tab[1][0] +" "+tab[1][1] +" "+tab[1][2] + " " +tab[1][3]);
		System.out.println(tab[2][0] +" "+tab[2][1] +" "+tab[2][2] + " " +tab[2][3]);
		System.out.println(tab[3][0] +" "+tab[3][1] +" "+tab[3][2] + " " +tab[3][3]);
	}
}