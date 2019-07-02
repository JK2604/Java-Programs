class Swap
{
	public static void main(String[] args) {
		
		int a,b;
		a=20;
		b=5;
		System.out.println("A:" + a);
		System.out.println("B:" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values after Swapping:");
		System.out.println("A:" + a);
		System.out.println("B:" + b);
	}
}