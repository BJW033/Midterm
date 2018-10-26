package pkgHelper;

public class Rectangle extends Shape implements Comparable{
	private int Width;
	private int Length;
	
	public Rectangle(int width, int length) {
		super();
		Width = width;
		Length = length;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	@Override
	public double area() {
		return Width *Length;
	}

	@Override
	public double perimeter() {
		return 2*Width + 2*Length;
	}

	@Override
	public int compareTo(Object r) {
		if(((Rectangle) r).area() > this.area()) {
			return -1;
		}
		else if(((Rectangle)r).area()<this.area()) {
			return 1;
		}
		else
			return 0;
		}
		
	}


