package arraylist;

public class Square {
	private double side;
	public Square() 
	{
		
		
	}
	public Square(double s) 
	{
		this.side = s;
		
	}
	public double getArea() 
	{
		double area;
		area = side*side;
		return area;
	}
	@Override
	public String toString() {
		return "Square [side= " + side + "]";
	}
	
}
