/*
  Yan Qiu
  Co Sci  290

Topic 
  -multi-way if-else
  logical operators
  symbolic logical

*/
import java.util.Scanner;
public class TestLogic{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System. in);
    
    System.out.println("Enter in a grade: ");
    
    int grade = input.nextInt();
  
     
    
      if(grade >= 90){
        System.out.println("A");
      }
    
    
    if(grade < 90){
      System.out.println("grade is not an A");
    }
    else{
      System.out.println("grade is an A");
    }
    
    if(grade >= 90){
      System.out.println("A");
    }
    else if(grade >= 80){
      System.out.println("B");
    }
    else if (grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F");
    }
    
    
    /*
    //logical uperators
   
    ! = Not 
    != - Not equal to
    == - is equal to?
    && - And
    || - or
    */
    
    //using if-else. write code that checks whether
    //a student grade is good, awerage, or bad 
    if(grade >= 80){
      System.out.println("This is a good grade. ");
    }
    else if(grade < 80 && grade >= 70){
      System.out.println("This grade is awerage.");
    }
    else{
      System.out.println("This is a bad grade");
    }
  }
  
  
}