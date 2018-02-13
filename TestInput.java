/*
yan qiu
co sci 290
Testing datatyple and input the user
13/2/2018

*/
  import java.util.Scanner;//is a Java object 
public class TestInput{

  //main method - strating point og applation
  public static void main(String[]args){
    //datatyple variableName = expression
    //1. Identtifiers can only start with a letter, _, or S
    //2, Indentifiers with multiple  words are camelCased
    //a,g - numeofStudent, name, interestRate.
    
    //prind 
    
    
    
    
    
    
    
    
    
    
   
      
      
      
      
      
    final double RI_VALUE = 3.1415;//constants are all captial. multiples worlds separated buy underscores
    
    String name = "Yan";
    int numberOfStudent = 29;
    double avgGPA = 3.78;
    boolean gameOver = false;//or ture 
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hi, give me your name: ");
    
    name = input.next();//next() is for String types
    
    System.out.println("Hi " + name);
    
    System.out.println("How old are you?");
    
    age = input.nextInt();//.nextInt() is for int types
    
    System.out.println("You are" + age + " years old!");
      
      /*
      Aritmetic Operators
      - addition
      - substraction
      - multiplication
      / division
      = assginments operator, equals
      % modulus 
      
      Programming Math operations follow the same order of operations
      (), exponents, multiplication OR division, addition OR substraction
      from left to right
      
      */
      
      int month = age * 12;
      int day = age * 365;
      int hours = day * 24;
      
     System.out.println("You are " + month + "month old OR " + day + " days old OR"
                       + hours  + " hours old!");
    
    //double for user input is  input nextDouble();
    
    String fruit = "apple";
    String otherfruit = "banana";
    
    System.out.println("Hi, can you give me your name? ");
    
    name = input.next();
    
    System.out.println("Hi " + name);
    
    System.out.println("What is your favorite fruit?");
    
    fruit = input.next();
    
    System.out.println("My favorite fruit is " + fruit);
    
    System.out.println("Becaue " + fruit + " have a lot of Vantamis.");
    
    System.out.println("What otherfruit do you like?");
    
    otherfruit = input.next();
    
    System.out.println("I also like" + otherfruit);
    
    System.out.println("Because " + otherfruit + " is good for our health.");
    
    
  
  
  }
}