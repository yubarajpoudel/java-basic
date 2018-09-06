/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstclass;

import base.Person;
import others.JavaTrainer;
import util.Utils;
import java.util.Scanner;


/**
 *
 * @author yubaraj
 */
public class Firstclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
       // To use the class we need to intantiate the object
       // create object of class student
       // Classname objectName = new ClassName()
       // the pupose of this example is
       // - we can create number of objects from the same class
       // - each object are different from each other and are not dependent
       
       // this is student1 object
       Student student1 = new Student();
       student1.setName("Sharmila Neupane");
       student1.setAddress("Butwal");
       
       // this is student2 object
       Student student2 = new Student();
       student2.setName("Shiva Aryal");
       student2.setAddress("Nawalparasi");
       
       // this is student 3 object
       Student student3 = new Student();
       student3.setName("Digambar chaudhary");
       student3.setAddress("Nuwakot");
       
       //this is student4 object
       Student student4 = new Student();
       student4.setName("Arjun subedi");
       student4.setAddress("Kathmandu");
       
       Student student5 = new Student("Rajesh", "kalanki");
       System.out.println("student5 name = " + student5.getName() + " address = " + student5.getAddress());
        
       Student student6 = new Student("Shyam", "Biratnagar", 5);
        System.out.println("sudent6 name = " + student6.getName());
       
       System.out.println(student2.getName() + " hasAdress : " + student2.getAddress());
        
       Marks marks = new Marks("Math", 80);
       Student student7 = new Student("Shiva", "Baneshwor", 34, marks);
       System.out.println("Marks = " + student7.mark.marks);
       
       // lets see the difference between static and non static class
   // in Utils class we have two static methods and three non static methods
    // here, we are looking the difference between static and non static methods
    // bascially we use the methods of the class by first creating the object of the class and call it with 
    //method name followed by object name separated by the . operator
    
    // for the static methods
      Utils.log("FirstClass","We are testing the static function");
      Utils.log("Firstclass", "isOnline = " + Utils.IS_ONLINE);
      //????
      Utils util = new Utils();
      util.setData("");
      
      Trainer trainer = new Trainer();
      Utils.log("",trainer.getAddress());
      Utils.log("salary", trainer.salary+"");
      
     JavaTrainer javaTrainer = new JavaTrainer();
     Person person = new Person();
      
    }
    
    
    
}
