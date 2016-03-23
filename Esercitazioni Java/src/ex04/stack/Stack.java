package ex04.stack;

import java.util.ArrayList;
import java.util.Iterator;

//Stack di oggetti generics, iterable, LIFO
public class Stack<E> implements Iterable<E> {
	
	private ArrayList<E> elements= new ArrayList<E>();
	
	public void push(E e){
		elements.add(e);
	}
	
	public void pushAllIn(Stack<? super E> receiver){
		for(E e: elememts)
	}
	
	public void pushAllFrom(Stack<? extends E> emitter){
		
	}
	
	public E pop(){
		E e = elements.get(elements.size()-1);
		elements.remove(elements.size()-1);
		return e;
	}
	
	
	//Iterator implementation
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
