package ex01.complex;

public class Complex {

	//gli attributi sono final, in questo modo possiamo usarlo come entità matematica. Altrimenti side effect quando uguagliamo due complessi (c1=c2) che diventano alias, e se modifichiamo uno modifichiamo anche l'altro. Mettendo final l'uguaglianza non crea problemi, tanto non possiamo modificare gli attributi a meno di non creare un nuovo oggetto (assegnando una nuova reference)
	private final double re;
	private final double im;
	
	public Complex(){
		this(0.0,0.0);
	}
	public Complex(double re, double im){
		this.re=re;
		this.im=im;
	}
	
	public double getRe(){
		return this.re;
	}
	public double getIm(){
		return this.im;
	}
	public Complex plus(Complex c){
		return new Complex(this.re + c.re, this.im + c.im);
	}
	public Complex minus(Complex c){
		return new Complex(this.re - c.re, this.im - c.im);
	}
	public Complex times(Complex c){
		return new Complex(this.re * c.re - this.im * c.im , this.re * c.im + this.im * c.re);
	}
	public Complex conjugate() {
		return new Complex(this.re, -this.im);
	}
	public double abs(){
		return Math.sqrt(this.re * this.re + this.im * this.im);
	}
	public double phase() {
		// a bit of spaghetti code...
		if (this.re != 0) {
			double tmp = Math.atan(this.im / this.re);
			if (this.re < 0 && this.im >= 0)
				tmp += Math.PI;
			if (this.re < 0 && this.im < 0)
				tmp += -Math.PI;
			return tmp;
		} else { /* this.re == 0 */
			if (this.im < 0)
				return -Math.PI;
			/* if (this.im >= 0) (default) */
			return Math.PI;
		}
	}
	public boolean almostEquals(Complex c, double precision){
		Complex diff = this.minus(c);
		if(diff.abs() < precision)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Complex number: (" + re + ", " + im + ")";
	}
	
	public static Complex fromPolarForm(double abs, double phase) {
		//z= abs*(cos(phase) + i*sin(phase)
		return new Complex(abs*Math.cos(phase), abs*Math.sin(phase));
	}
	
	
	
	
	
	
}
