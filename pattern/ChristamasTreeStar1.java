import java.util.Scanner;
 class ChristmasTreeStar1 {

	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Please Enter Chirstmas Tree Width & Height = ");
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		int space = width * height;
		int i, j, k, n = 1;
		
		System.out.println("Printing Chirstmas Tree Pattern of Stars");
		
		for (int x = 1; x <= height; x++ ) 
		{

			for (i = n; i <= width; i++ )
			{
				for(j = space; j >= i; j--)
				{
					System.out.print(" ");
				}
				for(k = 1; k <= i; k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			n = n + 2;
			width = width + 2;		
		}
		for(i = 1; i <= height - 1; i++)
		{
			for(j = space - 3; j >= 0; j--)
			{
				System.out.print(" ");
			}
			for(k = 1; k <= height - 1; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}