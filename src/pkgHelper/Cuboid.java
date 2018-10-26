package pkgHelper;

import java.util.Comparator;


public class Cuboid extends Rectangle implements Comparable{
	private int Depth;
	
	
	public Cuboid(int width, int length,int depth) {
		super(width, length);
		Depth = depth;
	}
	public int getDepth() {
		return Depth;
	}
	public void setDepth(int depth) {
		Depth = depth;
	}
	@Override
	public double area() {
		
		return 2*(super.getLength()*super.getWidth()
				+super.getLength()*Depth + super.getWidth()*Depth);
	}
	@Override
	public double perimeter() {
		
			throw new UnsupportedOperationException();
	}
	public double volume() {
		return super.getLength()*super.getWidth()*Depth;
	}
	@Override
	public int compareTo(Object o) {
		return 0;
	
	}
	static class SortByArea implements Comparator<Cuboid>{

		@Override
		public int compare(Cuboid a, Cuboid b) {
			
			return (int) a.area()- (int)b.area();
		}

		
	}
	static class SortByVolume implements Comparator<Cuboid>{
		@Override
		public int compare(Cuboid a,Cuboid b) {
			return (int) (a.volume()-b.volume());
			
		}
	}
}
	
	


