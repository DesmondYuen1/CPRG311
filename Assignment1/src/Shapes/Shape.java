package Shapes;

public abstract class Shape implements Comparable<Shape> {
	//Fields
	double height;
	
	/**
	 * Calculates the volume of the shape
	 * @return volume
	 */
	public abstract double calcVolume();
	
	/**
	 * Calculates the base area of the shape
	 * @return base area
	 */
	public abstract double calcBaseArea();
	
	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
