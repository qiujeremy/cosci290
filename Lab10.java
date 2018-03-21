/*
yan qiu
co sci 290 
lab 10 
*/
  public class Lab10{
  public static double celsiusToFahrenheit(double celsius){
  double toFahrenheit;
  toFahrenheit = (9.0 / 5) * celsius + 32;
    return toFahrenheit;
}
    public static double fahrenheitToCelsius(double fahrenheit){
      double toCelsius;
      toCelsius = (5.0 / 9) * (fahrenheit - 32);
      return toCelsius;
    }
    public static void main(String[] args){
      double q,w,e,r,t,y,u,i;
      q = celsiusToFahrenheit(40.0);
      w = celsiusToFahrenheit(39.0);
      e = celsiusToFahrenheit(32.0);
      r = celsiusToFahrenheit(31.0);
      t = fahrenheitToCelsius(120.0);
      y = fahrenheitToCelsius(110.0);
      u = fahrenheitToCelsius(40.0);
      i = fahrenheitToCelsius(30.0);
      System.out.println(
      "Celsius    Fahrenheit   |   Fahrenheit    Celsius\n"
      +"40.0     "+  q  + "       |   120.0      "+ String.format("%.2f", t)  +   "\n"
      +"39.0     "+  w   +"       |   110.0      "+ String.format("%.2f", y)  +   " \n"
      +"...                                                                       \n"
      +"32.0     "+  e    +"      |   40.0       "+ String.format("%.2f", u)  +    "\n"
      +"31.0     "+  String.format("%.2f", r)     + "         |   30.0       "+  String.format("%.2f", i)  +    "\n");
    }
  }