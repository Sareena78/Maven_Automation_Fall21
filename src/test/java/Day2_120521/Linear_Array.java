package Day2_120521;

public class Linear_Array {
    public static void main(String[] args) {
        //Create a liner string array for cities
        //declare the variable first
        String[] cities, zipcodes;
        //define the Linear array for cities
        cities = new String[]{"Brooklyn", "Queens", "Manhattan", "Staten Island", "Bronx"};
        zipcodes = new String[]{"11218","22222", "12345", "21541", "20202"};

        //declare int variable
        int[] streetNumber;
        //define integar array for street number
        streetNumber = new int[]{22,44,55,66,77,88};

        //print the first city and first street number
        System.out.println("My first city is " + cities[0] + " and street number is " + streetNumber[0]);



    }//end of main
}//end of class
