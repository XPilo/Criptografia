/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciphers;

/**
 *
 * @author Jose
 */
public class Cesar {
     public static int n = 26;
    
    public static char cipherCharacter(char x, int k){
        int xValue = (int)x;
        int cipherValue = (xValue + (k % n));
        if(cipherValue > 122)
            cipherValue-=n;
        x = (char)(cipherValue);
        return x;   
    }
    
    public static String cipherString(String clearText, int k){
        clearText = clearText.replaceAll("\\s","").toLowerCase();//elimina espacios, tabuladores, saltos de linea y convierte el texto a minusculas
        String cipherText = ""; 
        for(int i = 0; i < clearText.length(); i++){
            cipherText+=cipherCharacter(clearText.charAt(i), k);
        }
        return cipherText.toUpperCase();
    }
    
    public static char decodeCharacter(char x, int k){
        int xValue = (int)x;
        int cipherValue = (xValue - (k % n));
        if(cipherValue < 97)
            cipherValue+=n;
        x = (char)(cipherValue);
        return x;   
    }
    
    public static String decodeString(String cipherText, int k){
        cipherText = cipherText.toLowerCase();
        String decipherText = "";
        for(int i = 0; i < cipherText.length(); i++){
            decipherText+=decodeCharacter(cipherText.charAt(i), k);
        }
        return decipherText;
    }
}
