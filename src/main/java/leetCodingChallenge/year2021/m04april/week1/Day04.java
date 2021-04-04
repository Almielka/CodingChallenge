package leetCodingChallenge.year2021.m04april.week1;

/**
 * @author Anna S. Almielka
 * 04.04.2021
 */

public class Day04 {

    /**
     * Design your implementation of the circular queue.
     * The circular queue is a linear data structure in which the operations are performed
     * based on FIFO (First In First Out) principle and the last position is connected back
     * to the first position to make a circle. It is also called "Ring Buffer".
     * <p>
     * One of the benefits of the circular queue is that we can make use of the spaces
     * in front of the queue. In a normal queue, once the queue becomes full,
     * we cannot insert the next element even if there is a space in front of the queue.
     * But using the circular queue, we can use the space to store new values.
     * <p>
     * Implementation the MyCircularQueue class:
     * <ul>
     * <li>MyCircularQueue(k) Initializes the object with the size of the queue to be k.</li>
     * <li>int Front() Gets the front item from the queue. If the queue is empty, return -1.</li>
     * <li>int Rear() Gets the last item from the queue. If the queue is empty, return -1.</li>
     * <li>boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.</li>
     * <li>boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.</li>
     * <li>boolean isEmpty() Checks whether the circular queue is empty or not.</li>
     * <li>boolean isFull() Checks whether the circular queue is full or not.</li></ul>
     * <p>
     * Constraints:
     * 1 <= k <= 1000
     * 0 <= value <= 1000
     * At most 3000 calls will be made to enQueue, deQueue, Front, Rear, isEmpty, and isFull.
     * <p>
     * Follow up: Could you solve the problem without using the built-in queue?
     */
    // Runtime: 4 ms
    // Memory Usage: 39.4 MB
    class MyCircularQueue {

        private int size;
        private int[] queue;
        private int front;
        private int rear;

        /**
         * Initializes the object with the size of the queue to be k.
         *
         * @param k an integer number of {@code size} of the {@code queue}
         */
        public MyCircularQueue(int k) {
            size = k;
            queue = new int[size];
            front = 0;
            rear = -1;
        }

        /**
         * Inserts an element into the circular queue. Return true if the operation is successful.
         *
         * @param value an integer element
         * @return {@code true} if inserted the {@code value} into the {@code queue},
         * {@code false} otherwise
         */
        public boolean enQueue(int value) {
            if (isFull()) return false;
            if (rear == size - 1) {
                rear = -1;
            }
            queue[++rear] = value;
            return true;
        }

        /**
         * Deletes an element from the circular queue. Return true if the operation is successful.
         *
         * @return {@code true} if deleted the into the {@code queue},
         * {@code false} otherwise
         */
        public boolean deQueue() {
            if (isEmpty()) return false;
            //when only one element
            if (front == rear) {
                front = 0;
                rear = -1;
            } else {
                //if front is last pos, then reset to first position
                //otherwise increment
                if (front == size - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            return true;
        }

        /**
         * Gets the front item from the queue. If the queue is empty, return -1.
         *
         * @return the {@code front} item from the {@code queue}
         */
        public int Front() {
            if (isEmpty()) return -1;
            return queue[front];
        }

        /**
         * Gets the last item from the queue. If the queue is empty, return -1.
         *
         * @return the {@code rear} item from the {@code queue}
         */
        public int Rear() {
            if (isEmpty()) return -1;
            return queue[rear];
        }

        /**
         * Checks whether the circular queue is empty or not.</li>
         *
         * @return {@code true} if circular {@code queue} is empty, {@code false} otherwise
         */
        public boolean isEmpty() {
            return front == 0 && rear == -1;
        }

        /**
         * Checks whether the circular queue is full or not.
         *
         * @return {@code true} if circular {@code queue} is full, {@code false} otherwise
         */
        public boolean isFull() {
            return front == 0 && rear == size - 1 || front != 0 && rear == front - 1;
        }
    }

    /**
     * Your MyCircularQueue object will be instantiated and called as such:
     * MyCircularQueue obj = new MyCircularQueue(k);
     * boolean param_1 = obj.enQueue(value);
     * boolean param_2 = obj.deQueue();
     * int param_3 = obj.Front();
     * int param_4 = obj.Rear();
     * boolean param_5 = obj.isEmpty();
     * boolean param_6 = obj.isFull();
     */
}
