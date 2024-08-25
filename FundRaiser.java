import com.sun.tools.javac.Main;
import secondPackage.Message;

public class FundRaiser {

    String name;
    int moneyDonated;
    long mobileNumber;

    static int fundsCollected;
// Example for static keyword
    public FundRaiser(String name , int moneyDonated , long mobileNumber)
    {
        this.name = name;

        this.moneyDonated = moneyDonated;

        this.mobileNumber = mobileNumber;

        // since fundscollected is static variable it is accessed using class name so it does not depend on objects.
        FundRaiser.fundsCollected += moneyDonated;
    }
    // toString method is used to format the output code.
    public String toString()
    {
        return "[Name: "+ name +", moneyDonated: " + moneyDonated+ ", mobileno: "+mobileNumber+" Funds Raised :"+ fundsCollected + "]";
    }

    /*
        1) you cannot use non-static methods in static methods because static methods are object independent
            and non-static methods depends on objects you need object reference to access non-static methods
            in static methods
         2) you can use static methods inside non-static methods.
     */

    public static void main(String[] args) {
        FundRaiser person1 = new FundRaiser("Bhanu" , 2000 , 913208646);
        FundRaiser person2 = new FundRaiser("vamsi" , 8000 , 813504766);
        FundRaiser person3 = new FundRaiser("utham" , 5000 , 913508766);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        message();
    }

    public static void message()
    {
        System.out.println("I am from static method");
        //message2(); I will get error because i am using non-static method in static method;
        //The correct way to call non-static method inside static class is:
        FundRaiser obj = new FundRaiser("s",23,93739839);
        obj.message2();
    }

    public void message2()
    {
        System.out.println("I am from non static method");
    }

    public void message3()
    {
        // I don't need to create an obj to call non-static method inside non-static method because at the end
        //everything goes into main method which is static there you need obj to call non-static methods.
        message2();
    }


}
