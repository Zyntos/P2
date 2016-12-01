package linkedLists;



public class MyList <T>{
	
	private Element<T> first;
	private Element<T> last;
	
	public MyList() {
		
	}
	
	public void add(T element) {
		// Fall 1: Kein Element
		if (first == null) {
			first = new Element<>(element);
			last = first;
		}
		// Fall 2: Ein Element
		else if (last.last == null) {
			Element<T> tmp = new Element<>(element);
			last = tmp;
			first.next = tmp;
			last.last = first;
		}
		else {
			Element<T> tmp = new Element<>(element);
			last.next = tmp;
			tmp.last = last;
			last = tmp;
			
		}
		
	}
	
	public Element<T> getFirst() {
		return first;
	}
	
	public Element<T> getLast() {
		return last;
	}
	

}
