//author: Sara Russert
//date: 20 February 2024
//file: Fraction.java

public class Fraction {
   // private fields for numerator and denominator
   private int num;
   private int denom;
   
   // constructor
   public Fraction(int n, int d) {
      // set attributes to given integer values
      num = n;
      setDenom(d);
   
   }
   
   public void setNum(int n) {
      num = n;
   }
   
   public void setDenom(int d) {
      // don't allow the denom to be set to zero
      if (d != 0)
         denom = d;
      else {
         // inform user that zero is not permitted and set denom to 1
         System.out.println("For Fraction: " + this.toString() + ":");
         System.out.println("Denominator cannot be zero; denominator value is being reset to one.");
         denom = 1;
         System.out.println("The Fraction is now: " + this.toString());
      }
   }
   
   public int getNum() {
      return num;
   }
   
   public int getDenom() {
      return denom;
   }
   
   // multiplies this fraction against a second
   // takes a fraction argument
   // returns new fraction
   public Fraction multiply(Fraction f2) {
      // declar vars for new fraction values
      int newNum, newDenom;
      
      // get the new num by multipling the two nums
      newNum = this.getNum() * f2.getNum();
      
      // same for denominator
      newDenom = this.getDenom() * f2.getDenom();
      
      // instantiate new fraction with new values
      return new Fraction(newNum, newDenom);
   }
   
   // returns fraction in string format
   public String toString() {
      // var for new string
      String strFraction;
      
      if (denom == 1)
         strFraction = "( " + num + " )";
      else
         strFraction = "( " + num + " / " + denom + " )";
      
      return strFraction;
   }
}