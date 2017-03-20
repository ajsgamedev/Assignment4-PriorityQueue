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

    char[] elements;  // Array that holds heap elements
    private int numElements;

    // Constructor
    public Heap(int maxSize) {
        elements = new char[maxSize];
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
                if (elements[leftChild] <= elements[rightChild]) {
                    maxChild = rightChild;
                } else {
                    maxChild = leftChild;
                }
                if (elements[root] < elements[maxChild]) {
                    Swap(elements, root, maxChild);
                    ReheapDown(maxChild, bottom);
                }
            }
        }// 

    }

    public void ReheapUp(int root, int bottom) {
        int parent;
        if (bottom > root) {
            parent = (bottom - 1) / 2;
            if (elements[parent] < elements[bottom]) {
                Swap(elements, parent, bottom);
                ReheapUp(root, parent);
            }
        }
    }// end of ReheapUp

    public void Swap(char[] ele, int i, int j )
    {
        
        
    }
    
}
