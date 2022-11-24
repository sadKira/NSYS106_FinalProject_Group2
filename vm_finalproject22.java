package Projects;

// Soda Vending Maching - Group 2 Noblefranca, Alegado, & Rabe

// Importing necessary packages
import java.util.*;
import java.text.DecimalFormat;


public class vm_finalproject22 {

    private static final DecimalFormat dec = new DecimalFormat("0.00");
    public static void main(String[] args) {
        

        /// STORAGE----------------------------------------------------------------------------------------
       
        // Each creates a stacklist per drink
        Stack<String> cocacola = new Stack<>();
        cocacola.push("can32");
        cocacola.push("can33");
        cocacola.push("can31");
        cocacola.push("can30");
        cocacola.push("can29");
        cocacola.push("can28");
        cocacola.push("can27");
        cocacola.push("can26");
        cocacola.push("can25");
        cocacola.push("can24");
        cocacola.push("can23");
        cocacola.push("can22");
        cocacola.push("can21");
        cocacola.push("can20");
        cocacola.push("can19");
        cocacola.push("can18");
        cocacola.push("can17");
        cocacola.push("can16");
        cocacola.push("can15");
        cocacola.push("can14");
        cocacola.push("can13");
        cocacola.push("can12");
        cocacola.push("can11");
        cocacola.push("can10");
        cocacola.push("can9");
        cocacola.push("can8");
        cocacola.push("can7");
        cocacola.push("can6");
        cocacola.push("can5");
        cocacola.push("can4");
        cocacola.push("can3");
        cocacola.push("can2");
        cocacola.push("can1");


        Stack<String> cocacolazero = new Stack<>();
        cocacolazero.push("can32");
        cocacolazero.push("can33");
        cocacolazero.push("can31");
        cocacolazero.push("can30");
        cocacolazero.push("can29");
        cocacolazero.push("can28");
        cocacolazero.push("can27");
        cocacolazero.push("can26");
        cocacolazero.push("can25");
        cocacolazero.push("can24");
        cocacolazero.push("can23");
        cocacolazero.push("can22");
        cocacolazero.push("can21");
        cocacolazero.push("can20");
        cocacolazero.push("can19");
        cocacolazero.push("can18");
        cocacolazero.push("can17");
        cocacolazero.push("can16");
        cocacolazero.push("can15");
        cocacolazero.push("can14");
        cocacolazero.push("can13");
        cocacolazero.push("can12");
        cocacolazero.push("can11");
        cocacolazero.push("can10");
        cocacolazero.push("can9");
        cocacolazero.push("can8");
        cocacolazero.push("can7");
        cocacolazero.push("can6");
        cocacolazero.push("can5");
        cocacolazero.push("can4");
        cocacolazero.push("can3");
        cocacolazero.push("can2");
        cocacolazero.push("can1");


        Stack<String> sprite = new Stack<>();
        sprite.push("can32");
        sprite.push("can33");
        sprite.push("can31");
        sprite.push("can30");
        sprite.push("can29");
        sprite.push("can28");
        sprite.push("can27");
        sprite.push("can26");
        sprite.push("can25");
        sprite.push("can24");
        sprite.push("can23");
        sprite.push("can22");
        sprite.push("can21");
        sprite.push("can20");
        sprite.push("can19");
        sprite.push("can18");
        sprite.push("can17");
        sprite.push("can16");
        sprite.push("can15");
        sprite.push("can14");
        sprite.push("can13");
        sprite.push("can12");
        sprite.push("can11");
        sprite.push("can10");
        sprite.push("can9");
        sprite.push("can8");
        sprite.push("can7");
        sprite.push("can6");
        sprite.push("can5");
        sprite.push("can4");
        sprite.push("can3");
        sprite.push("can2");
        sprite.push("can1");


        Stack<String> royal = new Stack<>();
        royal.push("can32");
        royal.push("can33");
        royal.push("can31");
        royal.push("can30");
        royal.push("can29");
        royal.push("can28");
        royal.push("can27");
        royal.push("can26");
        royal.push("can25");
        royal.push("can24");
        royal.push("can23");
        royal.push("can22");
        royal.push("can21");
        royal.push("can20");
        royal.push("can19");
        royal.push("can18");
        royal.push("can17");
        royal.push("can16");
        royal.push("can15");
        royal.push("can14");
        royal.push("can13");
        royal.push("can12");
        royal.push("can11");
        royal.push("can10");
        royal.push("can9");
        royal.push("can8");
        royal.push("can7");
        royal.push("can6");
        royal.push("can5");
        royal.push("can4");
        royal.push("can3");
        royal.push("can2");
        royal.push("can1");


        Stack<String> sevenup = new Stack<>();
        sevenup.push("can32");
        sevenup.push("can33");
        sevenup.push("can31");
        sevenup.push("can30");
        sevenup.push("can29");
        sevenup.push("can28");
        sevenup.push("can27");
        sevenup.push("can26");
        sevenup.push("can25");
        sevenup.push("can24");
        sevenup.push("can23");
        sevenup.push("can22");
        sevenup.push("can21");
        sevenup.push("can20");
        sevenup.push("can19");
        sevenup.push("can18");
        sevenup.push("can17");
        sevenup.push("can16");
        sevenup.push("can15");
        sevenup.push("can14");
        sevenup.push("can13");
        sevenup.push("can12");
        sevenup.push("can11");
        sevenup.push("can10");
        sevenup.push("can9");
        sevenup.push("can8");
        sevenup.push("can7");
        sevenup.push("can6");
        sevenup.push("can5");
        sevenup.push("can4");
        sevenup.push("can3");
        sevenup.push("can2");
        sevenup.push("can1");

        /// STORAGE----------------------------------------------------------------------------------------



        /// USER INPUTS------------------------------------------------------------------------------------

        // Initializing the Scanner class
        Scanner inp = new Scanner(System.in);
        // Creating object for menu details
        menu mn = new menu();

        // Displaying Menu
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

            // Taking user inputs
            System.out.print("| Number of Orders: ");
            int in_inp1 = inp.nextInt();
            System.out.println("-----------------------------");
           
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
                System.out.println("Cannot process order... Your are short in money.");
                System.out.print("Enter money amount: Php ");
                in_inp2 = inp.nextDouble(); 
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
            }
            if (in_inp2 == orderCount) {
                System.out.println("               ------------------");
                System.out.println("               | Your change: 0 |");
                System.out.println("               ------------------" + "\n");
                System.out.println("---------------------------------------------------");
                System.out.println("|||| Please take your order at the tray below. ||||");
                System.out.println("---------------------------------------------------");
                System.out.println("       |||| Thank you and come again! ||||");
                System.out.println("       ----------------------------------=");
            }

