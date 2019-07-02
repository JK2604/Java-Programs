class Sum
{
	public static void main(String[] args) {
		
		int i, sum;
		System.out.println("Enter a Number:");
		for (i =0; i<args.length; i++ ) {
//			System.out.println("Enter a Number:");
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Sum:" + sum);
	}
}