
// Soda Vending Maching - Group 2 Noblefranca, Alegado, & Rabe


package VendingMachine;

// Importing necessary packages
import java.util.*;
import java.text.DecimalFormat;


public class vm_finalproject22 {

    private static final DecimalFormat dec = new DecimalFormat("0.00");
    public static void main(String[] args) {
        

        /// STORAGE----------------------------------------------------------------------------------------
       
        // Each creates a stacklist per drink
        Stack<String> cocacola = new Stack<>();
        cocacola.push("c32");
        cocacola.push("c31");
        cocacola.push("c30");
        cocacola.push("c29");
        cocacola.push("c28");
        cocacola.push("c27");
        cocacola.push("c26");
        cocacola.push("c25");
        cocacola.push("c24");
        cocacola.push("c23");
        cocacola.push("c22");
        cocacola.push("c21");
        cocacola.push("c20");
        cocacola.push("c19");
        cocacola.push("c18");
        cocacola.push("c17");
        cocacola.push("c16");
        cocacola.push("c15");
        cocacola.push("c14");
        cocacola.push("c13");
        cocacola.push("c12");
        cocacola.push("c11");
        cocacola.push("c10");
        cocacola.push("c9");
        cocacola.push("c8");
        cocacola.push("c7");
        cocacola.push("c6");
        cocacola.push("c5");
        cocacola.push("c4");
        cocacola.push("c3");
        cocacola.push("c2");
        cocacola.push("c1");

        Stack<String> cocacolazero = new Stack<>();
        cocacolazero.push("c32");
        cocacolazero.push("c31");
        cocacolazero.push("c30");
        cocacolazero.push("c29");
        cocacolazero.push("c28");
        cocacolazero.push("c27");
        cocacolazero.push("c26");
        cocacolazero.push("c25");
        cocacolazero.push("c24");
        cocacolazero.push("c23");
        cocacolazero.push("c22");
        cocacolazero.push("c21");
        cocacolazero.push("c20");
        cocacolazero.push("c19");
        cocacolazero.push("c18");
        cocacolazero.push("c17");
        cocacolazero.push("c16");
        cocacolazero.push("c15");
        cocacolazero.push("c14");
        cocacolazero.push("c13");
        cocacolazero.push("c12");
        cocacolazero.push("c11");
        cocacolazero.push("c10");
        cocacolazero.push("c9");
        cocacolazero.push("c8");
        cocacolazero.push("c7");
        cocacolazero.push("c6");
        cocacolazero.push("c5");
        cocacolazero.push("c4");
        cocacolazero.push("c3");
        cocacolazero.push("c2");
        cocacolazero.push("c1");
        


        Stack<String> sprite = new Stack<>();
        sprite.push("c32");
        sprite.push("c31");
        sprite.push("c30");
        sprite.push("c29");
        sprite.push("c28");
        sprite.push("c27");
        sprite.push("c26");
        sprite.push("c25");
        sprite.push("c24");
        sprite.push("c23");
        sprite.push("c22");
        sprite.push("c21");
        sprite.push("c20");
        sprite.push("c19");
        sprite.push("c18");
        sprite.push("c17");
        sprite.push("c16");
        sprite.push("c15");
        sprite.push("c14");
        sprite.push("c13");
        sprite.push("c12");
        sprite.push("c11");
        sprite.push("c10");
        sprite.push("c9");
        sprite.push("c8");
        sprite.push("c7");
        sprite.push("c6");
        sprite.push("c5");
        sprite.push("c4");
        sprite.push("c3");
        sprite.push("c2");
        sprite.push("c1");
        


        Stack<String> royal = new Stack<>();
        royal.push("c32");
        royal.push("c31");
        royal.push("c30");
        royal.push("c29");
        royal.push("c28");
        royal.push("c27");
        royal.push("c26");
        royal.push("c25");
        royal.push("c24");
        royal.push("c23");
        royal.push("c22");
        royal.push("c21");
        royal.push("c20");
        royal.push("c19");
        royal.push("c18");
        royal.push("c17");
        royal.push("c16");
        royal.push("c15");
        royal.push("c14");
        royal.push("c13");
        royal.push("c12");
        royal.push("c11");
        royal.push("c10");
        royal.push("c9");
        royal.push("c8");
        royal.push("c7");
        royal.push("c6");
        royal.push("c5");
        royal.push("c4");
        royal.push("c3");
        royal.push("c2");
        royal.push("c1");
        


        Stack<String> sevenup = new Stack<>();
        sevenup.push("c32");
        sevenup.push("c31");
        sevenup.push("c30");
        sevenup.push("c29");
        sevenup.push("c28");
        sevenup.push("c27");
        sevenup.push("c26");
        sevenup.push("c25");
        sevenup.push("c24");
        sevenup.push("c23");
        sevenup.push("c22");
        sevenup.push("c21");
        sevenup.push("c20");
        sevenup.push("c19");
        sevenup.push("c18");
        sevenup.push("c17");
        sevenup.push("c16");
        sevenup.push("c15");
        sevenup.push("c14");
        sevenup.push("c13");
        sevenup.push("c12");
        sevenup.push("c11");
        sevenup.push("c10");
        sevenup.push("c9");
        sevenup.push("c8");
        sevenup.push("c7");
        sevenup.push("c6");
        sevenup.push("c5");
        sevenup.push("c4");
        sevenup.push("c3");
        sevenup.push("c2");
        sevenup.push("c1");
        

        /// STORAGE----------------------------------------------------------------------------------------



        /// USER INPUTS------------------------------------------------------------------------------------

        // Initializing the Scanner class
        Scanner inp = new Scanner(System.in);
        // Creating object for menu details
        menu mn = new menu();

        // Variables to keep the loop running
        int a = 0;
        int b = 0;

        // To loop the process; to continuously modify array contents
        while (a == b) {

            // Displaying Menu
            System.out.println("===============================================");
            System.out.println("             -------------------" + "\n" + "             |||-- WELCOME --|||" + "\n" + "             -------------------" + "\n");
            System.out.println("-----------------------------------------------");
            System.out.println("      ^ Type the number of your choice: ^" + "\n");
            System.out.println("\t" + "DRINKS" + "\t" + "\t" + "\t" + "\t" + "PRICE");
        
            // Displaying menu items in an orderly fashion
            for (int i = 0; i < 5; i++) {
                System.out.println(mn.order[i] + " " + mn.price[i]);
            }

            // Taking user inputs
            System.out.println("-----------------------------------------------" + "\n");
            System.out.println("-----------------------------");
            System.out.print("| Enter Number of Choice: ");
            int inp1 = inp.nextInt();
            System.out.println("-----------------------------");

            // (1st) First Instance, if user chooses Coke
            if (inp1 == 1) {
                
                // This statement verifies if there are still existing products
                if (cocacola.isEmpty() == false) {
                    
                    // Taking user inputs
                    System.out.print("| Number of Orders: ");
                    int in_inp1 = inp.nextInt();
                    System.out.println("-----------------------------");

                    // Requires the user to order  based on available cans
                    while (in_inp1 > cocacola.size()) {
                        System.out.println("\n" + "|| Cannot process order... Available soda left is: " + cocacola.size() + " ||"+ "\n");
                        System.out.println("-----------------------------");
                        System.out.print("| Number of Orders: ");
                        in_inp1 = inp.nextInt();
                        System.out.println("-----------------------------");
                    }
                    
                    // Multiplying order counts
                    double orderCount = in_inp1 * 31.95;

                    // Mimicks loading process (delayed code execution) --  2 seconds
                    System.out.println("\n" + "           |||| Processing Order ||||" + "\n");
                    long start = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start < 2000) {
                    }
                    
                    // Diplays total amount
                    System.out.println("-----------------------------");
                    System.out.println("| Total amount: " + "Php " + orderCount);
                    System.out.println("-----------------------------");

                    // Takes user input (money amount)
                    System.out.print("| Enter money amount: Php ");
                    double in_inp2 = inp.nextDouble();
                    System.out.println("-----------------------------");

                    // Runs if user inputs lesser amount; stops if amount is higher than needed
                    while (in_inp2 < orderCount) {
                        System.out.println("\n" + "|| Cannot process order... Your are short in money. ||" + "\n");
                        System.out.println("-----------------------------");
                        System.out.print("Enter money amount: Php ");
                        in_inp2 = inp.nextDouble(); 
                        System.out.println("-----------------------------"); 
                    }
                    
                    // Mimicks loading process (delayed code execution) -- 2 seconds
                    System.out.println("\n" +"           |||| Processing Order ||||" + "\n\n");
                    long start2 = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start2 < 2000) {
                    }
                
                    // Instances if money has change or none; will display two outcomes
                    if (in_inp2 > orderCount) {
                        double change = in_inp2 - orderCount; 
                        System.out.println("           -------------------------");
                        System.out.println("           | Your change: Php " + dec.format(change) + " |");
                        System.out.println("           -------------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }
                    if (in_inp2 == orderCount) {
                        System.out.println("               ------------------");
                        System.out.println("               | Your change: 0 |");
                        System.out.println("               ------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }

                    // Verifies array contents
                    System.out.println("\n" + "\n" + "-------------backend-------------");
                    for (int j = 0; j < in_inp1; j++) {
                        cocacola.pop();
                    }
                    System.out.println("\n" + "Updated List (Coke): " + cocacola);
                
                    // Updates array contents
                    System.out.println("\n" + "Array Size (Coke): " + cocacola.size());
                    System.out.println("\n" + "-------------backend-------------");
                    System.out.println("===============================================");
                 
                }

                // Displays if no cans are available
                else {
                    System.out.println("--------------------------------------------------------");
                    System.out.println("|||| No more Coke available, please choose another! ||||");
                    System.out.println("--------------------------------------------------------");
                }
            }

            // (2nd) Second Instance, if user chooses Coke Zero
            if (inp1 == 2) {

                // This statement verifies if there are still existing products
                if (cocacolazero.isEmpty() == false) {
                    
                    // Taking user inputs
                    System.out.print("| Number of Orders: ");
                    int in_inp1 = inp.nextInt();
                    System.out.println("-----------------------------");

                    // Requires the user to order  based on available cans
                    while (in_inp1 > cocacolazero.size()) {
                        System.out.println("\n" + "|| Cannot process order... Available soda left is: " + cocacolazero.size() + " ||"+ "\n");
                        System.out.println("-----------------------------");
                        System.out.print("| Number of Orders: ");
                        in_inp1 = inp.nextInt();
                        System.out.println("-----------------------------");
                    }
                    
                    // Multiplying order counts
                    double orderCount = in_inp1 * 31.95;

                    // Mimicks loading process (delayed code execution) --  2 seconds
                    System.out.println("\n" + "           |||| Processing Order ||||" + "\n");
                    long start = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start < 2000) {
                    }
                    
                    // Diplays total amount
                    System.out.println("-----------------------------");
                    System.out.println("| Total amount: " + "Php " + orderCount);
                    System.out.println("-----------------------------");

                    // Takes user input (money amount)
                    System.out.print("| Enter money amount: Php ");
                    double in_inp2 = inp.nextDouble();
                    System.out.println("-----------------------------");

                    // Runs if user inputs lesser amount; stops if amount is higher than needed
                    while (in_inp2 < orderCount) {
                        System.out.println("\n" + "|| Cannot process order... Your are short in money. ||" + "\n");
                        System.out.println("-----------------------------");
                        System.out.print("Enter money amount: Php ");
                        in_inp2 = inp.nextDouble(); 
                        System.out.println("-----------------------------"); 
                    }
                    
                    // Mimicks loading process (delayed code execution) -- 2 seconds
                    System.out.println("\n" +"           |||| Processing Order ||||" + "\n\n");
                    long start2 = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start2 < 2000) {
                    }
                
                    // Instances if money has change or none; will display two outcomes
                    if (in_inp2 > orderCount) {
                        double change = in_inp2 - orderCount; 
                        System.out.println("           -------------------------");
                        System.out.println("           | Your change: Php " + dec.format(change) + " |");
                        System.out.println("           -------------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }
                    if (in_inp2 == orderCount) {
                        System.out.println("               ------------------");
                        System.out.println("               | Your change: 0 |");
                        System.out.println("               ------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }

                    // Verifies array contents
                    System.out.println("\n" + "\n" + "-------------backend-------------");
                    for (int j = 0; j < in_inp1; j++) {
                        cocacolazero.pop();
                    }
                    System.out.println("\n" + "Updated List (Coke-Zero): " + cocacolazero);
                
                    // Updates array contents
                    System.out.println("\n" + "Array Size (Coke-Zero): " + cocacolazero.size());
                    System.out.println("\n" + "-------------backend-------------");
                    System.out.println("===============================================");
                 
                }

                // Displays if no cans are available
                else {
                    System.out.println("--------------------------------------------------------");
                    System.out.println("|||| No more Coke-Zero available, please choose another! ||||");
                    System.out.println("--------------------------------------------------------");
                }
            }
        
            // (3rd) Third Instance, if user chooses Sprite
            if (inp1 == 3) {

                // This statement verifies if there are still existing products
                if (sprite.isEmpty() == false) {
                    
                    // Taking user inputs
                    System.out.print("| Number of Orders: ");
                    int in_inp1 = inp.nextInt();
                    System.out.println("-----------------------------");

                    // Requires the user to order  based on available cans
                    while (in_inp1 > sprite.size()) {
                        System.out.println("\n" + "|| Cannot process order... Available soda left is: " + sprite.size() + " ||"+ "\n");
                        System.out.println("-----------------------------");
                        System.out.print("| Number of Orders: ");
                        in_inp1 = inp.nextInt();
                        System.out.println("-----------------------------");
                    }
                    
                    // Multiplying order counts
                    double orderCount = in_inp1 * 31.95;
                    
                    // Mimicks loading process (delayed code execution) --  2 seconds
                    System.out.println("\n" + "           |||| Processing Order ||||" + "\n");
                    long start = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start < 2000) {
                    }
                    
                    // Diplays total amount
                    System.out.println("-----------------------------");
                    System.out.println("| Total amount: " + "Php " + orderCount);
                    System.out.println("-----------------------------");

                    // Takes user input (money amount)
                    System.out.print("| Enter money amount: Php ");
                    double in_inp2 = inp.nextDouble();
                    System.out.println("-----------------------------");

                    // Runs if user inputs lesser amount; stops if amount is higher than needed
                    while (in_inp2 < orderCount) {
                        System.out.println("\n" + "|| Cannot process order... Your are short in money. ||" + "\n");
                        System.out.println("-----------------------------");
                        System.out.print("Enter money amount: Php ");
                        in_inp2 = inp.nextDouble(); 
                        System.out.println("-----------------------------"); 
                    }
                    
                    // Mimicks loading process (delayed code execution) -- 2 seconds
                    System.out.println("\n" +"           |||| Processing Order ||||" + "\n\n");
                    long start2 = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start2 < 2000) {
                    }
                
                    // Instances if money has change or none; will display two outcomes
                    if (in_inp2 > orderCount) {
                        double change = in_inp2 - orderCount; 
                        System.out.println("           -------------------------");
                        System.out.println("           | Your change: Php " + dec.format(change) + " |");
                        System.out.println("           -------------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }
                    if (in_inp2 == orderCount) {
                        System.out.println("               ------------------");
                        System.out.println("               | Your change: 0 |");
                        System.out.println("               ------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }

                    // Verifies array contents
                    System.out.println("\n" + "\n" + "-------------backend-------------");
                    for (int j = 0; j < in_inp1; j++) {
                        sprite.pop();
                    }
                    System.out.println("\n" + "Updated List (Sprite): " + sprite);
                
                    // Updates array contents
                    System.out.println("\n" + "Array Size (Sprite): " + sprite.size());
                    System.out.println("\n" + "-------------backend-------------");
                    System.out.println("===============================================");
                 
                }

                // Displays if no cans are available
                else {
                    System.out.println("--------------------------------------------------------");
                    System.out.println("|||| No more Sprite available, please choose another! ||||");
                    System.out.println("--------------------------------------------------------");
                }
            }

            // (4th) Fourth Instance, if user chooses Royal
            if (inp1 == 4) {

                // This statement verifies if there are still existing products
                if (royal.isEmpty() == false) {
                    
                    // Taking user inputs
                    System.out.print("| Number of Orders: ");
                    int in_inp1 = inp.nextInt();
                    System.out.println("-----------------------------");

                    // Requires the user to order  based on available cans
                    while (in_inp1 > royal.size()) {
                        System.out.println("\n" + "|| Cannot process order... Available soda left is: " + royal.size() + " ||"+ "\n");
                        System.out.println("-----------------------------");
                        System.out.print("| Number of Orders: ");
                        in_inp1 = inp.nextInt();
                        System.out.println("-----------------------------");
                    }
                    
                    // Multiplying order counts
                    double orderCount = in_inp1 * 31.95;

                    // Mimicks loading process (delayed code execution) --  2 seconds
                    System.out.println("\n" + "           |||| Processing Order ||||" + "\n");
                    long start = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start < 2000) {
                    }
                    
                    // Diplays total amount
                    System.out.println("-----------------------------");
                    System.out.println("| Total amount: " + "Php " + orderCount);
                    System.out.println("-----------------------------");

                    // Takes user input (money amount)
                    System.out.print("| Enter money amount: Php ");
                    double in_inp2 = inp.nextDouble();
                    System.out.println("-----------------------------");

                    // Runs if user inputs lesser amount; stops if amount is higher than needed
                    while (in_inp2 < orderCount) {
                        System.out.println("\n" + "|| Cannot process order... Your are short in money. ||" + "\n");
                        System.out.println("-----------------------------");
                        System.out.print("Enter money amount: Php ");
                        in_inp2 = inp.nextDouble(); 
                        System.out.println("-----------------------------"); 
                    }
                    
                    // Mimicks loading process (delayed code execution) -- 2 seconds
                    System.out.println("\n" +"           |||| Processing Order ||||" + "\n\n");
                    long start2 = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start2 < 2000) {
                    }
                
                    // Instances if money has change or none; will display two outcomes
                    if (in_inp2 > orderCount) {
                        double change = in_inp2 - orderCount; 
                        System.out.println("           -------------------------");
                        System.out.println("           | Your change: Php " + dec.format(change) + " |");
                        System.out.println("           -------------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }
                    if (in_inp2 == orderCount) {
                        System.out.println("               ------------------");
                        System.out.println("               | Your change: 0 |");
                        System.out.println("               ------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }

                    // Verifies array contents
                    System.out.println("\n" + "\n" + "-------------backend-------------");
                    for (int j = 0; j < in_inp1; j++) {
                        royal.pop();
                    }
                    System.out.println("\n" + "Updated List (Royal): " + royal);
                
                    // Updates array contents
                    System.out.println("\n" + "Array Size (Royal): " + royal.size());
                    System.out.println("\n" + "-------------backend-------------");
                    System.out.println("===============================================");
                 
                }

                // Displays if no cans are available
                else {
                    System.out.println("--------------------------------------------------------");
                    System.out.println("|||| No more Royal available, please choose another! ||||");
                    System.out.println("--------------------------------------------------------");
                }
            }

            // (5th) Fifth Instance, if user chooses Seven-Up
            if (inp1 == 5) {

                // This statement verifies if there are still existing products
                if (sevenup.isEmpty() == false) {
                    
                    // Taking user inputs
                    System.out.print("| Number of Orders: ");
                    int in_inp1 = inp.nextInt();
                    System.out.println("-----------------------------");

                    // Requires the user to order  based on available cans
                    while (in_inp1 > sevenup.size()) {
                        System.out.println("\n" + "|| Cannot process order... Available soda left is: " + sevenup.size() + " ||"+ "\n");
                        System.out.println("-----------------------------");
                        System.out.print("| Number of Orders: ");
                        in_inp1 = inp.nextInt();
                        System.out.println("-----------------------------");
                    }
                    
                    // Multiplying order counts
                    double orderCount = in_inp1 * 31.95;

                    // Mimicks loading process (delayed code execution) --  2 seconds
                    System.out.println("\n" + "           |||| Processing Order ||||" + "\n");
                    long start = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start < 2000) {
                    }
                    
                    // Diplays total amount
                    System.out.println("-----------------------------");
                    System.out.println("| Total amount: " + "Php " + orderCount);
                    System.out.println("-----------------------------");

                    // Takes user input (money amount)
                    System.out.print("| Enter money amount: Php ");
                    double in_inp2 = inp.nextDouble();
                    System.out.println("-----------------------------");

                    // Runs if user inputs lesser amount; stops if amount is higher than needed
                    while (in_inp2 < orderCount) {
                        System.out.println("\n" + "|| Cannot process order... Your are short in money. ||" + "\n");
                        System.out.println("-----------------------------");
                        System.out.print("Enter money amount: Php ");
                        in_inp2 = inp.nextDouble(); 
                        System.out.println("-----------------------------"); 
                    }
                    
                    // Mimicks loading process (delayed code execution) -- 2 seconds
                    System.out.println("\n" +"           |||| Processing Order ||||" + "\n\n");
                    long start2 = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start2 < 2000) {
                    }
                
                    // Instances if money has change or none; will display two outcomes
                    if (in_inp2 > orderCount) {
                        double change = in_inp2 - orderCount; 
                        System.out.println("           -------------------------");
                        System.out.println("           | Your change: Php " + dec.format(change) + " |");
                        System.out.println("           -------------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }
                    if (in_inp2 == orderCount) {
                        System.out.println("               ------------------");
                        System.out.println("               | Your change: 0 |");
                        System.out.println("               ------------------" + "\n");
                        System.out.println("---------------------------------------------------");
                        System.out.println("|||| Please take your order at the tray below. ||||");
                        System.out.println("---------------------------------------------------");
                        System.out.println("       |||| Thank you and come again! ||||");
                        System.out.println("       -----------------------------------");
                        //System.out.println("===============================================");
                    }

                    // Verifies array contents
                    System.out.println("\n" + "\n" + "-------------backend-------------");
                    for (int j = 0; j < in_inp1; j++) {
                        sevenup.pop();
                    }
                    System.out.println("\n" + "Updated List (Seven-Up): " + sevenup);
                
                    // Updates array contents
                    System.out.println("\n" + "Array Size (Seven-Up): " + sevenup.size());
                    System.out.println("\n" + "-------------backend-------------");
                    System.out.println("===============================================");
                 
                }

                // Displays if no cans are available
                else {
                    System.out.println("--------------------------------------------------------");
                    System.out.println("|||| No more Seven-Up available, please choose another! ||||");
                    System.out.println("--------------------------------------------------------");
                }
            }
        }

        // Closes the Scanner class
        inp.close();

        /// USER INPUTS------------------------------------------------------------------------------------
    }
}
