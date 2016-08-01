package DS;

public class SingleLinkedList<E> {
	Node<E> first; // this is head of the link list
	Node<E> last; // this is the last pointer to link lists

	// It add the element into link list  at last position

	public boolean add(E element) {
		try {
			Node<E> node = new Node<E>();
			node.setElement(element);
			node.setNext(null);
			if (isEmpty()) {
				first = node;
			} else {
				last.setNext(node);
			}
			last = node;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// It add the element into link list by index position 
	
	public boolean add(int index, E element) {
		if (index > size()) {
			throw new IllegalArgumentException();
		}
		try {
			Node<E> node = new Node<E>();
			node.setElement(element);
			if (index == 0) {
				add(element);
			} else if (index == size()) {
				last.setNext(node);
				last = node;
				node.setNext(null);
				return true;
			}
			int counter = 0;
			Node<E> temp = first;
			while (counter < index - 1 && temp.getNext() != null) {
				temp = temp.getNext();
				counter++;
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
			return true;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// It clears all the link list
	
	public void clear() {
		Node<E> temp = first;
		Node<E> temp1;
		while (temp != last) {
			temp1 = temp;
			temp.setElement(null);
			temp = temp.getNext();
			temp1.setNext(null);
		}
		temp.setElement(null);
		temp.setNext(null);
		first = null;
		last = null;
	}

	// it checks that link list contains that value or not
	
	public boolean contains(E o) {
		Node<E> node = new Node<E>();
		node.setElement(o);
		Node<E> temp = first;
		while (temp != null) {
			if (temp.getElement() == node.getElement()) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	// it check whether the list is empty or not
	
	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	// It remove the element by its index position
	
	public E remove(int index) {
		E temp = null;
		Node<E> node = first, temp1;
		if (index == 0) {
			temp = node.getElement();
			first = node.getNext();
		} else {
			int counter = 0;
			while (node.getNext() != null && counter < index - 1) {
				counter++;
				node = node.getNext();
			}
			if (index == size() - 1) {
				last = node;
			}
			temp1 = node.getNext();
			temp = temp1.getElement();
			node.setNext(temp1.getNext());
			temp1 = null;

		}
		return temp;
	}

	// This return the size of link list
	
	public int size() {
		int counter = 0;
		Node<E> node = first;
		while (node != null) {
			node = node.getNext();
			counter++;
		}
		return counter;
	}

	// This function return the link list in object array
	
	public Object[] toArray() {
		Object[] array = new Object[this.size()];
		Node<E> node = first;
		int index = 0;
		while (node != null) {
			array[index] = node.getElement();
			node = node.getNext();
		}
		return array;
	}

	// It Print the whole link list
	public void printLinkedList() {
		Node<E> node = first;
		while (node != null) {
			System.out.println(node.getElement());
			node = node.getNext();
		}
	}

	// It remove the element according to first element matches the value and
	// return the index position
	
	public int removeByValue(E value) {
		int index = 0;
		Node<E> node = first, prv = first;
		while (node != null) {
			if (node.getElement() == value) {
				if (index == 0) {
					first = first.getNext();
				} else if (index == size() - 1) {
					last = prv;
					prv.setNext(null);
				} else {
					prv.setNext(node.getNext());
				}
				node = null;
				break;
			}
			prv = node;
			index++;
			node = node.getNext();
		}
		if (index > size()) {
			throw new IllegalArgumentException();
		}
		return index;
	}

	// This function reverse the link list
	
	public void reverse() {
		Node<E> prv, curr, next;
		prv = null;
		curr = first;
		last = first;
		next = first.getNext();
		while (curr.getNext() != null) {
			curr.setNext(prv);
			prv = curr;
			curr = next;
			next = next.getNext();
		}
		curr.setNext(prv);
		first = curr;
	}

	// This function return the element according to its index
	
	public E getElement(int index) {
		if (index > size()) {
			throw new IllegalArgumentException();
		}
		Node<E> node = first;
		int counter = 0;
		E value;
		while (node.getNext() != null && counter < index) {
			node = node.getNext();
			counter++;
		}
		value = node.getElement();
		return value;
	}

}
