
package cezar;

import java.util.Scanner;

/**
 *
 * @author Marwa Belmir
 */
public class Cesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        System.out.println(" text : ");
        String text;
        text = sc.nextLine();
        System.out.println(" Key : ");
        int k;
        k=sc.nextInt();
        String cipher = encrypt(text,k);
        System.out.println("encrypt : " +cipher);
        String decrypted = decrypt(cipher ,k);
        System.out.println("decrypt :" +decrypted);
    }

    private static String encrypt(String plainText, int shift) {
     if (shift>26){
         shift = shift%26;
     }
     else if (shift <0){
          shift = (shift%26)+26;    
     }
     
     String cipherText ="";
     int length = plainText.length();
     for( int i=0; i<length; i++){
         char ch = plainText.charAt(i);
         if (Character.isLetter(ch)){
             if(Character.isLowerCase(ch)){
             char c = (char)(ch+shift);
             if (c>'z'){
                 cipherText+= (char)(ch-(26-shift));
             }
             else{
                 cipherText+= c;
             }
         }
         else if(Character.isUpperCase(ch)){
             char c = (char)(ch+shift);
             if (c>'Z'){
                 cipherText+= (char)(ch-(26-shift));
             }
             else{
                 cipherText+= c;
             }
         }}
     
     else {
             cipherText += ch;
             }
        
    }return cipherText;}
    

    private static String decrypt(String plainText, int shift) {
        
  if (shift>26){
         shift = shift%26;
     }
     else if (shift <0){
          shift = (shift%26)+26;    
     }
     
     String cipherText ="";
     int length = plainText.length();
     for( int i=0; i<length; i++){
         char ch = plainText.charAt(i);
         if (Character.isLetter(ch)){
             if(Character.isLowerCase(ch)){
             char c = (char)(ch-shift);
             if (c<'a'){
                 cipherText+= (char)(ch+(26-shift));
             }
             else{
                 cipherText+= c;
             }
         }
         else if(Character.isUpperCase(ch)){
             char c = (char)(ch-shift);
             if (c<'A'){
                 cipherText+= (char)(ch+(26-shift));
             }
             else{
                 cipherText+= c;
             }
         }
         }
     else {
             cipherText += ch;
             }
        
    }return cipherText;
                
}}
