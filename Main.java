/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
       
        Scanner sc = new Scanner(System.in);
        String nameIn = "" ;
        
        System.out.print("What is your name? ");
        nameIn = sc.next();
        
        if (nameIn.equals("Alice") || nameIn.equals("Bob")) {
            greeting(nameIn);
        }
        else {
            who(nameIn);
        }
        return;
    }
    
    public static void greeting(String friend) {
        System.out.println("Hello " + friend + ", Good to see you!");
        return;
    }
    public static void who(String stranger) { 
        System.out.println("Who are you " + stranger + "?");
        return;   
    }
    
}
