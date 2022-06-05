package Action_Items;

public class WhileLooplassWorkIshaq {
    public static void main(String[] args) {
        //define and declare string array
        String[] region = new String[]{"bahamas","uk","usa","canada"};
        // define and declare int array
        int[] AreaCode = new int[]{222,333,444,555};

        // insilize the starting point for while loop
        int i=0;
        //define the end point in while loop
        while (i < AreaCode.length){
            System.out.println(" my region is " +region[i] + " and my area code is " +AreaCode[i]);
            i = i + 1;
        }//whileloop

    }//main
}//class

