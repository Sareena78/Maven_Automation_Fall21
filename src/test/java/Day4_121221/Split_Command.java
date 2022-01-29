package Day4_121221;

public class Split_Command {
    public static void main(String[] args) {

        //create a single string
        String statement = "My name is John";
        //declare String array to split the message to print out only John
        String[] arrayMessage = statement.split(" ");

        //print out john
        System.out.println("result is " + arrayMessage[3]);

    }//end of main
}//end of class
