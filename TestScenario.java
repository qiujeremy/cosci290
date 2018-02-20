public class TestScenario{

 public static void main(String[] args){
 
 int miniumum = 1;
 int maximum = 100;
 int randomNum = miniumum + (int)(Math.random() * maximum);
   
   
   if(randomNum >= 90){
     System.out.println("You can win 100 dolls!");
   }
   else if(randomNum <= 80 && randomNum >= 70){
     System.out.println("You can get 10 dolls.");
   }
   else{
     System.out.println("You will lost 100 dolls.");
   }
   
   
 } 
}