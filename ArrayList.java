package ds1;

public class ArrayList<E> {
	int maxSize = 5;
	Object dataArray[] = new Object[maxSize];
	int count = 0;

	public void add(Object data) {

		if (count < maxSize) {
			dataArray[count] = data;
			count++;
		}

		else {
			int i;
			maxSize = (maxSize * 3) / 2 + 1;
			Object dataArray1[] = new Object[maxSize];
			for (i = 0; i < count; i++) {
				dataArray1[i] = dataArray[i];

			}
			dataArray1[i] = data;
			count++;

			dataArray = dataArray1;

		}

	}

	public boolean addAtLocation(int position, E data) {
		System.out.println(" count is" + count + "max_size" + maxSize);
		int j;
		if (position <= count) {
			if (count < maxSize) {
				for (j = count - 1; j >= position; j--) {
					dataArray[j + 1] = dataArray[j];
				}
				dataArray[j + 1] = data;
				count++;
			} else {
				int i;
				maxSize = (maxSize * 3) / 2 + 1;
				Object dataArray1[] = new Object[maxSize];
				for (i = 0; i < count - 1; i++) {
					dataArray1[i] = dataArray[i];
				}
				dataArray1[i + 1] = data;
				dataArray = dataArray1;
			}
			return true;
		} else {
			System.out.println("Invalid position");
			return false;
		}

	}

	void display() {

		for (int i = 0; i < count; i++) {
			System.out.println("Data is" + dataArray[i]);
		}
	}

	public int retrieveIndex(Object data) {

		for (int i = 0; i < count; i++) {
			if (dataArray[i] == data) {
				return i;
			}
		}
		return -1;
	}

	int retrieve(Object data, int location) {
		for (int i = location; i < count; i++) {
			if (dataArray[i] == data) {
				return i;
			}
		}
		return -1;

	}

	boolean removeDataOfLocation(int location) {

		if (location < count) {
			System.out.println("Deleted data is" + dataArray[location]);
			for (int i = location; i < count - 1; i++) {
				dataArray[i] = dataArray[i + 1];
			}
			count--;
			return true;

		} else {
			System.out.println("Invalid location");
			return false;
		}

	}

	boolean removeData(Object data) {
		for (int i = 0; i < count; i++) {
			if (dataArray[i] == data) {
				for (int j = i; j < count - 1; j++) {
					dataArray[j] = dataArray[j + 1];
				}
				count--;
				return true;
			}
		}
		return false;

	}

	void clearList() {
		count = 0;

	}

	void reverseList() {
		int i = 0, j = count - 1;
		Object temp = new Object();

		for (; i <= j; i++, j--) {
			temp = dataArray[i];
			dataArray[i] = dataArray[j];
			dataArray[j] = temp;
		}

	}

	Object get(int loc) {

		return dataArray[loc];
	}

	void sort() {

	}

	public static void main(String ar[]) {

		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(0);
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);
		ob.add(5);
		ob.add(6);
		ob.add(7);
		ob.add(8);
		ob.add(9);
		ob.add(10);
		ob.add(11);
		ob.add(5);
		ob.display();
		boolean b = ob.addAtLocation(20, 355);
		if (b) {
			ob.display();
		} else {

		}
		int index = ob.retrieveIndex(36);
		if (index == -1) {
			System.out.println("Element doesn't exist");
		} else {
			System.out.println("element exist at" + index);
		}

		index = ob.retrieve(5, 7);
		if (index == -1) {
			System.out.println("element doesn't exist");
		} else {
			System.out.println("element exist at" + index);
		}

		b = ob.removeDataOfLocation(3);
		if (b) {
			System.out.println("Element deleted succesfully");
			ob.display();
		} else {
			System.out.println("Element can't be deleted");

		}
		b = ob.removeData(0);
		if (b) {
			System.out.println("Element deleted succesfully");
			ob.display();
		} else {
			System.out.println("Element can't be deleted");

		}

		b = ob.removeData(5);
		if (b) {
			System.out.println("Element deleted succesfully");
			ob.display();
		} else {
			System.out.println("Element can't be deleted");

		}

		ob.reverseList();
		System.out.println("\n\n");
		ob.display();

		// ob.clearList();
		// System.out.println("clear list");
		// ob.display();

	}
}