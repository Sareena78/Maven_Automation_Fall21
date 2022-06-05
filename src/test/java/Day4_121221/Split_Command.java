package Day4_121221;

public class Split_Command {
    public static void main(String[] args) {

        ///define/declare a string variable
        String splitMessage = "My name is Shah";

        //declare String array to store the split message
        String[] SplitMessageArray = splitMessage.split(" ");

        //print out john
        System.out.println("My first name is  " + SplitMessageArray[3]);

    }//end of main
}//end of class
