package Day3_121121;

import java.util.ArrayList;

public class LoopWithConditionalStatements {
    public static void main(String[] args) {
        //create an array with fruits and print only when fruit is apple or orange
        //You can you If Else statement or "OR" Operator thats represented by symble ||
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Strawberry");
        //Call the loop
        for (int i = 0; i < fruits.size(); i++){
            //with if conditions

            if(fruits.get(i) == "Apple"){
                System.out.println("My fruit is " + fruits.get(i));
            } else if(fruits.get(i) == "Grape"){
                System.out.println("My fruit is " + fruits.get(i));
            }

            //with or operator
            //We use EqualsIgnoreCase Command so that if we have a case typo, we dont need to worry about it.
            if(fruits.get(i).equalsIgnoreCase("Apple") || fruits.get(i) == "Grape"){
                System.out.println("My fruit is " + fruits.get(i));
            }

        }//end of for loop

    }//end of method
}//end of class
