
public class Circle implements Processable {

	private double radius;
	
	
	public Circle(double radius) {	
		
		this.radius = radius;
	}
	
	

	public Circle() {
		super();
	}



	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public String findArea() {
		String res = "Area of circle is" +(3.1416*radius);
		return res;
	}
	
	
	
}
