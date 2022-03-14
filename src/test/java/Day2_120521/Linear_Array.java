package Day2_120521;

public class Linear_Array {
    public static void main(String[] args) {
        //Create a liner string array for cities State and zipcodes
        //declare the variable first
        String[] cities, zipcodes, State;
        //define the Linear array for cities, zipcodes and State
        cities = new String[]{"Brooklyn", "Queens", "Manhattan", "Staten Island", "Bronx"};
        zipcodes = new String[]{"11218","22222", "12345", "21541", "20202"};
        State = new String[] {"New York", "New Jersey", "North Carolina"};

        //declare int variable
        int[] streetNumber;
        //define integar array for street number
        streetNumber = new int[]{22,44,55,66,77,88};

        //print the first city and first street number

        System.out.println("My first city is " + cities[1] + " and the street number is " + streetNumber[2] + " and the State is " + State[2]);
        System.out.println("My first zipcode is " + zipcodes[0] + " and street number is " + streetNumber[0]);



    }//end of main
}//end of class
