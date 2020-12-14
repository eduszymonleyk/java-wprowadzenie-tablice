class SortArray {
	public static void main(String args[]){
		int[] numbers = {1, 5, 3, 2, 1};
		
		// wyświetl liczby
		System.out.print(numbers[0]);
		System.out.print(numbers[1]);
		System.out.print(numbers[2]);
		System.out.print(numbers[3]);
		System.out.println(numbers[4]);
		
		
		
		// sortowanie
		// zamiana 5 z 1
		int tmp;
		
		tmp = numbers[1];
		numbers[1] = numbers[4];
		numbers[4] = tmp;
		
		
		tmp = numbers[2];
		numbers[2] = numbers[3];
		numbers[3] = tmp;
		
		
		
		
		// wyświetl liczby
		System.out.print(numbers[0]);
		System.out.print(numbers[1]);
		System.out.print(numbers[2]);
		System.out.print(numbers[3]);
		System.out.println(numbers[4]);
	}
}