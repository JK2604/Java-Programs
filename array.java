class array
{
	public static void main(String[] args) {
	
		int sub[] = new int[10];
		int sum = 0, div = 0;
		for(int i = 0;i<args.length;i++)
		{
			sub[i]=Integer.parseInt(args[i]);
			sum = sum + sub[i];
			div = sum/args.length; 
		}
		for(int j = 0;j<args.length;j++)
		{
			System.out.println("Value" + j + ":" + args[j]);

		}
		System.out.println("Total:" + sum);
		System.out.println("Percentage:" + div);	
	}
	

}