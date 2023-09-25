/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueapp;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: QueueApp.
 */
class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if (!isFull()) {
            if (rear == maxSize - 1) // deal with wraparound
            {
                rear = -1;
            }
            queArray[++rear] = j;
            nItems++;
        } else {
            System.out.println("Queue is full. Cannot insert " + j);
        }
    }

    public long remove() {
        if (!isEmpty()) {
            long temp = queArray[front++];
            if (front == maxSize) // deal with wraparound
            {
                front = 0;
            }
            nItems--;
            return temp;
        } else {
            System.out.println("Queue is empty. Cannot remove.");
            return -1; // Return a sentinel value to indicate an empty queue.
        }
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public void displayQueue() {
        System.out.print("Queue Array: ");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println();
        System.out.println("Front Index: " + front);
        System.out.println("Rear Index: " + rear);
        System.out.println("Number of Items: " + nItems);
    }
}
