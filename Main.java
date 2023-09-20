public class Main {
  public static void main(String[] args) {
    //test:
    //System.out.println(baseNToDecimal(1010, 2));
    //System.out.println(decimalToBaseN(6, 2));
  }
 
  public static void converter(int N, int base1, int base2) {

  }

  public static int baseNToDecimal(int num, int base1) {
    int sum = 0;
    String binString = String.format("%d",num);
    int pow = 0;
    for(int i = binString.length()-1; i >= 0; i--) {
      char temp = binString.charAt(i);
      sum += (temp - '0') * Math.pow(base1, pow);
      pow++;
    }
    return sum;
  }

  public static String decimalToBaseN(int num, int base2) {
    String result = "";
    String output = "";
    int remainder = 0;
    while(num > 0) {
      remainder = num % base2;
      String remainderString = String.format("%d", remainder);
      result += remainderString;
      num /= base2;
    }
    for(int i = result.length()-1; i >= 0; i--) {
      output += result.charAt(i);
    }
    return output;
  }
}