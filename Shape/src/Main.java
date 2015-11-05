import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int userChoice = 5;
		

while(userChoice!=0)
		{
			display();
			Scanner sc = new Scanner(System.in);
			userChoice = sc.nextInt();
			switch(userChoice)
			{
			  	case 1: System.out.println(new ShapeUtility().process(1));
			  			break;
			  			
			  	case 2: System.out.println(new ShapeUtility().process(2));
			  			break;
			  			
			  	case 3: System.out.println(new ShapeUtility().process(3));
	  					break;
	  					
			  	case 0: break;
	  					
	  			default:System.out.println("Input Wrong!!!");
					    break;
			}
		}
		System.out.println("Thanks For Calculating!1");
		
		
	}
	public static void display()
	{
		System.out.println("press 1. to calculate the area of Circle  ");
		System.out.println("press 2. to calculate the area of Rectangle  ");
		System.out.println("Press 3: to calculate the area of Tringle ");
		System.out.println("Press 0: to EXIT ");
	}
	
}
