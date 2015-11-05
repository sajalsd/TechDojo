
public class Rectangle implements Processable{
	
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle() {
		
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String findArea() {
		// TODO Auto-generated method stub
		return "Area of rectangle" + length*width;
	}
	
	

}
