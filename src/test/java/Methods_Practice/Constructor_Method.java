package Methods_Practice;

public class Constructor_Method {
    //declare global variable
    int x = 5;
    int y = 8;
    int HouseNumber = 1001;
    String zipcode = "11218";

    public Constructor_Method() {
        System.out.println("My zip code is " +zipcode);
    }
    public Constructor_Method(String zipcode) {
        this.zipcode = zipcode;
        System.out.println(zipcode);

    }
    public void Constructor_Method(String houseNumber, int number){

    }
}
