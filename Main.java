public class Main {
  public static void main(String[] args) {
    //binaryToDecimal(1100);
    //System.out.println(50 - 16);
    decimalToBinary(17);
  }

  public static void converter(int N, int base1, int base2) {

  }

  public static int sum = 0;
  public static void binaryToDecimal(int bin) {
    String binString = String.format("%d",bin);
    int pow = 0;
    for(int i = binString.length()-1; i >= 0; i--) {
      //System.out.println(binString.charAt(i));
      if(binString.charAt(i) == '1') {
        sum += Math.pow(2, pow);
      } else;
      pow++;
    }
    System.out.println(sum);
  }

  public static void decimalToBinary(int dec) {
  String output = "";
  int pow = 0;
  while(Math.pow(2, pow) < dec) {
    pow++;
  }
  while(pow > 0) {
    if(dec-Math.pow(2, pow) < 0) {
      pow--;
      output += '0';
    } else {
      dec -= Math.pow(2, pow);
      output += '1';
    }
  }
  System.out.println(output);
  }
}