class Sums
{
	public static void main(String[] args) {
		
		int i, sum = 0;
		System.out.println("Enter a Number:");
		for (i =0; i<args.length; i++ ) {
//			System.out.println("Enter a Number:");
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Sum:" + sum);
	}
}