package Day2_120521;

public class WhileLoopWithArray {
    public static void main(String[] args) {
        //Create a String Dynamic array for boroughs
        String [] boroughs = new String[6];
        //define value by variables indexing
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten Island";
        boroughs[5] = "LI";
        //declare and define the initial starting point
        int i = 0;
        //define while loop with your end point (condition)
        while (i<boroughs.length){
            System.out.println("My current borough is " + boroughs[i]);
            i = i+1;
        }//end of while loop

    }//end of main
}//end of class
