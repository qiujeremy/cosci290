public class DemoBoolean{
public static void main(String[] args){
  
  //line 17 and line 18 are equivalent
  int num = 1;
  num = num + 1;
  num++;
  ++num;
  
  num = 1;
  int count = ++num;
  System.out.println("count " + count + " num" + num);
  num = 1;
  count = num++;
  System.out.println("count " + count + " num" + num);
  
  count = num--;
  count = --num;
  
  
  num += 2;
  num -= 2;
  
  num = 2;
  double num2 = 3.0;
  System.out.println("Double wins: " + num * num2);
  System.out.println("Casting a double to int: " + (int) num2);
  System.out.println("Casting an int to a double " + (double) num);
  System.out.println("Casting a clear to an int " + (int) 'c');
  
  int numberOfZombies = 3;
  int actualNameOfZombies = 100;
  
  if(numberOfZombies == actualNameOfZombies){
    System.out.println("You might survive this apocalypse.");
    System.out.println("oh no!");
  }
  //Basic if-else
  else{
    System.out.println("You might NOT survive this apocalypse.");
  }
  
  //Generating a random nummber
  //Math pow(3, 2); 3^2
  System.out.println (Math.random());
  
  // minimun + Math.random() * maxium
  System.out.println(1 + (int)(Math.random() * (10 - 5)));
  
  int chanceOfSurviving = 1 + (int)(Math.random() * (10 - 5));
  
 if(chanceOfSurviving <= 3){
   System.out.println("You made it alive!");
 }
  else{
    System.out.println("Game over!");
  
  }
 }
    

}
