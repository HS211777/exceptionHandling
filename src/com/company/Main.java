package com.company;
import java.util.InputMismatchException;
import java.util.Scanner; // you can type java.util.* to import the whole library, but this is bad code, don't use it
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        boolean valid = false;
        while(!valid){
            try{
                System.out.println("type in a number");
                int c = input.nextInt();
                System.out.println(10/c);
                valid = true;
            }
            catch(InputMismatchException e){
                System.out.println("Number too long "+e);
                input.next(); //clears the scanner so the program works
        }
            catch (ArithmeticException e){
                System.out.println("you cannot divide by 0 "+e);
                input.next();
            }
            catch(Exception e) { //error tends to be shortened to e
                System.out.println("Exception occurred "+e);
                input.next();
            }
            finally { //always happens no matter if there is an error, not really nessisary, dont crash a program in a finally block
                System.out.println("the finally statement is executed");
            }
        }
    }
}
