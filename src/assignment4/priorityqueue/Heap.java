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
public class Heap {

    Patient[] elements;  // Array that holds heap elements
    private int numElements;

    // Constructor
    public Heap(int maxSize) {
        elements = new Patient[maxSize];
        numElements = maxSize;
    }

    public void ReheapDown(int root, int bottom) {
        int maxChild;
        int rightChild;
        int leftChild;
        leftChild = root * 2 + 1;
        rightChild = root * 2 + 2;

        if (leftChild <= bottom) {
            if (leftChild == bottom) {
                maxChild = leftChild;
            } else {

                if (elements[leftChild].getPriNumber() < elements[rightChild].getPriNumber()) {

                    maxChild = rightChild;

                } else if (elements[leftChild].getPriNumber() > elements[rightChild].getPriNumber()) {

                    maxChild = leftChild;
                } else {
                    if (elements[leftChild].getTime() > elements[rightChild].getTime()) {
                        maxChild = rightChild;
                    } else {
                        maxChild = leftChild;
                    }
                }

                if (elements[root].getPriNumber() == elements[maxChild].getPriNumber()) {
                    if (elements[root].getTime() > elements[maxChild].getTime()) {

                        Swap(elements, root, maxChild);
                        ReheapDown(maxChild, bottom);
                    }

                } else if (elements[root].getPriNumber() < elements[maxChild].getPriNumber()) {
                    Swap(elements, root, maxChild);
                    ReheapDown(maxChild, bottom);
                }
            }
        }
    }

    public void ReheapUp(int root, int bottom) {
        int parent;
        if (bottom > root) {
            parent = (bottom - 1) / 2;
            if (elements[parent].getPriNumber() < elements[bottom].getPriNumber()) {
                Swap(elements, parent, bottom);
                ReheapUp(root, parent);
            }
        }
    }// end of ReheapUp

    public void Swap(Patient[] ele, int i, int j) {
        Patient temp = ele[i];
        ele[i] = ele[j];
        ele[j] = temp;
    }
}
