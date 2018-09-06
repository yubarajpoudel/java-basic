/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author yubaraj
 */
public abstract class Person {
    
   private String name;
   public int salary;
   protected String address;
   
   public Person(){
       
   }
   
   public void log(String message){
       System.out.println(message);
   }
   
   private boolean isStaff(){
       return false;
   }
   
}
