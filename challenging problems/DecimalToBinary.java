public class DecimalToBinary {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        //String output = DecimalToBinary(500);
        binaryToDecimal(1011);
    }


    public static String DecimalToBinary(int number){
        String binary = "";
        int t = number;
        int remainder ;
        while(t > 0){
            remainder = t%2;
            t = t/2;
            binary = remainder + binary;
        }
        System.out.println("Binary representation: " + binary);
        return binary;
    }


    public static int binaryToDecimal(long num){
        int decimalNumber = 0;
        int i = 0;
        long reminder;

        while(num != 0){
            reminder = num%10;
            num/=10;
            decimalNumber += reminder * Math.pow(2,i);
            i++;
        }
        System.out.println("Decimal Representation: "+ decimalNumber);
        return decimalNumber;
    }
}

