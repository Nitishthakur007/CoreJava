package com.company;

public class Main {

    public static void main(String[] args) {
        //int count = 1;
       /* while(count != 6){
            System.out.println("The number is: "+ count);
            count++;

        }

        count=1;
        while(true){
            if(count==6){
                break;
            }
            System.out.println("The number is: "+ count);
            count++;

        }*/

       /* count=1;
        do{
            System.out.println("Count value was "+ count);
            count++;

            if(count > 100){
                break;
            }
        }while(count !=6);*/


        System.out.println("----------------------------------------------------------");

        /*for(int i=1; i!=6; i++){
            System.out.println("The number is: "+ i);
        }*/

        //System.out.println(isEvenNumber(2));


        System.out.println("----------------------------------------------------------");



       /* int number=4;
        int lastNumber= 20;
        while(number <= lastNumber){
            number++;
            if(!isEvenNumber(number)){
                System.out.println("The number is: "+ number);
                continue;
            }
            System.out.println(number + " is Even Number");
        }*/

        System.out.println("----------------------------------------------------------");


        int count = 0;
        int number=4;
        int lastNumber= 20;
        while(number <= lastNumber){
            number++;
            if(isEvenNumber(number)) {
                System.out.println(number + " is Even Number");
                count++;
                //System.out.println("Count is: "+ count);
                if(count >= 5){
                    break;
                }
            }

        }
        System.out.println("The total number of even number found : "+count);




    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }
        return  false;

    }
}