            // Verifies array contents
            /*System.out.println("\n" + "\n" + "-------------backend-------------");
            if (inp1 == 1) {
                cocacola.pop();
                System.out.println("\n" + "Updated List (Coke): " + cocacola);
            }
            else if (inp1 == 2) {
                cocacolazero.pop();
                System.out.println("\n" + "Updated List (Coke Zero): " + cocacolazero);
            }
            else if (inp1 == 3) {
                sprite.pop();
                System.out.println("\n" + "Updated List (Sprite): " + sprite);
            }
            else if (inp1 == 4) {
                royal.pop();
                System.out.println("\n" + "Updated List (Royal): " + royal);
            }
            else {
                sevenup.pop();
                System.out.println("\n" + "Updated List (Seven-Up): " + sevenup);
            }

            // Updates array contents
            System.out.println("\n" + "Array Size (Coke): " + cocacola.size());
            System.out.println("Array Size (Coke Zero): " + cocacolazero.size());
            System.out.println("Array Size (Sprite): " + sprite.size());
            System.out.println("Array Size (Royal): " + royal.size());
            System.out.println("Array Size (Seven-Up): " + sevenup.size());
            System.out.println("\n" + "-------------backend-------------");
            */
        }

        // (2nd) Second Instance, if user chooses Coke Zero
        if (inp1 == 2) {

            // Taking user inputs
            System.out.print("| Number of Orders: ");
            int in_inp1 = inp.nextInt();
            System.out.println("-----------------------------");
           
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
                System.out.println("Cannot process order... Your are short in money.");
                System.out.print("Enter money amount: Php ");
                in_inp2 = inp.nextDouble(); 
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
            }
            if (in_inp2 == orderCount) {
                System.out.println("               ------------------");
                System.out.println("               | Your change: 0 |");
                System.out.println("               ------------------" + "\n");
                System.out.println("---------------------------------------------------");
                System.out.println("|||| Please take your order at the tray below. ||||");
                System.out.println("---------------------------------------------------");
                System.out.println("       |||| Thank you and come again! ||||");
                System.out.println("       ----------------------------------=");
            }

            // Verifies array contents
            /*System.out.println("\n" + "\n" + "-------------backend-------------");
            if (inp1 == 1) {
                cocacola.pop();
                System.out.println("\n" + "Updated List (Coke): " + cocacola);
            }
            else if (inp1 == 2) {
                cocacolazero.pop();
                System.out.println("\n" + "Updated List (Coke Zero): " + cocacolazero);
            }
            else if (inp1 == 3) {
                sprite.pop();
                System.out.println("\n" + "Updated List (Sprite): " + sprite);
            }
            else if (inp1 == 4) {
                royal.pop();
                System.out.println("\n" + "Updated List (Royal): " + royal);
            }
            else {
                sevenup.pop();
                System.out.println("\n" + "Updated List (Seven-Up): " + sevenup);
            }

            // Updates array contents
            System.out.println("\n" + "Array Size (Coke): " + cocacola.size());
            System.out.println("Array Size (Coke Zero): " + cocacolazero.size());
            System.out.println("Array Size (Sprite): " + sprite.size());
            System.out.println("Array Size (Royal): " + royal.size());
            System.out.println("Array Size (Seven-Up): " + sevenup.size());
            System.out.println("\n" + "-------------backend-------------");
            */
        }
    
        // (3rd) Third Instance, if user chooses Sprite
        if (inp1 == 3) {

            // Taking user inputs
            System.out.print("| Number of Orders: ");
            int in_inp1 = inp.nextInt();
            System.out.println("-----------------------------");
           
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
                System.out.println("Cannot process order... Your are short in money.");
                System.out.print("Enter money amount: Php ");
                in_inp2 = inp.nextDouble(); 
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
            }
            if (in_inp2 == orderCount) {
                System.out.println("               ------------------");
                System.out.println("               | Your change: 0 |");
                System.out.println("               ------------------" + "\n");
                System.out.println("---------------------------------------------------");
                System.out.println("|||| Please take your order at the tray below. ||||");
                System.out.println("---------------------------------------------------");
                System.out.println("       |||| Thank you and come again! ||||");
                System.out.println("       ----------------------------------=");
            }

            // Verifies array contents
            /*System.out.println("\n" + "\n" + "-------------backend-------------");
            if (inp1 == 1) {
                cocacola.pop();
                System.out.println("\n" + "Updated List (Coke): " + cocacola);
            }
            else if (inp1 == 2) {
                cocacolazero.pop();
                System.out.println("\n" + "Updated List (Coke Zero): " + cocacolazero);
            }
            else if (inp1 == 3) {
                sprite.pop();
                System.out.println("\n" + "Updated List (Sprite): " + sprite);
            }
            else if (inp1 == 4) {
                royal.pop();
                System.out.println("\n" + "Updated List (Royal): " + royal);
            }
            else {
                sevenup.pop();
                System.out.println("\n" + "Updated List (Seven-Up): " + sevenup);
            }

            // Updates array contents
            System.out.println("\n" + "Array Size (Coke): " + cocacola.size());
            System.out.println("Array Size (Coke Zero): " + cocacolazero.size());
            System.out.println("Array Size (Sprite): " + sprite.size());
            System.out.println("Array Size (Royal): " + royal.size());
            System.out.println("Array Size (Seven-Up): " + sevenup.size());
            System.out.println("\n" + "-------------backend-------------");
            */
        }

        // (4th) Fourth Instance, if user chooses Royal
        if (inp1 == 4) {

            // Taking user inputs
            System.out.print("| Number of Orders: ");
            int in_inp1 = inp.nextInt();
            System.out.println("-----------------------------");
           
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
                System.out.println("Cannot process order... Your are short in money.");
                System.out.print("Enter money amount: Php ");
                in_inp2 = inp.nextDouble(); 
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
            }
            if (in_inp2 == orderCount) {
                System.out.println("               ------------------");
                System.out.println("               | Your change: 0 |");
                System.out.println("               ------------------" + "\n");
                System.out.println("---------------------------------------------------");
                System.out.println("|||| Please take your order at the tray below. ||||");
                System.out.println("---------------------------------------------------");
                System.out.println("       |||| Thank you and come again! ||||");
                System.out.println("       ----------------------------------=");
            }

            // Verifies array contents
            /*System.out.println("\n" + "\n" + "-------------backend-------------");
            if (inp1 == 1) {
                cocacola.pop();
                System.out.println("\n" + "Updated List (Coke): " + cocacola);
            }
            else if (inp1 == 2) {
                cocacolazero.pop();
                System.out.println("\n" + "Updated List (Coke Zero): " + cocacolazero);
            }
            else if (inp1 == 3) {
                sprite.pop();
                System.out.println("\n" + "Updated List (Sprite): " + sprite);
            }
            else if (inp1 == 4) {
                royal.pop();
                System.out.println("\n" + "Updated List (Royal): " + royal);
            }
            else {
                sevenup.pop();
                System.out.println("\n" + "Updated List (Seven-Up): " + sevenup);
            }

            // Updates array contents
            System.out.println("\n" + "Array Size (Coke): " + cocacola.size());
            System.out.println("Array Size (Coke Zero): " + cocacolazero.size());
            System.out.println("Array Size (Sprite): " + sprite.size());
            System.out.println("Array Size (Royal): " + royal.size());
            System.out.println("Array Size (Seven-Up): " + sevenup.size());
            System.out.println("\n" + "-------------backend-------------");
            */
        }

        // (5th) Fifth Instance, if user chooses Seven-Up
        if (inp1 == 5) {

            // Taking user inputs
            System.out.print("| Number of Orders: ");
            int in_inp1 = inp.nextInt();
            System.out.println("-----------------------------");
           
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
                System.out.println("Cannot process order... Your are short in money.");
                System.out.print("Enter money amount: Php ");
                in_inp2 = inp.nextDouble(); 
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
            }
            if (in_inp2 == orderCount) {
                System.out.println("               ------------------");
                System.out.println("               | Your change: 0 |");
                System.out.println("               ------------------" + "\n");
                System.out.println("---------------------------------------------------");
                System.out.println("|||| Please take your order at the tray below. ||||");
                System.out.println("---------------------------------------------------");
                System.out.println("       |||| Thank you and come again! ||||");
                System.out.println("       ----------------------------------=");
            }

            // Verifies array contents
            /*System.out.println("\n" + "\n" + "-------------backend-------------");
            if (inp1 == 1) {
                cocacola.pop();
                System.out.println("\n" + "Updated List (Coke): " + cocacola);
            }
            else if (inp1 == 2) {
                cocacolazero.pop();
                System.out.println("\n" + "Updated List (Coke Zero): " + cocacolazero);
            }
            else if (inp1 == 3) {
                sprite.pop();
                System.out.println("\n" + "Updated List (Sprite): " + sprite);
            }
            else if (inp1 == 4) {
                royal.pop();
                System.out.println("\n" + "Updated List (Royal): " + royal);
            }
            else {
                sevenup.pop();
                System.out.println("\n" + "Updated List (Seven-Up): " + sevenup);
            }

            // Updates array contents
            System.out.println("\n" + "Array Size (Coke): " + cocacola.size());
            System.out.println("Array Size (Coke Zero): " + cocacolazero.size());
            System.out.println("Array Size (Sprite): " + sprite.size());
            System.out.println("Array Size (Royal): " + royal.size());
            System.out.println("Array Size (Seven-Up): " + sevenup.size());
            System.out.println("\n" + "-------------backend-------------");
            */
        }
    
        // Closes the Scanner class
        inp.close();
        /// USER INPUTS------------------------------------------------------------------------------------
    }
}
