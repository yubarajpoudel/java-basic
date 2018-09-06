/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college.base;

/**
 *
 * @author yubaraj
 */
//base class
public abstract class Faculty {
    protected String name = "Tribhuvan University";
    public int noOfYear;
    /* note
     there are three types of the access specifier
      1. public
      2. private
      3. protected
        if B extends A (B inherits A or B is the child of the A then)
            - if the variables or the methods in the A is private then 
              the variables and methods are only visible in the class A
            - if the variables or the methods in the A is protected the that 
              variable or method will be private in B
            - if the variables and methods in the class A is public then it is public in the class B
    
    */
    public Faculty(){
        noOfYear = getNumberOfYear();
        name = getName();
    }
    
    public abstract int getNumberOfYear();
    public String getName(){
        return this.name;
    }
}