package assignment4;

public class Permutation {
	String output[] = new String[fact(3)];

	// function to calculate permutation
	public String[] calculatepermutation(String s, int end, int index,
			int out_index) {

		String s1, s2;
		int i, j;
		if (out_index == fact(end + 1)) {                        // base condition for recursion
			return output;
		} else {
			s1 = swap(0, index, s);
			index++;
			for (j = 1; j <= end; j++) {
				s2 = swap(1, j, s1);
				output[out_index] = s2;
				out_index++;
			}
			calculatepermutation(s, end, index, out_index);
		}
		return output;
	}
    // function to swap characters
	public String swap(int first, int last, String s2) {
		char temp;
		char[] arr = s2.toCharArray();
		temp = arr[last];
		arr[last] = arr[first];
		arr[first] = temp;
		s2 = new String(arr);
		return s2;
	}
    int fact(int n) {
		int fact = 1;
		for (int i = n; i > 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String ar[]) {
		String s = "ABC";
		Permutation pt = new Permutation();
		String[] p = pt.calculatepermutation(s, 2, 0, 0);
		for (String str : p)
			System.out.println(str);
	}
}