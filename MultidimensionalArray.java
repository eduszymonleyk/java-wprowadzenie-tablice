class MultidimensionalArray {
	public static void main(String args[]){
		
		/*********************************** ZADANIE 1 ***************************/
		int[][] array = new int[3][3];
		
		// ustawienie wartości pierwszego wiersza i pierwszej kolumny
		array[0][0] = 1;
		array[0][1] = array[1][0] = 2;
		array[0][2] = array[2][0] = 3;
		
		// obliczenie drugiego wiersza
		array[1][1] = array[0][1] * array[1][0];
		array[1][2] = array[1][0] * array[0][2];
		
		// obliczenie trzeciego wiersza
		array[2][1] = array[0][1] * array[2][0];
		array[2][2] = array[2][0] * array[0][2];
		
		// wyświetlenie tabliczki
		System.out.println("------");
		
		System.out.println(array[0][0]+" "+array[0][1]+" "+array[0][2]);
		System.out.println(array[1][0]+" "+array[1][1]+" "+array[1][2]);
		System.out.println(array[2][0]+" "+array[2][1]+" "+array[2][2]);
		
		System.out.println("------");
		
		
		System.out.println("ZADANIE 2");
		/********************* ZADANIE 2 *************************/
		char[][] product = new char[3][];
		product[0] = new char[4];
		product[1] = new char[2];
		product[2] = new char[5];
		
		// wpisz buty
		product[0][0] = 'b';
		product[0][1] = 'u';
		product[0][2] = 't';
		product[0][3] = 'y';
		
		// wpisz rozmiar
		product[1][0]=52;
		product[1][1]=50;
		
		// wpisz cenę
		product[2][0]='2';
		product[2][1]='3';
		product[2][2]='.';
		product[2][3]='4';
		product[2][4]='2';
		
		// wyświetlenie produktu
		System.out.println("------");
		System.out.println(product[0][0]+""+product[0][1]+""+product[0][2]+""+product[0][3]);
		System.out.println(product[1][0]+""+product[1][1]);
		System.out.println(product[2][0]+""+product[2][1]+""+product[2][2]+""+product[2][3]+""+product[2][4]+"");
		System.out.println("------");
		
		
		
		
		
		
	}
}