package Action_Items;

public class AI_2_Prt2 {
    public static void main(String[] args) {
        //Create a Dynamic Array using for loop and print only when the city is Brooklyn or Manhattan
        //Declare array and assign a value
        String[] cities =new String[4];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Staten Island";
        //Use for lopp to print Brooklyn and manhattan
       for (int i=0; i<cities.length; i++){
           if (cities[i]==("Brooklyn")){
               System.out.println("City is " +cities[i]);
           }else if (cities[i] == "Manhattan"){
               System.out.println("City is "+cities[i]);
           }//end of loop

        }
    }//end of main
}//end of class
