/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queueapp;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: QueueApp.
 */
public class QueueApp {

    public static void main(String[] args) {
        Queue theQueue = new Queue(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        theQueue.displayQueue();

        while (!theQueue.isEmpty()) {
            long n = theQueue.remove();
            System.out.print(n + " ");
        }
        System.out.println("");

        theQueue.remove(); // Attempt to remove from an empty queue

        theQueue.insert(90); // Attempt to insert into a full queue
    }
}
