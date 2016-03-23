package ex03.shapes;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape{
	
	private final Point center;
	private final double radius;
	public int numberOfSegments = 10; //numero di segmenti/punti in cui viene diviso per l'apporssimazione in getSequenceOfPointsToDraw()
	
	public Circle(Point center, double radius){
		if(center==null || radius <=0)
			throw new IllegalArgumentException();
		this.center=center;
		this.radius=radius;
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public List<Point> getSequenceOfPointsToDraw() {
		List<Point> points = new ArrayList<Point>();
		for (int i = 0; i < numberOfSegments; i++) {
			double newPointX = center.getX() + radius * Math.cos(2 * Math.PI * i / numberOfSegments);
			double newPointY = center.getY() + radius * Math.sin(2 * Math.PI * i / numberOfSegments);
			points.add(new Point(newPointX, newPointY));
		}
		return points;
	}
	
	@Override
	public void drawOn(TwoDimensionalCanvas canvas){
		canvas.drawCircle(this.center, this.radius);
	}

}
