package Day4_121221;

public class Split_Command {
    public static void main(String[] args) {

        ///define/create a single string
        String statement = "My name is Shah";

        //declare String array to split the message to print out only John
        String[] SplitThisStatement = statement.split("");

        //print out john
        System.out.println("result is " + SplitThisStatement[3]);

    }//end of main
}//end of class
