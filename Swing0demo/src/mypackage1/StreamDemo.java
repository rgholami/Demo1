package mypackage1;

import java.util.Scanner;

public class StreamDemo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the grid width (1-9):" );
		int w = scan.nextInt(); 

		System.out.println("Enter the grid length (1-9):");
		int h = scan.nextInt(); 

		int x = 0, y = 0;
		while (true)
		{
		   for(int i = 0; i < w; i++){
		      for(int j = 0; j < h; j++){
		         if (i != x || j != y)
		           System.out.print("*");
		         else
		            System.out.print("X");
		      }
		      System.out.println("");
		   }
		   System.out.println("Enter direction (u,d,l,r):");
		   char c = scan.next().charAt(0);
		   switch (c)
		   {
		      case 'u': x = Math.max(0, x-1); break;
		      case 'd': x = Math.min(w-1, x+1); break;
		      case 'l': y = Math.max(0, y-1); break;
		      case 'r': y = Math.min(h-1, y+1); break;
		      case 'x': System.out.println("Exiting..."); System.exit(0);
		   }
		}	
		
		
		

	}

}
