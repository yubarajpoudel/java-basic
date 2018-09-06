/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import college.base.Faculty;

/**
 *
 * @author yubaraj
 */
public class Engineering extends Faculty implements DownloadListener {
    public Engineering(){
       
    }
    public void showName(){
        System.out.println(this.name);
    }
    public void showNumberOfYear(){
        System.out.println(this.noOfYear);
    }

//    @Override
//    public int getNumberOfYear() {
//        return 4; //To change body of generated methods, choose Tools | Templates.
//    }
    
    public void downloadFile(){
        Download download = new Download(this);
        download.downloadFile();
    }

    @Override
    public int getNumberOfYear() {
        return 4;
    }

    @Override
    public String getName() {
        return "Computer Engineering";
    }

    @Override
    public void downloadCompleted() {
        System.out.println("Engineering :: downloadCompleted"); 
    }

    @Override
    public void onStarted() {
        System.out.println("Engineering :: OnStarted called");
    }

    @Override
    public void downloadFailed() {
        System.out.println("Engineering :: Download Failed");
    }
    
    
    
}
