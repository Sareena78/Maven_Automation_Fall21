package Day2_120521;

public class WhileLoopLinearArray {
    public static void main(String[] args) {

        String[] zipCodes = new String[]{"11218","11215","11213"};
        int[] houseNumber = new int[]{1405,202,2032};

        //initialized starting point befor calling while loop
        int i = 0;
        //define end point in while loop
        while (i < houseNumber.length) {
            System.out.println("my zip code is " + zipCodes[i] + " my house number is " + houseNumber[i]);
            //incrememnting
            i = i + 1;
        }//end of while loop
    }//end of main
}//end of class
