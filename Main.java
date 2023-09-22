import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What Number Do You Want To Convert?");
    int number = scan.nextInt();
    System.out.println("Which Base Do You Want To Convert From?");
    int startingBase = scan.nextInt();
    System.out.println("Which Base Do You Want To Convert To?");
    int endingBase = scan.nextInt();
    System.out.println(converter(number, startingBase, endingBase));
    scan.close();
  }

  public static String converter(int N, int base1, int base2) {
    return decimalToHexadecimal(hexaToDecimal(N, base1), base2);
  }
  
  public static int hexaToDecimal(int N, int base1) {
    String num = String.format("%d", N);
    int sum = 0;
    int pow = 0;
    for(int i = num.length()-1; i >= 0; i--) {
      char temp = num.charAt(i);
      if(temp - 55 < 0) {
        //sum += (temp = '0') * Math.pow(base1, pow);
        sum += (temp - '0') * Math.pow(base1, pow);
      }
      else {
        sum += (temp - 55) * Math.pow(base1, pow);
      }
      pow++;
    }
    return sum;
  }
  public static String decimalToHexadecimal(int num, int base2) {
    String output = "";
    int power = 0;

    while(Math.pow(base2, power) <= num) {
      power++;
    }

    int[] remainder = new int[power]; 
    int index = remainder.length-1; 

    while(num > 0) {
      if(num == 1) {
        remainder[index] = 1;
        break;
      }
      remainder[index] = num % base2; 
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
    }
    return output; 
  }
}