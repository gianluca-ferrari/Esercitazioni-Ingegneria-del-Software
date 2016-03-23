package ex04.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

//Stack di oggetti generics, iterable, LIFO
public class Stack<E> implements Iterable<E> {
	
	private ArrayList<E> elements= new ArrayList<E>();
	
	public void push(E e){
		elements.add(e);
	}
	
	public void pushAllIn(Stack<? super E> receiver){
		//this iterate on ArrayList, so its not LIFO
		/*for(E e: elements){
			receiver.push(e);
		}*/
		//new version: iterate on stack, using hereby defined StackIterator, so its LIFO
		for(E e: this)
			receiver.push(e);
	}
	
	public void pushAllFrom(Stack<? extends E> emitter){
		for(E e: emitter){
			this.push(e);
		}
	}
	
	public E pop(){
		E e = elements.get(elements.size()-1);
		elements.remove(elements.size()-1);
		return e;
	}
	
	public boolean isEmpty(){
		return this.elements.isEmpty();
	}
	
	
	//Iterator implementation
	@Override
	public Iterator<E> iterator() {
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<E>{
		
		private int position;
		
		public StackIterator(){
			this.position = elements.size()-1;
		}

		@Override
		public boolean hasNext() {
			return this.position>=0;
		}

		@Override
		public E next() {
			if(this.hasNext())
				return elements.get(position--);
			else throw new NoSuchElementException();
		}
	}
	
	
	

}
