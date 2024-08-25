public class StaticBlock {

    public static int a = 2;

    public static int b;
    //static block.

    // way to initialize the static variables.
    static{
        System.out.println("Loading for the first time");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();

        System.out.println(a + " " + b);

        b+=5;
        StaticBlock obj2 = new StaticBlock();

        System.out.println(a + " " + b);
        //no matter how many objects we create the static block will only runs once when class is loaded for the first time.
    }
}
