public class Main {
  public static void main(String[] args) {
    //test:
    //System.out.println(baseNToDecimal(1010, 2));
    //System.out.println(decimalToBase(6, 2));

    //System.out.println('A' - 55);
    //System.out.println('A' - '0');
    //System.out.println(baseNToDecimal("ZZ", 36));

    //System.out.println(decimalToBaseN(baseNToDecimal(1100, 2), 2));
    System.out.println(decimalToHexadecimal(22, 16));
    //System.out.println(decimalToBaseN(4, 4));
    
    //int testInt = 10;
    //char testChar = (char)(testInt + 55);
    //System.out.println(testChar);
  }

  public static void converter(int N, int base1, int base2) {

  }

  public static int baseNToDecimal(int num, int base1) {
    int sum = 0;
    String binString = String.format("%d", num);
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

  public static int baseNToDecimal(String num, int base1) {
    int sum = 0;
    int pow = 0;
    for(int i = num.length()-1; i >= 0; i--) {
      char temp = num.charAt(i);
      if(temp - 55 < 0) {
        sum += (temp = '0') * Math.pow(base1, pow);
      }
      else {
        sum += (temp - 55) * Math.pow(base1, pow);
      }
      pow++;
    }
    return sum;
  }
  public static String decimalToHexadecimal(int num, int base2) {
    String temp = String.format("%d", num); // --> "10"
    String output = "";
    int[] remainder = new int[temp.length()]; // --> 2 --> {0, 1}
    int index = remainder.length-1; // --> 1
    //System.out.println(remainder.length-1);
    while(num > 0) {
      remainder[index] = num % base2; // 1,  
      //String remainderString = String.format("%d", remainder);
      //result += remainderString;
      num /= base2; 
      index--;
    }

    for(int i = 0; i < remainder.length; i++) {
      if(remainder[i] > 9) {
        char tempChar = (char)(remainder[i] + 55);
        output += tempChar;
      }
      else {
        output += remainder[i];
      }

      //System.out.println(remainder[i]);
    }
    /*
    for(int i = result.length()-1; i >= 0; i--) {
      output += result.charAt(i);
    } */
    return output; 
  }
}