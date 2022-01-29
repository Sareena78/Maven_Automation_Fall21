package Action_Items;

public class AI_1 {
    public static void main(String[] args) {
        //define and declare the string varibles
        String[] zipcodes = new String[4];
        //assign value to array by index
        zipcodes[0] = "11218";
        zipcodes[1] = "11219";
        zipcodes[2] = "11220";
        zipcodes[3] = "11201";
        int [] streetNumbers = new  int[4];
        //assign value to array by index
        streetNumbers[0] = 33;
        streetNumbers[1] = 36;
        streetNumbers[2] = 35;
        streetNumbers[3] = 37;

        // iterate through using for loop
        /*for (int i = 0; i<zipcodes.length; i++){
            System.out.println(" My zip code is " +zipcodes[i]  + " and my street number is " + streetNumbers[i]);
        }//end of for loop


         */
        //iterate through using while loop
        int i = 0;
        while (i<zipcodes.length){
            System.out.println(" my zipcode is " + zipcodes[i] + " and my street number is " + streetNumbers[i]);
            i= i+1;
        }
    }//end of main
}//end of class
