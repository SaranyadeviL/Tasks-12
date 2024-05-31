import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        //create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();


    // Add elements to the arraylist
        stringList.add("red");
        stringList.add("yellow");
        stringList.add("orange");
        stringList.add("purple");
        stringList.add("black");

    //display the arraylist before removing elements
        System.out.println("ArrayList before removing elements :"+stringList);

    //remove all elements from the Arraylist
        stringList.clear();

    // display the Arraylist after removing elements
        System.out.println("ArrayList after removing elements :"+stringList);

}
}
