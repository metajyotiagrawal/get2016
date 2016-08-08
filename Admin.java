package DS4;

import java.util.Scanner;
/**
 * class to to handle the jobs sent to the admin
 * @author jyoti
 *
 */
public class Admin {
	public Job[] jobHeap = new Job[100];
	int largest = 0;
	int heapSize = 0;

	public void insertnewJob() {

		System.out.println("Enter job profile");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Job newjob = new Job(str);
		Insert(newjob);
	}
/*
 * to insert jb object in array jobheap
 * jb object containing job profile and priority
 */
	public void Insert(Job jb) {
		jobHeap[heapSize] = jb;
		for (int i = heapSize / 2; i >= 0; i--) {
			heapify(i);

		}
		heapSize++;
	}
/*
 * to heapify the heap array jobHeap
 */
	public void heapify(int i) {

		int L = 2 * i + 1;
		int R = 2 * i + 2;
		if (L <= heapSize && jobHeap[L].priority > jobHeap[i].priority) {
			largest = L;

		} else {
			largest = i;
		}
		if (R <= heapSize && jobHeap[R].priority > jobHeap[largest].priority) {
			largest = R;
		}
		if (largest != i) {
			Job swap = new Job();
			swap = jobHeap[i];
			jobHeap[i] = jobHeap[largest];
			jobHeap[largest] = swap;
		}
	}
/*
 * to display job on the basis of priority
 */
	public void displayJob() {
		for (int cnt = 0; cnt < heapSize; cnt++) {
			System.out.println(jobHeap[cnt].profile);
		}

	}

	public static void main(String args[]) {
		Admin ad = new Admin();

		Scanner sc = new Scanner(System.in);
		int exit;
		while (true) {
			ad.insertnewJob();
			System.out.println("want to continue enter number other then 1");
			exit = sc.nextInt();
			if (exit == 1) {
				break;
			}

		}
		ad.displayJob();
		sc.close();
	}

}
