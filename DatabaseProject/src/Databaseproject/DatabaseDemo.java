package Databaseproject;
import java.util.*;

public class DatabaseDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	Num_To_Words o1 = new Num_To_Words();
	int num = 0;
	System.out.println("Enter Number : ");
	
	do
	{
		
		 num = sc.nextInt();
		 System.out.println(  o1.num_To_Words(num)  );
		
	}while(num != 0);
	System.out.println("Zero...");
	
	
	
	
	

	}

}
