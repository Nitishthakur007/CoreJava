package com.nitish.listBasic;

import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListBasic {

    public static void main(String[] args) {
        //LinkedList<String> placesToVisit  = new LinkedList<>();
         var placesToVisit = new LinkedList<String >();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        //removePlaces(placesToVisit);

       // gettingElements(placesToVisit);
        System.out.println(placesToVisit);
       // printItinarry(placesToVisit);
       // printItinarry2(placesToVisit);
      //  printItinerary3(placesToVisit);
        testIterator(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue Methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Tasmania");

        // Stack methods
        list.push("Alice spring");
    }


    private static void removePlaces(LinkedList<String> list){

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();     // remove first element
        System.out.println(s1 + " Was removed from list");


        String s2 = list.removeFirst();     // remove first element
        System.out.println(s2 + " Was removed from list");


        String s3 = list.removeLast();    // remove last element
        System.out.println(s3 + " Was removed from list");


        // Queue/Deque poll methods

        System.out.println(list);
        String p1 = list.poll();  // remove first element
        System.out.println(p1 + " Was removed from list");

        String p2 = list.pollFirst();  // remove first element
        System.out.println(p2 + " Was removed from list");

        String p3 = list.pollLast();  // remove Last element
        System.out.println(p3 + " Was removed from list");


        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        System.out.println("*************** " + list + " **********");

        String p4 = list.pop();  // remove first element
        System.out.println(p4 + " Was removed from list");
        System.out.println(list);
    }


    private static void gettingElements(LinkedList<String> list){


        System.out.println("Retrived Element : " + list.get(4));

        System.out.println("First Element : " + list.getFirst());

        System.out.println("Last Element : " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("Element from element() : " + list.element());

        // Stack retrieval method

        System.out.println("Element from peek() : " + list.element());
        System.out.println("Element from peekFirst() : " + list.peekFirst());
        System.out.println("Element from peekLast() : " + list.peekLast());

    }

    public static void printItinarry(LinkedList<String> list){

        System.out.println("Trip start at : " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println(" --> From: " + list.get(i -1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }


    public static void printItinarry2(LinkedList<String> list){

        System.out.println("Trip start at : " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println(" --> Form: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }



    public static void printItinerary3(LinkedList<String> list){

        System.out.println("Trip start at : " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println(" --> Form: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()){
            //System.out.println(iterator.next());
           if(iterator.next().equals("Brisbane")){
                iterator.add("Queens land");
            }
        }

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }

}
