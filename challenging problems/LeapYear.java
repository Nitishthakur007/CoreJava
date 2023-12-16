public class LeapYear {
    public static void main(String[] args) {
        checkLeapYear(2000);
        checkLeapYear(1996);
        checkLeapYear(2002);
        checkLeapYear(2012);
        checkLeapYear(2400);
        checkLeapYear(2024);
        checkLeapYear(2027);
        checkLeapYear(2200);
        checkLeapYear(2029);
    }

    public static boolean checkLeapYear(int year){
        boolean result = false;

        // 1. century (100%=0 and 400%=0) 2000 2400
        // 2. Yearly (100%!= 0 and 4%=0) 2020 2024 2028
        if( (year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0) ){
            System.out.println("Given year is Leap year");
            result =true;
        }else{
            System.out.println("Given year is not a Leap year");
        }

        return result;
    }
}
