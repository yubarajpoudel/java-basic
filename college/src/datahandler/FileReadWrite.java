/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahandler;

import callback.FileCreatedCallback;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author yubaraj
 */
public class FileReadWrite {
    // to read the file we need the file
    // we have two ways of reading and writing the file
    // FileInputStream
    // FileOutputStream
    /**
     * FileInputStream(byte-reader) read the content of the file in byte by byte i.e. 8 bit a time
     * FileOutputStream (byte-writer)write the content in the file in byte
     *  
     * FileReader(char -reader) ie. it reads 2 byte of data at a time i.e. 16 bit
     * FileWriter(char-writer) i.e it writes 2 byte of data at a time i.e. 16 bit
     * 
     */
    String filePath;
    FileCreatedCallback callback = null;
    
    public FileReadWrite(String filePath){
        this.filePath = filePath;
    }
    public String readFile(){
        // file Name?
        String dataFromFile = "";
        try{
            FileInputStream is = new FileInputStream(filePath);
            int byteData;
            while((byteData = is.read()) != -1){
                dataFromFile += (char)byteData;
            }
        }catch(FileNotFoundException e){
           e.printStackTrace();
        }catch(IOException e){
           e.printStackTrace();
        }
        return dataFromFile;
    }
    
    public void writeInFile(String dataToWrite){
        try{
            FileOutputStream os = new FileOutputStream(filePath);
            os.write(dataToWrite.getBytes());
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    public File createFileIfNotExists(){
        try{
        File file = new File(filePath);
        if(!file.exists()){
            file.createNewFile();
        }
        return file;
        }catch(IOException e){e.printStackTrace();}
        return null;
    }
    
    public File[] showAllFilesInDir(String dirPath){
       File file = new File(dirPath);
       if(file.exists()){
           return file.listFiles();
       }
       return null;
    }
    
    public void unZipFile(String zipFilePath){
        
    }
    
    public void setOnCallBackListener(FileCreatedCallback listner){
        this.callback = listner;
    }
    
}
