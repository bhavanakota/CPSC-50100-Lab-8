/*
Exercise 1
Modify the main method of the Driver class from Lab #7. In this method, do the following:
1. Create instances of an ArrayQ and a LinkedQueue
2. Enqueue the following int's onto the two queues: (1,7,3,4,9,2)
3. Dequeue all the elements from the queues, displaying each int as it's removed
 */

public class Driver {

	public static void main(String[] args) {

		// Creating the ArrayQueue and LinkedQueue

		ArrayQ arrayQ = new ArrayQ();
		LinkedQueue linkedQ = new LinkedQueue();

		// Pushing the values into each stack
		arrayQ.enqueue(1);
		arrayQ.enqueue(7);
		arrayQ.enqueue(3);
		arrayQ.enqueue(4);
		arrayQ.enqueue(9);
		arrayQ.enqueue(2);

		linkedQ.enqueue(1);
		linkedQ.enqueue(7);
		linkedQ.enqueue(3);
		linkedQ.enqueue(4);
		linkedQ.enqueue(9);
		linkedQ.enqueue(2);

		// Until the array is empty, keep popping off the values and print each value
		while (!arrayQ.isEmpty()) {
			System.out.println("ArrayQueue: " + arrayQ.dequeue());
		}

		System.out.print("\n");

		while (!linkedQ.isEmpty()) {
			System.out.println("LinkedQueue: " + linkedQ.dequeue());
		}

		System.out.print("\n");

		/*
		 * Exercise 2 
		 * Modify the LinkedQueue class to include a new method called
		 * removeMiddle, which removes from the queue the value that is in the middle.
		 * For example, if the queue contains 3, 7, 2, 4, 5, then 2 will be removed. If
		 * the queue contains 2, 9, 1, 4 (even number of values), then remove 9 (round
		 * down). Test the method using the Driver program.
		 */
		
		// Creating a new LinkedQueue for exercise 2 
		LinkedQueue linkedQ2 = new LinkedQueue();
		

		linkedQ2.enqueue(1);
		linkedQ2.enqueue(7);
		linkedQ2.enqueue(3);
		linkedQ2.enqueue(4);
		linkedQ2.enqueue(9);
		linkedQ2.enqueue(2);


		linkedQ2.removeMiddle();
		System.out.println("Removed middle element: " + linkedQ2);
	}
}
