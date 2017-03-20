/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4.priorityqueue;

/**
 *
 * @author Alan Stewart
 */
public class Patient {

    /**
     * @param args the command line arguments
     */
    
    private int priorityNum;
    private String name;
    
    public Patient(int priNum, String name)
    {
        this.priorityNum = priNum;
        this.name = name;
    }
    
    public Patient() 
    {
        this.priorityNum = 3;
        this.name = "Bob Bush";
    }
    
    
    public String printEmployeeDetails() 
    {
        String emplInfo = "";
        
        emplInfo += this.priorityNum + "\t";
        emplInfo += this.name;
        return emplInfo;
    }    
}
