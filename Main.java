//Ashley Grafner
//CSC 1060680 Computer Science I (java)
//9/8/2022
/* - This program contains the methods main(), displayHeader(), displayBody(), and displayFooter().
- main() calls displayHeader(), displayBody(), and displayFooter();
- displayHeader() prints the heading area.
- displayBody() reads the file Lab6Data.txt, prints the body, accumulates a total until 'quit' is read, and returns the total.*/

import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;


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

      DecimalFormat formatter = new DecimalFormat("#,###"); //LOOKED UP HOW TO USE DECIMALFORMAT

      int numberOfDots = 17 - name.length()-amountString.length(); //17=max char per line
      String pad = "."; //symbol we will use
        for (int i =2 ; i < numberOfDots; i++)
          pad = pad + "."; // adds dots until reaches 17
  
      System.out.println(name+pad+formatter.format(amount));
    }
  }

  
  public static void displayFooter()throws Exception{ //Footer method
    File file = new File("Lab6Data.txt");
    Scanner sc = new Scanner(file);

    int sum = 0; //starts at 0
    
    while (sc.hasNextLine()){
      String name = sc.next(); //last names (doesnt print)
      if (name.equals("quit")) break; //end if reads "quit" (doesnt print)
      
     String amountString = sc.next();
      int amount = Integer.parseInt(amountString);
      
      sum = sum + amount ; //finds total sum of all ints (0+first int) -> (first int + second int)  ect...
     
}
     DecimalFormat formatter = new DecimalFormat("##,###"); //LOOKED UP HOW TO USE DECIMALFORMAT
System.out.println("\nTotal......"+ formatter.format(sum));
  }
}

//Passed input/output tests

//I kept failing the tests because of my commas formatting, so I went and learned how to use the DecimalFormat class. Great experience and glad I got to learn more outside of the textbook.