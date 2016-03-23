package ex04.stack;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
        stack.push(4);
		stack.push(5);		
		for(Integer s : stack){
			System.out.println(s);
		}
		
		Iterator<Integer> i = stack.iterator();
		stack.pop();
		System.out.println(i.hasNext());
		if(i.hasNext())
			try {
				i.next();				
			} catch (IndexOutOfBoundsException e) {
				System.out.println("i.next() sfonda il vettore perchè la position è inizializzata alla creazione dell'iteratore, e non viene aggiornata dalla pop.\n");
			}
		
		stack.push(5);
		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.push(6);
		stack2.pushAllFrom(stack);//order inverted (LIFO)
		stack2.push(9);
		stack.pushAllIn(stack2);//order inverted
		for(Integer s : stack2){
			System.out.println(s);
		}
		
		
		
	}

}
