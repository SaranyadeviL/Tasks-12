import java.util.TreeMap;

public class MapTree {
        public static void main(String[] args) {

            //create a treemap to store all emp ids and names
            TreeMap<Integer,String> empMap = new TreeMap<>();

            // add emp ids and names to Treemap
            empMap.put(1, "John");
            empMap.put(2, "Arun");
            empMap.put(3, "Bala");
            empMap.put(4, "Diana");

            //print the names of all the employees in alphabetical order
            for(String name : empMap.values()) {
                System.out.println(name);
            }

        }
    }

