class Cross{
	public static void main(String args[]){
		
		// przygotowanie struktóry dla krzyżówki
		char[][] tab = new char[3][];
		tab[0] = new char[3];   // dom
		tab[1] = new char[9];   // na dworze
		tab[2] = new char[4];	// woda
		
		
		// przypisanie wartośći, wypełnienie krzyżówki
		tab[0][0] = 'd';
		tab[0][1] = 'o';
		tab[0][2] = 'm';
		
		tab[1][0] = 'n';
		tab[1][1] = 'a';
		tab[1][2] = ' ';
		tab[1][3] = 'd';
		tab[1][4] = 'w';
		tab[1][5] = 'o';
		tab[1][6] = 'r';
		tab[1][7] = 'z';
		tab[1][8] = 'e';
		
		tab[2][0] = 'w';
		tab[2][1] = 'o';
		tab[2][2] = 'd';
		tab[2][3] = 'a';
		
		
		// wyświetlenie krzyżówki
		System.out.println("-------");
		System.out.println(tab[0][0]+" "+tab[0][1]+" "+tab[0][2]);
		System.out.println("-------------------");
		System.out.println(tab[1][0]+" "+tab[1][1]+" "+tab[1][2]+" "+tab[1][3]+" "+tab[1][4]+" "+tab[1][5]+" "+tab[1][6]+" "+tab[1][7]+" "+tab[1][8]);
		System.out.println("-------------------");
		System.out.println(tab[2][0]+" "+tab[2][1]+" "+tab[2][2]+" "+tab[2][3]);
		System.out.println("---------");
		
		// pierwsza literaz z drugiego słowa
		System.out.println("Pierwsza litera drugiego słowa: "+tab[1][0]);
		
		// długość trzeciego słowa
		System.out.println("Długość trzeciego słowa: "+tab[2].length);
	}
}