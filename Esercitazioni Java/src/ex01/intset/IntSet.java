package ex01.intset;

public class IntSet {
	
	private final int [] elements;
	private final static int MAX_SIZE = 100;
	private int size; //number of elements in the array and next free spot
	
	//constructor
	public IntSet(){
		this(IntSet.MAX_SIZE);
	}
	public IntSet(int size){
		this.size=0;
		this.elements = new int[size];
	}
	
	//methods
	public int contains(int num){
		//num found: return its position
		//else: return -1
		for(int i=0; i<this.size; i++){
			if(this.elements[i]==num)
				return i;
		}
		return -1;
	}
	
	public void insert(int num){
		if(this.contains(num)>=0){
			System.out.println("Elemento già presente nel set!");
			return;
		}
		//num not contained in the set
		if(this.size<elements.length){
			elements[size++]=num;
			return;
		}
		System.out.println("Set pieno!");
	}
	
	public void remove(int num){
		int pos = this.contains(num);
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
			out.append(this.elements[i] + " ");
			if(i<size-1)
				out.append(",");
		}
		out.append("}");
		return out.toString();
	}
}
