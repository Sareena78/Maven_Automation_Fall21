package Day8_122621;

import java.util.ArrayList;

public class ArrayList_Examples {
    public static void main(String[] args) {
        //Array list is a resizeable array which means you dont need to add the length to add more values
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");

        //shortcut for println is sout lower case
        System.out.println("My city is " + cities.get(2));

        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(111);
        streetNumber.add(222);
        streetNumber.add(333);

        System.out.printf("My third city is " + cities.get(2));
    }//End of main
}//End of class
