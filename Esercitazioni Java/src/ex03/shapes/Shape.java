package ex03.shapes;
import java.util.List;

public abstract class Shape {
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract List<Point> getSequenceOfPointsToDraw();
	
	public void drawOn(TwoDimensionalCanvas canvas){
		//default implementation for straight lines shapes
		
		List<Point> points = getSequenceOfPointsToDraw();
		
		for (int i = 0; i < points.size()-1; i++)
			canvas.drawLine(points.get(i), points.get(i+1));
	}
}
