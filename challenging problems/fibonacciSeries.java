public class fibonacciSeries {

    public static void main(String[] args) {
       fibonacciSeries(500);
       int output = nthFibonacciNumber(13);
        System.out.println(output);
    }

    public static String fibonacciSeries(int num){

        int k = 0;
        int a = 0;
        int b = 1;
        String outputSeries = "0 1";
        //System.out.print("0 1 ");
        while (k <= num){
            k = a + b;
           // System.out.print(k + " ");
            outputSeries = outputSeries + " " + k;
            a= b;
            b = k;
        }
        System.out.println(outputSeries);
        return outputSeries;
    }


    // Nth fibonacci number
    public static int nthFibonacciNumber(int n){
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Number is: " + b);
        return b;
    }
}
