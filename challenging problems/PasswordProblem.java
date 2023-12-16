public class PasswordProblem {

    public static void main(String[] args) {
        System.out.println("Reverse of input string: " + getPassword("796115110113721110141108"));

    }

    public static String getPassword(String input){

        char arr[] = input.toCharArray();
        String currChar = "";
        int i = 0;
        String password = "";
        for (i = arr.length -1; i > 0; i = i-2){
            currChar = "" + arr[i] + arr[i-1];
            int n = Integer.parseInt(currChar);
            if(n == 32){
                password = password + " ";

            }
            else if ( (n >= 65 && n <= 90) || (n >= 97 && n <= 99)) {
                password = password + Character.toString(n);
            }else{
                currChar = currChar + arr[i-2];
                 n = Integer.parseInt(currChar);
                password = password + Character.toString(n);
                i-=1;

            }
        }
        System.out.println(password);
        return password;
    }

    public static String reverseString(String input){
        String output = "";
        char currentChar;
        for (int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);
            output = currentChar + output;
        }
        return output;
    }
}
