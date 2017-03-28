/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4.priorityqueue;

import java.sql.Timestamp;

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
    private Timestamp timeStamp; 
    private long time;
    
    public Patient(int priNum, String name, long now)
    {
        this.priorityNum = priNum;
        this.name = name;
        this.time = now;
    }
    
    public Patient() 
    {
        /*this.priorityNum = 3;
        this.name = "Bob Bush";
        this.time = timeStamp.getTime();*/
    }
     
    public String getPatName()
    {
        return this.name;
    }
    
    public int getPriNumber()
    {
        return this.priorityNum;
    }
    
    public long getTime()
    {
        return this.time;
    }
            
    
    public String printPatientDetails() 
    {
        String emplInfo = "";
        
        emplInfo += this.priorityNum + "\t";
        emplInfo += this.name+"\n";
        return emplInfo;
    }    
}
