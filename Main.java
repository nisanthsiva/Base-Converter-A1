public class Main {
  public static void main(String[] args) {
    //System.out.println(binaryToDecimal(1100));
    System.out.println(decimalToBaseN(8, 6));
  }
 
  public static void converter(int N, int base1, int base2) {

  }

  public static int binaryToDecimal(int bin) {
    int sum = 0;
    String binString = String.format("%d",bin);
    int pow = 0;
    for(int i = binString.length()-1; i >= 0; i--) {
      if(binString.charAt(i) == '1') {
        sum += Math.pow(2, pow);
      }
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

