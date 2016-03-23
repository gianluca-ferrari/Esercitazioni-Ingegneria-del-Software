package ex03.shapes;

public interface TwoDimensionalCanvas {
	
	void drawPoint(Point point);
	void drawLine(Point startPoint, Point endPoint);
	void drawCircle(Point center, double radius);
	
}
