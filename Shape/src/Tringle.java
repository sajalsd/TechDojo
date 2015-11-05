
public class Tringle implements Processable {
	
	private double base;
	private double height;
	public Tringle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String findArea() {
		String res = "Area of circle is" +(0.5*base*height);
		return res;
	}
	

}
