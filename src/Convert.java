import java.util.ArrayList;
import java.util.List;

public class Convert {
        public static void main(String[] args) {
            //create a List
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            //convert list to array
            Integer[] array = list.toArray(new Integer[0]);
            // print the array
            System.out.println("Array elements:");
            for(Integer num : array){
                System.out.println(num);
            }

        }
    }
