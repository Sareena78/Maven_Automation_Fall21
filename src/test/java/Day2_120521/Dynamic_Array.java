package Day2_120521;

public class Dynamic_Array {
    public static void main(String[] args) {
        //Create a String Dynamic array for Countries
        String[] countries = new String[6];//you set the array length to 6 or whatever
        //define value by variables indexing
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "India";
        countries[4] = "Pakistan";

        System.out.println("My country is" + countries[5]);

        //Create an Integer dynamic array
        int[] houseNumber = new int[4];
        //define the value by variable index
        houseNumber[0] = 200;
        houseNumber[1] = 400;
        houseNumber[2] = 600;
        houseNumber[3] = 800;
        System.out.println("My house number is " +houseNumber[2]);


    }//end of main
}//end of class
