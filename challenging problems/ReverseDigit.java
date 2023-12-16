public class ReverseDigit {
    public static void main(String[] args) {
        reverseNumber(4562);
        reverseNumber(2355);
        reverseNumber(1284);
        reverseNumber(961023579);
    }

    public static String reverseNumber(int number){
      String output = "";
      int remainder ;
      int temp = number;

      while(temp != 0){
          remainder = temp % 10;
          temp = temp /10;
          output = output + remainder;
      }
        System.out.println(" Reverse number is : " + output);
        return output ;
    }
}
