public class PalindromeExample {

    public static void main(String args[]){
        //palindromeNumber(121);
        palindromeString("radar");
    }


    public static void palindromeNumber(int number){
        int r;
        int sum=0;
        int temp;

        int n=number;  //It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r = n%10;     //getting remainder
            sum = (sum*10) + r;
            n = n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");

    }

    public static void palindromeString(String input){
        String reverse = "";
        String temp = input;
        for (int i = 0; i < temp.length(); i++) {
            char t = temp.charAt(i);
            reverse = t + reverse;
        }
        if(reverse==input)
            System.out.println("palindrome String ");
        else
            System.out.println("not palindrome");
    }
}
