public class Armstrong {

    // Armstrong number

    /*
    *  153 -> 1 5 3
    *         1*1*1 + 5*5*5 + 3*3*3
    *         1      +  125  + 27
    *          153   yes armstrong number
    * */
    public static void main(String[] args) {
        checkArmstrong(1634);
    }

    public static boolean checkArmstrong(int number){
        boolean result = false;
        int temp = number;
        int sum = 0 ;
        int remainder;

        while (temp != 0){
            remainder = temp % 10;
            temp = temp / 10;
            sum = sum + remainder * remainder * remainder ;
        }
        if(number == sum){
            result = true;
            System.out.println("Number is armstrong");
        }else{
            result = false;
            System.out.println("Number is not armstrong");
        }
        return result;
    }

    // Function to calculate order of the number
    int order(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
}
