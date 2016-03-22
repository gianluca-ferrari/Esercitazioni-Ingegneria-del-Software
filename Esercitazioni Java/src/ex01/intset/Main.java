package ex01.intset;

public class Main{

	public static void main(String[] args) {
		System.out.println("Set size:");
		//input?
		int i=3;
		IntSet a = new IntSet(i);
		//input?
		a.insert(1);
		a.insert(2);
		a.insert(2);//già messo
		a.insert(3);
		a.insert(4);//pieno
		a.remove(5);//non presente
		a.remove(1);
		a.toString();

	}
}
