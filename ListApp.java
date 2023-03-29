package arraylist;

public class ListApp {
	
	
	public static void main(String[] args) 
	{
		ArrayList<String> stringList = new ArrayList<>();
		ArrayList<PointThreeD> pointList = new ArrayList<>();
		ArrayList<Square> squareList = new ArrayList<>();
		for (int i = 0; i < 10; i++) 
		{
			stringList.addItem("Item " + i);
			pointList.addItem(new PointThreeD(1,2,3));
			squareList.addItem(new Square(5));
		}
		System.out.println(stringList.toString());
		System.out.println(pointList.toString());
		System.out.println(squareList.toString());
		
		
		
	}
	
}
