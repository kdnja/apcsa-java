public class Annuity {
  public double getPresentValue(int pmt, int i, int n) {
    double rate = (double) i / 100;
    double pv = pmt * (1 - Math.pow((1 + rate), -n)) / rate;
    return pv;
  }
}