package ex03.shapes;

import java.util.ArrayList;
import java.util.List;

public class Square extends Shape{
	
	private final Point lowerLeftPoint;
	// It represents the orientation, in radiant degrees of the square
	private final double orientation;
	private final double sideLength;

	public Square(Point lowerLeftPoint, double orientation, double sideLength) {
		if (lowerLeftPoint == null || sideLength < 0 || orientation < 0 || orientation > 2 * Math.PI) {
			throw new IllegalArgumentException();
		}
		this.lowerLeftPoint = lowerLeftPoint;
		this.orientation = orientation;
		this.sideLength = sideLength;
	}

	@Override
	public double getArea() {
		return sideLength * sideLength;
	}

	@Override
	public double getPerimeter() {
		return 4 * sideLength;
	}

	@Override
	public List<Point> getSequenceOfPointsToDraw() {
		List<Point> points = new ArrayList<Point>();
		points.add(lowerLeftPoint);//lower left
		points.add( (new Point(lowerLeftPoint.getX(), lowerLeftPoint.getY()+sideLength)).rotate(lowerLeftPoint, orientation) );//upper left
		points.add( (new Point(lowerLeftPoint.getX()+sideLength, lowerLeftPoint.getY()+sideLength)).rotate(lowerLeftPoint, orientation) );//upper right
		points.add( (new Point(lowerLeftPoint.getX()+sideLength, lowerLeftPoint.getY())).rotate(lowerLeftPoint, orientation) );//lower right
		return points;
	}
}
