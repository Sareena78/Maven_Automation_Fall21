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

        //declare additional variables
        int d = 3;
        int e = 4;
        int f = 8;
        //or operator with if statement
        // || or operator, one of the condition has to be true
        // && and operator, both conditions have to be true
        if (d+e > f || d+e < f){
            System.out.println("the statement is true ");
        }else {
            System.out.println(" The statement is false");
        }
    }//end off main
}//end of class
