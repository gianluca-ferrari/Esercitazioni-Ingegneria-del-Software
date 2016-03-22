package ex01.complex;

public class Main {

	public static void main(String[] args) {
		Complex a = new Complex();
		Complex b = new Complex(2,5);
		System.out.println(a.toString());
		System.out.println(b.toString());
		a = Complex.fromPolarForm(1, Math.PI/4);
		System.out.println(a.toString());
		a = new Complex(1,3);
		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		System.out.println("a+b: " + a.plus(b).toString());
		System.out.println("a-b: " + a.minus(b).toString());
		System.out.println("a*b: " + a.times(b).toString());
		
		ComplexSet s = new ComplexSet();
		s.insert(a);
		s.insert(b);
		s.insert(a);
		System.out.println(s.toString());
		System.out.println("Contiene " + a.toString() + " ? " + (s.contains(a)>=0));
		s.remove(a);
		s.remove(a);
		System.out.println(s.toString());
		System.out.println("Contiene " + a.toString() + " ? " + (s.contains(a)>=0));
		
	}

}
