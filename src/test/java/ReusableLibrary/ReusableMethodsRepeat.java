package ReusableLibrary;

public class ReusableMethodsRepeat {
    //Create a void method to add two numbers
    public static void addTwoNumbers(int num1, int num2) {

        System.out.println("The result of two numbers is " + (num1 + num2));
        //or
        int result = num1 + num2;
        System.out.println("The result of two numbers is " + result);
    }//end of method

    public static int subtractTwoNumbers(int a, int b) {
        int result = a - b;
        System.out.println("The result of two numbers is " + result);
        return result;
    }

}//end of class
