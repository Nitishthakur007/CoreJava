import java.util.Arrays;
import java.util.ArrayList;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name, "DAIRY",1);
    }


    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}




public class ArrayListBasic {
    public static void main(String[] args) {

        /*    ARRAY   */
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apple","PRODUCE", 6);
        groceryArray[2] = new GroceryItem("Oranges","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));



        /*    ARRAYLIST   */
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yougurt");
        System.out.println(objectList);

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("Oranges", "PRODUCED", 5));
        groceryList.add(0, new GroceryItem("Apple", "PRODUCED", 6));
        System.out.println(groceryList);
        groceryList.set(0, new GroceryItem("Mango", "PRODUCED", 10));
        System.out.println(groceryList);
        groceryList.remove(2);
        System.out.println(groceryList);

    }
}
