/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.controllers;

import UI.views.MainFrame;
import ciphers.Cesar;
import ciphers.Sustitution;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Jose
 */
public class MainFrameController {

    public static String loadText(File fileToOpen) {
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        String text="";
        try {
           file = new File (fileToOpen.getPath());
           fr = new FileReader (file);
           br = new BufferedReader(fr);
           String line;
           while((line=br.readLine())!=null)
              text += line + "\n";
        }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           try{                    
              if( null != fr ){   
                 fr.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
        return text;
    }   

    public static void saveText(File fileToSave, String text) {
        String path = fileToSave.getPath();
        FileWriter file = null;
        PrintWriter pw = null;
        if(!(path.endsWith(".txt"))){
            path+=".txt";
        }
        try
        {
            file = new FileWriter(path);
            pw = new PrintWriter(file);
            pw.println(text);

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el file.
           if (null != file)
              file.close();
           } catch (Exception e) {
              System.out.println(e.toString());
           }
        }
    }

    public static String cipherText(String clearText, int selectedIndex, String key, String secondKey) {
        String cipherText = "";
        switch(selectedIndex){
            case MainFrame.CESAR:
                 if(!key.isEmpty()){
                     cipherText = Cesar.cipherString(clearText, Integer.valueOf(key));
                 }
                break;
            case MainFrame.SUSTITUTION:
                if(!key.isEmpty()){
                     cipherText = Sustitution.cipherString(clearText, key);
                 }
                break;
        }
        return cipherText;
    }

    public static String decodeText(String cipherText, int selectedIndex, String key, String secondKey) {
        String clearText = "";
        switch(selectedIndex){
            case MainFrame.CESAR:
                 if(!key.isEmpty()){
                     clearText = Cesar.decodeString(cipherText, Integer.valueOf(key));
                 }
                break;
            case MainFrame.SUSTITUTION:
                if(!key.isEmpty()){
                     clearText = Sustitution.decodeString(cipherText, key);
                 }
                break;
        }
        return clearText;
    }
}
