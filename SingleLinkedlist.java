package DS2;

public class SingleLinkedlist<E> {
		public static Node start = new Node();
		Node currentNode = null;

		void add(E data) {
			Node newNode = new Node();
			newNode.value = data;

			if (start.next == null) {
				start.next = newNode;
			} else {
				currentNode = start.next;
				while (currentNode.next != null) {
					currentNode = currentNode.next;
				}
				currentNode.next = newNode;
			}

		}

		public void traverse() {
			currentNode = start;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
				System.out.println(currentNode.value);

			}
		}

		public void removeItem(E item) {
			Node<E> prev = new Node<E>();
			currentNode = start.next;
			prev = start;
			if (start.value == item) {
				start.value = null;
				start.next = null;
			} else {
				while (currentNode.next != null) {
					currentNode = currentNode.next;
					prev = prev.next;
					if (currentNode.value == item) {
						prev.next = currentNode.next;
						break;
					}
				}
			}
		}

		public void removeAtIndex(int index) {

			Node prev = new Node();
			currentNode = start.next;
			prev = start;
			for (int i = 0; i < index; i++) {
				currentNode = currentNode.next;
				prev = prev.next;

				prev.next = currentNode.next;
			}
		}

		public Object remove() {
			Node prev = new Node();
			currentNode=start;
			prev = start;
			
			while (currentNode.next!= null) {
				currentNode = currentNode.next;
				prev = prev.next;
				
			}
			Object item = currentNode.value;
			prev.next = currentNode.next;
			return item;
		}

		public void retrieve(int index) {
			currentNode = start;
			for (int i = 0; i < index; i++) {
				currentNode = currentNode.next;
			}
			System.out.println(currentNode.value);
		}

		void reverseList() {

			if (start.next == null) {
				return;
			} else {
				currentNode = start.next;
				Node firstPointer = new Node();
				Node secondPointer = new Node();

				while (currentNode != null) {
					secondPointer = firstPointer;
					firstPointer = currentNode;
					currentNode = currentNode.next;
					firstPointer.next = secondPointer;
				}
				start.next = firstPointer;

			}
		}

		public static void main(String args[]) {
			SingleLinkedlist<String> le = new SingleLinkedlist<String>();
			le.add("first");
			le.add("second");
			le.add("third");
			le.add("fourth");
			le.add("fifth");
			le.traverse();
			le.removeItem("third");
			le.traverse();
			le.removeAtIndex(2);
			le.traverse();
	        le.retrieve(1);
			le.traverse();
			System.out.println("reverse list is");
			le.reverseList();
			le.traverse();
		}

		public Node getStart() {
			return start;
		}

		public void setStart(Node start) {
			SingleLinkedlist.start = start;
		}

		public Node<E> getCurrentNode() {
			return currentNode;
		}

		public void setCurrentNode(Node<E> currentNode) {
			this.currentNode = currentNode;
		}
	}

