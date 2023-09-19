public class Main {
  public static void main(String[] args) {
    //System.out.println(binaryToDecimal(1100));
    //System.out.println(decimalToBinary(12));
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

  public static String decimalToBinary(int num) {
    String result = "";
    String output = "";
    int remainder = 0;
    while(num > 0) {
      remainder = num % 2;
      if(remainder == 0) {
        result += '0';
      }
      else if(remainder == 1) {
        result += '1';
      }
      num /= 2;
    }
    for(int i = result.length()-1; i >= 0; i--) {
      output += result.charAt(i);
    }
    return output;
  }
}

