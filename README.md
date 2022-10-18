Main controller with methods

Write a program that contains the methods main(), displayHeader(), displayBody(), and displayFooter().

main() calls displayHeader(), displayBody(), and displayFooter();

displayHeader() prints the heading area.

displayBody() reads the file Lab6Data.txt, prints the body, accumulates a total until 'quit' is read, and returns the total.


Expected output:

Sales Report
Name..........Amount

Abbot.......2,685
Coswell.....1,745
Freedwick...6,283
Gibson......5,453

Total......16,166



Lab6Data.txt contains:

Abbot

2685

Coswell

1745

Freedwick

6283

Gibson

5453

quit

0








____________________________________________________________________________________

import java.io.File;
import java.util.Scanner;
import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception{ //Main method
    displayHeader(); //calls displayheader
    displayBody();//calls displayBody
    displayFooter();//calls displayFooter
  }


  public static void displayHeader() throws Exception{ //Header Method
    System.out.println("Sales Report");
    System.out.println("Name..........Amount\n"); 
  }


  
  public static void displayBody() throws Exception{ //Body method
    File file = new File("Lab6Data.txt");
    Scanner sc = new Scanner(file);
 
    while (sc.hasNextLine()){
      String name = sc.next(); //last names
      if (name.equals("quit")) break; //end if reads "quit"

      String amountString = sc.next();
      int amount = Integer.parseInt(amountString); //numbers

      System.out.println(name+"..."+amount);
    }
  }


  public static void displayFooter()throws Exception{ //Footer method
    File file = new File("Lab6Data.txt");
    Scanner sc = new Scanner(file);

    int sum = 0;
    
    while (sc.hasNextLine()){
      String name = sc.next(); //last names (doesnt print)
      if (name.equals("quit")) break; //end if reads "quit" (doesnt print)
      
     String amountString = sc.next();
      int amount = Integer.parseInt(amountString);
      
      sum = sum + amount ; //finds total sum of all ints
}
  System.out.println("\nTotal......"+sum);
  }
}