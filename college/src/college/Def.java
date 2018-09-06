/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import callback.MButtonCLickListener;

/**
 *
 * @author yubaraj
 */
public class Def implements MButtonCLickListener{

    @Override
    public void onClicked() {
        System.out.println("Hello button is clicked");  
    }
    
    public Def(){
        System.out.println("Hi I am taking value, let me know when button is clicked");
        MButton button = new MButton();
        button.setClickListener(this);
    }
    // certain operation may be in place
    // user input field value
    // validation
    // objective when the button is clicked the value should be passed in server or lets say save in the database
}
