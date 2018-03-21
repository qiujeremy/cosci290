/*
Yan Qiu
CoSci 290

Topics:
 function/methods - what all the different parts are
 -access modifior
 -return type
 -function name
 -paramaters(optional)
 */
 
 public class TestFunctions{
 
 //entry point of applation  
  public static void main(String[] args){
  
    /*
    access modifiers
    public - anything can see/access
    private - only function within a class can access
    default - same thing as no written/declared modifier
    
    
    return types
    -int
    -double
    -String
    -char
    -boolean
    -void - doesn't return anything
    -differernt can return differernt object anything
    
    
    function names 
    - follow the same rules as any identifer
    - use the name of the function to call it 
    
    function paramaters
    -input that the function uses inside somewhere
     in the function body
    -separate multiple paramaters with commas
    
    
    */
    
    //testing custom function called findSum

    System.out.println("The sum of 2 and 3 is: " + findSum(2, 3));
    
    //test printHello()
    printHello("Yan");
    
  }
   // this function find the sum of two given numbers
   public static int findSum(int  num1, int num2){
     int sum = num1 + num2;
     return sum;
   }
   
   public static void printHello(String name){
     System.out.println("Hello " + name);
   }
 }