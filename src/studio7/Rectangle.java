package studio7;

public class Rectangle {
	// defined instance variables 
private double length;
private double width;

// constructor 
public Rectangle (double length, double width) {
	this.length = length;
	this.width = width;
}
public double area () {
	return this.length*this.width;
}
	
public double perimeter () {
	return ((2*this.length)*(2*this.width));
}

// Rectangle is the data type (i.e. like a double) and otherRectangle is the name)
public boolean isBigger (Rectangle otherRectangle) {
	return this.area() < otherRectangle.area();
}

	public static void main(String [] args) {
		Rectangle rectangle = new Rectangle (5,3);
		double  rectangleArea = rectangle.area();
		System.out.println(rectangleArea);
		Rectangle rectangleTwo = new Rectangle (15,4); 
		boolean isBiggerThan = rectangle.isBigger(rectangleTwo); 
		System.out.println(isBiggerThan);
	}
}
