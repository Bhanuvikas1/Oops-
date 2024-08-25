
public class ClassesAndObjects{
    public static class person{

        //instance variables/
        public String name;

        public int age;

        public double weight;
        // constructor calling other constructor.
        public person()
        {
            this ("not yet defined" , 0 , 0.0);
        }

        //constructor with parameters.
        public person(String name , int age , double weight)
        {
            this.name = name;

            this.age = age;

            this.weight = weight;
        }
        // here we modified the default toString() method.
        public String toString() {
            return "Person [Name: " + name + ", Age: " + age + ", Weight: " + weight + " kg]";
        }

        protected void finalize() throws Throwable
        {
            System.out.println("object is destroyed");
        }
    }

    public static void main(String[] args) {
        person p1 = new person();
        System.out.println(p1);
//
//        person p2 = new person("bhanu" , 24 , 62.4);
//        System.out.println(p2);

        person p2;

        for (int index = 0; index < 1090909;index++)
        {
            p2 = new person();
        }

    }
}
