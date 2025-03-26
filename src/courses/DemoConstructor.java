package courses;

public class DemoConstructor {
    /*
    * that constructor run directly if we declare object of the class
    * "RunDemoConstructor" is thr run class to see the output of constructor
    * we can do polymorphism on constructor
    * */
    public DemoConstructor()
    {
        System.out.println("the first constructor of the class");
    }
    public DemoConstructor(String name)
    {
        System.out.println("the String is : "+name);
    }
}
