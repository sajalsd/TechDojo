import java.io.InputStream;
import java.util.Scanner;


public class ShapeUtility {
	
	
	Processable shapes ;
	String area;
	Scanner sc = new Scanner(System.in);
	public String process(int i)
	{
		switch(i)
		{
			case 1: System.out.println("Enter a radius");
					double r = sc.nextDouble();
					shapes = new Circle(r);
					area = shapes.findArea();
					break;
					
			case 2: System.out.println("Enter a length and width");
					double length = sc.nextDouble();
					double Width = sc.nextDouble();
					shapes = new Rectangle(length,Width);
					area = shapes.findArea();
					break;
			case 3: System.out.println("Enter a base and height");
					double base = sc.nextDouble();
					double height = sc.nextDouble();
					shapes = new Rectangle(base,height);
					area = shapes.findArea();
					break;
		}
		
		
		return area;
		
	}
	
	

	
}
