package Day3_121121;

public class Multiple_Conditions {
    public static void main(String[] args) {
        //define the set of variables
        int a = 1;
        int b = 2;
        int c = 3;

        //verify a+b > c, a+b < c or a+b == c
        if(a+b >c){
            System.out.println("a and b is greater than c");
        } else if (a+b < c){
            System.out.println("a and b is less than c");
        } else {
            System.out.println("a and b is equal to c");
        }
    }//end off main
}//end of class
