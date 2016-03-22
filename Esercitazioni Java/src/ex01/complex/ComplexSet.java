package ex01.complex;

public class ComplexSet{
	
	private final Complex[] elements;
	private int size;//num elementi effettivi e prossima posizione vuota
	private final double precision;//precisione per il confronto
	private final static int DIM = 100;//dimensione set

	public ComplexSet(){
		this(2.0d * Double.MIN_VALUE);
	}
	public ComplexSet(double precision){
		this.size=0;
		this.elements = new Complex[DIM];
		this.precision = precision;
	}
	
	public int contains(Complex element){
		//num found: return its position
		//else: return -1
		for(int i=0; i<this.size; i++){
			if(this.elements[i].almostEquals(element, precision))
				return i;
		}
		return -1;
	}
	
	public void insert(Complex element){
		if(this.contains(element)>=0){
			System.out.println("Elemento già presente nel set!");
			return;
		}
		//not contained in the set
		if(this.size<elements.length){
			elements[size++]=element;//posso farlo perchè complex è immutabile
			return;
		}
		System.out.println("Set pieno!");
	}
	
	public void remove(Complex element){
		int pos = this.contains(element);
		if(pos>=0){
			elements[pos]=elements[--size];
			return;
		}
		else{
			System.out.println("Elemento non presente!");
			return;
		}
	}
	
	public String toString(){
		StringBuilder out = new StringBuilder("{ ");
		for(int i = 0; i < this.size; i++){
			out.append(this.elements[i].getRe() + "+" + this.elements[i].getIm() + "i ");
			if(i<size-1)
				out.append(", ");
		}
		out.append("}");
		return out.toString();
	} 
}
