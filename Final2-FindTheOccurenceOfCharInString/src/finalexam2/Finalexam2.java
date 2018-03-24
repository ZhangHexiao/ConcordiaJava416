/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam2;

import java.util.Scanner;

/**
 *
 * @author z_hexiao
 */
public class Finalexam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Finalexam2 CEJV416= new Finalexam2();
    CEJV416.text();
    }
    public int count(String str, char a){
    int l = str.length();
    int i=0;
    int number=0;
    for(i=0;i<l;i++){
    if (a==str.charAt(i))
    {number++;
     }
    }
    
    return number;
    }
     
    public void text(){
    Scanner Sc = new Scanner(System.in);    
    String str = Validator.getString(Sc, "Please input the string ");
    String aa = Validator.getChar(Sc, "Please input the char ");
    System.out.println(str);
    char a = aa.charAt(0);
    int n;
    n= count(str,a);
    System.out.println("The outcome is "+n);
    }
   
}
