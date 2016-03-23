package ex03.shapes;

public class Point {
	private final double x;
	private final double y;
	
	public Point(double x, double y){
		this.x=x;
		this.y=y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public Point rotate(Point center, double degrees){
		/*point (x,y) rotated by alfa degrees around (xc,yc) ---> (x',y')
		 * 
		 * 	|x'|   |xc|   |cos(alfa) -sin(alfa)|   |(x-xc)|
		 * 	|  | = |  | + |                    | * |      |
		 * 	|y'|   |yc|   |sin(alfa)  cos(alfa)|   |(y-yc)|
		*/
		
		double rotatedX,rotatedY;
		rotatedX = center.x + (this.x - center.x)*Math.cos(degrees) - (this.y - center.y)*Math.sin(degrees);
		rotatedY = center.y + (this.x - center.x)*Math.sin(degrees) + (this.y - center.y)*Math.sin(degrees);
		
		return new Point(rotatedX, rotatedY);
	}
}
