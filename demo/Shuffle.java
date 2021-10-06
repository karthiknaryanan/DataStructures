package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
           // Creating array list object       
           List arrlist = new ArrayList();
              
           // Populating the list
           arrlist.add("A");
           arrlist.add("A");
           arrlist.add("E");
           arrlist.add("I");
           arrlist.add("O");
           arrlist.add("U");

           // Rotating arrlist to 8 places
           Collections.rotate(arrlist, 8);                         // Line1
           
           // Getting the frequency of 'B'
           int frequency = Collections.frequency(arrlist, "B");    // Line2
           
           // Adding the frequency variable in arrlist
           arrlist.add(frequency);                                 // Line3
           
           // Shuffling the list
           Collections.shuffle(arrlist);                           // Line4
              
           System.out.println("Final collection after shuffle: " + arrlist);
    }
}
