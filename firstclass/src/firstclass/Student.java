/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstclass;

/**
 *
 * @author yubaraj
 */
public class Student {
    // variables associated with the class
    String name, address;
    int roll;
    Marks mark;
    
    // empty constructor
    public Student(){
        
    }
    // constructor with two arguments
    public Student(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    // constructor with three argument
    public Student(String name, String address, int roll){
        this.name = name;
        this.address = address;
        this.roll = roll;
    }
     // constructor with four argument
    public Student(String name, String address, int roll, Marks mark){
        this.name = name;
        this.address = address;
        this.roll = roll;
        this.mark = mark;
    }
    
    // methods   
    // setter
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setRollNo(int roll){
        this.roll = roll;
    }
    
    //getter
    public String getName(){
        return this.name;
    }
    
    public int getRollNo(){
        return this.roll;
    }
    
    public String getAddress(){
        return this.address;
    }
}
