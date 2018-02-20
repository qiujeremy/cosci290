/*
 Yan Qiu
  CoSci 290
  
  HW1 Instructions
  1. Create a class called "GameDriver" and save/name the file "GameDriver.java".
  2. The program shold start up with your text aventure splash screen (it would 
      be a good idea to use the one from Lab 1).
  3. Next, the program should have a print out of some storytelling that starts
      the text adventure.
  4. Then set up the game with questions asked from the user to start the text
      adventure (use same questions from Lab 2).
      TIP: Use Math.random and if-else to randomize elements in the game based 
        on user input. 
  5. When the game is over, end the program with a "GAME OVER" message.
  
  REMEMBER: 
  *Declare all your variables at the beginning of the program.
      
*/

//imports used in this class
import java.util.Scanner;

//Demo HW1 
public class GameDrive{

  //start of the application
  public static void main(String[] args){
    
    //variable declarations with default values
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    String nameOfStudents = "";
    String number = "";
    int randomNum = 0;
    int minimum = 1; //set min for range for random numbers
    int maximum = 10; //set max for range for random numbers
      
    //Splash Screen
    System.out.println("                 _____                _                 _      \n"
                   +   "   /\\/\\  _   _  /__   \\___  __ _  ___| |__   ___ _ __  (_)___  \n"
                   +   "  /    \\| | | |   / /\\/ _ \\/ _` |/ __| '_ \\ / _ \\ '__| | / __| \n"
                   +   " / /\\/\\ \\ |_| |  / / |  __/ (_| | (__| | | |  __/ |    | \\__ \\ \n" 
                   +   " \\/    \\/\\__, |  \\/   \\___|\\__,_|\\___|_| |_|\\___|_|    |_|___/ \n"
                   +   "       |___/                                                   \n"
                   +   "    ___                        ___ _       _          _        \n"
                   +   "   / __\\ __ ___  _ __ ___     / _ \\ |_   _| |_ ___   / \\       \n" 
                   +   "  / _\\| '__/ _ \\| '_ ` _ \\   / /_)/ | | | | __/ _ \\ /  /       \n"
                   +   " / /  | | | (_) | | | | | | / ___/| | |_| | || (_) /\\_/        \n"
                   +   " \\/   |_|  \\___/|_| |_| |_| \\/    |_|\\__,_|\\__\\___/\\/          \n");
    
    //story setup
    System.out.println("Today, we are play a math game!");
    System.out.println("The math game is compare the number!");
    System.out.println("Your should tell me a number that beteen 1 to 10.");
    System.out.println("Before we play this game, Can you tell me your name first?");
    
    nameOfStudents = input.next(); //get number of students from user and assign to numberOfStudents variable declared above
      
    System.out.println("Hello, " + nameOfStudents + " How are you?");
    System.out.println("What number you want to choose?");
    
    number = input.next(); //get hair color fro user input and assign to teacherHairColor variable declared above
    
    System.out.println("you choose " + number + " OK!! RUN!!!!");
    
    //get a random number
    randomNum = minimum + (int)(Math.random() * maximum);
    
    //randomize if a student runs with 70% probability
    if(randomNum > 3){
      System.out.println("\nA student runs out!!");
    }
    else{
      System.out.println("\nNo one is freaked out...");
    }
    
    
    //game over
    System.out.println();
    System.out.println(" _______  _______  __   __  _______    _______  __   __  _______  ______    __  \n"
                     + "|       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  | \n"
                     + "|    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  | \n"
                     + "|   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  | \n"
                     + "|   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__| \n"
                     + "|   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __  \n"
                     + "|_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__| \n"
                     + "  ___    ____                                                                   \n" 
                     + " |   |  |    |                                                                  \n" 
                     + " |___| |    _|                                                                  \n" 
                     + "  ___  |   |                                                                    \n" 
                     + " |   | |   |                                                                    \n" 
                     + " |___| |   |_                                                                   \n" 
                     + "        |____|                                                                  \n");
    
    
    
    
  
  }
}