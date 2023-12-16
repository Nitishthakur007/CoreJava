public class HCF {

    public static void main(String[] args) {
        hcfOfTwoNumber(98, 56);
    }

    public static int hcfOfTwoNumber(int num1, int num2){
        int min =  (num1 < num2) ? num1:num2;
        int hcf=0;
        for (int i = min; i >= 1; i--) {
            if(num1 % i == 0 && num2 % i == 0){
               hcf = i;
               break;
            }
        }
        System.out.println("HCF is: "+ hcf);
        return hcf;
    }
}
