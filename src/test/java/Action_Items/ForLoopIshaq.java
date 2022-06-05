package Action_Items;

import java.util.ArrayList;

public class ForLoopIshaq {
    public static void main(String[] args) {

                // define and declare Arraylist use for loop
                ArrayList<String> countries = new ArrayList<>();
                countries.add("usa");
                countries.add("uk");
                countries.add("bahamas");
                countries.add("canada");
                // define and declare int array using for loop
                ArrayList<Integer> CountryCode = new ArrayList<Integer>();
                CountryCode.add(921);
                CountryCode.add(943);
                CountryCode.add(959);
                CountryCode.add(965);
                for (int i = 0 ; i< CountryCode.size();i++){
                    System.out.println(" my country is " + countries.get(i)+ " and my CountryCode is "+ CountryCode.get(i));
                }//loop

            }// main

        }//class



