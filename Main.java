class Main{
	public static void main(String args[]){
		int[] numbers = new int[2];
		numbers[0] = 1231;
		numbers[1] = 12;
		
		System.out.println("1231 + 12 = "+(numbers[0]+numbers[1]));
		System.out.println("1231 - 12 = "+(numbers[0]-numbers[1]));
		System.out.println("1231 / 12 = "+(numbers[0]/numbers[1]));
		System.out.println("1231 * 12 = "+(numbers[0]*numbers[1]));
		
		numbers[2] = 123;
		System.out.println("1231 + 12 + 123 = "+(numbers[0]+numbers[1]+numbers[2]));
		System.out.println("1231 - 12 - 123 = "+(numbers[0]-numbers[1]-numbers[2]));
		System.out.println("1231 / 12 / 123 = "+(numbers[0]/numbers[1]/numbers[2]));
		System.out.println("1231 * 12 * 123 = "+(numbers[0]*numbers[1]*numbers[2]));
	}
}