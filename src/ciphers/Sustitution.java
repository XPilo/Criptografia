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
public class Sustitution {
    public static int n = 26;
    
    public static String cipherString(String clearText, String key){
        clearText = clearText.replaceAll("\\s","").toLowerCase();//elimina espacios, tabuladores, saltos de linea y convierte el texto a minusculas
        String cipherText = ""; 
        int pos;
        for(int i = 0; i < clearText.length(); i++){
            pos = ((int)clearText.charAt(i)) - 'a';
            cipherText+=key.charAt(pos);
        }
        return cipherText.toUpperCase();
    }
    
    public static String decodeString(String cipherText, String key){
        cipherText = cipherText.replaceAll("\\s","").toLowerCase();//elimina espacios, tabuladores, saltos de linea y convierte el texto a minusculas
        String clearText = ""; 
        int pos;
        for(int i = 0; i < cipherText.length(); i++){
            pos = key.indexOf(cipherText.charAt(i));
            clearText+=(char)(pos+97);
        }
        return clearText.toLowerCase();
    }
}
