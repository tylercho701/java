package sec1;

public class Member<T, E> {
	private T id;
	private E no;
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public E getNo() {
		return no;
	}
	public void setNo(E no) {
		this.no = no;
	}
	
	
}