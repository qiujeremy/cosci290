public class Lab10part2{
  public static void main(String[] args){
    int k = 0;
    for(int i=100;i <= 1000;i++)
    {
      if(i%5==0&&i%6==0){
        k++;
        System.out.print(i+"\t"); 
      }
      if (k%10 == 0) {
					System.out.print("\n");
      }
    }
  }
}