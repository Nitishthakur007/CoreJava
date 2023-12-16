package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        HashMap<Integer,String> record = new HashMap<>();
        System.out.println("Enter number of records you want in hashmap");
        int n= scanner.nextInt();
        for (int i= n; i>0; i--){
            System.out.println("Enter key and value ");
            int key = scanner.nextInt();
           // System.out.println("Enter value");
            String value = scanner.nextLine();
            record.put(key,value);
            //System.out.println("Printing " + i + " Times");
        }
       // System.out.println("Enter Search Key ");
        int searchKey = scanner.nextInt();
        boolean b = record.containsKey(searchKey);
        if (b) {
                String searchValue = record.get(searchKey);
                searchValue = searchValue.replaceAll("\\s", "");
                System.out.println(searchValue);
            }else {
                System.out.println(-1);
            }
        }

    
}
