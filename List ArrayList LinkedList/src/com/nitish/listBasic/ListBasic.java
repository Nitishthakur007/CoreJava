package com.nitish.listBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListBasic {

    public static void main(String[] args) {
        String[] items  = {"apples","bananas","milk","eggs"};

        List<String> list = List.of(items);
        //list.add("Yougurt");
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yougurt");
        System.out.println(groceries);

        ArrayList<String> nextList  = new ArrayList<>(
                List.of("pickles", "mustard","chesse"));

        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        // retreving from arraylist
        System.out.println("Third item: " + groceries.get(2));

        // checking if something is present in ArrayList or not
        if(groceries.contains("mustard")){
            System.out.println("Mustard is present in list");
        }
          // finding index of items
        groceries.add("yougurt");
        System.out.println("first: " + groceries.indexOf("yougurt"));
        System.out.println("Last: " + groceries.lastIndexOf("yougurt"));
        System.out.println("Element is present: " + groceries.indexOf("mango"));


        // removing form list
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yougurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples","eggs","Mango"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk","mustard","chesse"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty= " + groceries.isEmpty());

        // sorting list
        groceries.addAll(List.of("apples","milk","mustard","chesse"));
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);


        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
