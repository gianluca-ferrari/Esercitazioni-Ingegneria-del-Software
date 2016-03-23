package ex03.shapes;

public interface TwoDimensionalCanvas {
	
	void drawPoint(Point point);
	void drawLine(Point startPoint, Point endPoint);
	void drawCircle(Point center, double radius);
	
}

//textual CLI canvas for testing purpose only
class CliCanvas implements TwoDimensionalCanvas{

	@Override
	public void drawPoint(Point point) {
		System.out.println("Point: (" + point.getX() + "," + point.getY() + ").");
	}

	@Override
	public void drawLine(Point startPoint, Point endPoint) {
		System.out.println("Line: (" + startPoint.getX() + "," + startPoint.getY() + ") to (" + endPoint.getX() + "," + endPoint.getY() + ").");
	}

	@Override
	public void drawCircle(Point center, double radius) {
		System.out.println("Cerchio: centro=(" + center.getX() + "," + center.getY() + ") raggio=" + radius);
	}
	
}
