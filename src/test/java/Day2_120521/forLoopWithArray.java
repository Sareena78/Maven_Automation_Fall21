package Day2_120521;

import java.sql.SQLOutput;

public class forLoopWithArray {
    public static void main(String[] args) {

        //iterate through all boroughs defined by dynamic array using for loop
        String [] boroughs = new String[6];
        //define value by variables indexing
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten Island";
        boroughs[5] = "LI";

        /*for (int i=0; i < boroughs.length; i++){
            //print statement
            System.out.println("My current borough is " +boroughs[i]);

        }//end of loop

         */
        //if you want to print those cities backwards this is how you would go by.
        for (int i=0; i < boroughs.length-1; i--){
            System.out.println("My current borough is " +boroughs);
        }//end of loop

    }//end of main
}//end of class
