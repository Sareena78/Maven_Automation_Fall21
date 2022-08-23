package Day2_120521;

import java.util.ArrayList;

public class forLoopArrayList {
    public static void main(String[] args) {
        //iterate through all boroughs defined by dynamic array using for loop
        ArrayList<String> boroughs = new ArrayList<>();
        //define value by variables indexing
        boroughs.add("Brooklyn");
        boroughs.add("Brooklyn");
        boroughs.add("Queens");
        boroughs.add("Long Island");
        boroughs.add("Staten Island");
        boroughs.add("LI");

        for (int i=0; i<boroughs.size();i++) {

            System.out.println("i is now " + i);
            System.out.println("My borough is " + boroughs.get(0) + " and is " + boroughs.get(3));

        }//end of for loop

    }//end of main
}
