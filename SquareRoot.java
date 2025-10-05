public class SquareRoot{
  public static int mySqrt(int x) {
      if (x == 0 || x == 1)
          return x;
  
      double tolerance = 1e-10;  //this is basically the permissible rate of error definition.
      double val = x / 2.0;  //initially, guessing the half 
      double newVal;
  
      // Babylonian method
      while (true) {
          newVal = 0.5 * (val + x / val);  //new improved guess after computation
          
          if (Math.abs(newVal - val) < tolerance) {  //if the change is small, then great!
              break;
          }
          val = newVal;  //new guess
      }
      return (int)newVal;  //returning only the integer part
  }

  //main function for calling and validating the above function
  public static void main(String[] args){
      System.out.println("The square root of 29 is: "+mySqrt(29));
  }
}
