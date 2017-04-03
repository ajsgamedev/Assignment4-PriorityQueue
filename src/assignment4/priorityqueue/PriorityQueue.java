/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4.priorityqueue;

/**
 *
 * @author k00223375
 */
public class PriorityQueue {

    private int numItems;
    private Heap items;
    private int maxItems;

    public PriorityQueue(int max) {
        items = new Heap(max);
        maxItems = max;
        numItems = 0;
    }

    public void makeEmpty() {
        numItems = 0;
    }

    public String deQueue() // Post: element with highest priority has been removed
    // from the queue; a copy is returned from the method in item
    {
        Patient pat = items.elements[0];	// remove root element
        items.elements[0] = items.elements[numItems - 1];
        numItems--;
        items.ReheapDown(0, numItems - 1);
        return pat.getPatName();
    }

    public void enQueue(Patient pat) // Post: newItem is in the Queue
    {
        numItems++;
        items.elements[numItems - 1] = pat;	// remove root element
        items.ReheapUp(0, numItems - 1);
    }

    public boolean isFull() // Post: Function value = true if the queue is full; false otherwise
    {
        return numItems == maxItems;
    }

    public boolean isEmpty() // Post: Function value = true if the queue is empty; false otherwise
    {
        return numItems == 0;
    }

    public String printQueue() {
        String queue = "";

        for (int i = 0; i < numItems; i++) {
            if (items.elements[i] != null) {
                queue += items.elements[i].printPatientDetails();
            } else {

            }
        }
        return queue;
    }
}
