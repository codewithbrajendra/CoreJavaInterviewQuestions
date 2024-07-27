package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfIntegers_17 {

    public static void main(String[] args) {
        List<Integer> myList4 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        //1st Way
        //myList4.stream().sorted().forEach(l -> System.out.print(" "+l)); //Ascending Order

        //2nd Way
       // Comparator<Integer> comp1 = (a,b) -> a.compareTo(b); //Ascending Order
        Comparator<Integer> comp1 = (a,b) -> a - b; //Ascending Order
        myList4.sort(comp1);
       // System.out.print(myList4);

        //3rd Way
        Collections.sort(myList4);//Ascending Order
        //System.out.println(myList4);

        //4th Way
        Comparator<Integer> com1 = (a1, a2) -> -a1.compareTo(a2); //Descending order
        Collections.sort(myList4, com1);
      //  System.out.println(myList4);

        //5th Way Ascending Order
        Comparator<Integer> com2 = (a1, a2) -> {
            if (a1 < a2)
                return -1;
            else if (a1 > a2)
                return +1;
            else
                return 0;
        };

        Collections.sort(myList4, com2);
        //System.out.println(myList4);

        //6th Way Descending order
        Comparator<Integer> com3 = (a1, a2) -> {
            if (a1 < a2)
                return +1;
            else if (a1 > a2)
                return -1;
            else
                return 0;
        };

        Collections.sort(myList4, com3);
        System.out.println(myList4);
    }
}
