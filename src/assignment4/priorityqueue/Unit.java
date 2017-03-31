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
public class Unit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "first";
        String name2 = "second";
        
        int p1 = 1;
        int p2 = 1;
        
        
        long timeNow = System.currentTimeMillis();
        
        Patient P1 = new Patient(p1, name, timeNow);
        long timeLater = System.currentTimeMillis() + 100;
        

        Patient P2 = new Patient(p2, name2, timeLater);
        
        if(P1.getTime() > P2.getTime()){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
        System.out.println(P1.getTime());
        System.out.println(P2.getTime());
        
        
    }
    
}
