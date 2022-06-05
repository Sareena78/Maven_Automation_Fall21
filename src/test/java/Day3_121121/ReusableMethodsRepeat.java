package Day3_121121;

public class ReusableMethodsRepeat {
    public static void main(String[] args) {
        //add two number using resuable methods
        //ReusableMethodsRepeat.addTwoNumbers(40,50);
        //call the return method and store it in a variable to perform something else on it
        int finalResult = ReusableLibrary.ReusableMethodsRepeat.subtractTwoNumbers(50,10);
        int newResult = finalResult + 10;
        System.out.println("My final result is " +newResult);

    }//end of main
}//end of class
