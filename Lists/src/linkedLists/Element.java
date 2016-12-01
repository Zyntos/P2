package linkedLists;

public class Element <T> {
	
	private T element;
	public Element<T> next;
	public Element<T> last;
	
	public Element(T element) {
		this.element = element;
	}
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public T getElement() {
		return element;
	}
	
	
	
	
	
	

}
