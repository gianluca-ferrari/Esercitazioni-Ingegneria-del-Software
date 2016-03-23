package ex03.shapes;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		CliCanvas canvas = new CliCanvas(); 
		Point p = new Point(5,5);
		Shape c = new Circle(p, 3);
		Shape s = new Square(p, Math.PI/2, 3);
		
		canvas.drawPoint(p);
		
		c.drawOn(canvas);
		System.out.println("Area: " + c.getArea() + "\nPerimetro: " + c.getPerimeter());
		
		System.out.println("\nQuadrato:");
		s.drawOn(canvas);
		
		List<Point> li = s.getSequenceOfPointsToDraw();
		for (int i = 0; i < 4; i++) {
			canvas.drawPoint(li.get(i));
		}
		System.out.println("Area: " + s.getArea() + "\nPerimetro: " + s.getPerimeter());
		
		
		System.out.println("\nCerchio approx:");
		li  =c.getSequenceOfPointsToDraw();
		for (int i = 0; i < li.size(); i++) {
			canvas.drawPoint(li.get(i));
		}
	}

}
