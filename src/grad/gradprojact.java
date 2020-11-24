package grad;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class gradprojact {

 

       public static void main(String[] args) {

 

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream 

        

        

        int Grade; 

        System.out.print("Dear Kindly insert your Grade- "); 

        Grade = sc.nextInt(); 

       if(Grade>=85){

          System.out.println("your result is A");

       }

       else if(Grade>=75){

          System.out.println("your result is B");

       }

       else if(Grade<=65 && Grade>=50){

          System.out.println("your result is C");

       }

       else if(Grade <=50&&Grade>=0){

          System.out.println("your result is D");

       }

       else {

          System.out.println("your result is not provided into the task description you may be between 65 -75");

       }

}

}
