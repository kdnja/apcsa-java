public class Annuity {
  // Returns the present value of the annuity
  public static double getPresentValue(int pmt, int i, int n) {
    return pmt * (1 - Math.pow(1 + i, -n)) / i;
  }
  // There may be instance variables, constructors, and methods not shown
  public static void main(String[] args) {
    // To be added
  }    
}
