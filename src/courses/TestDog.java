package courses;

public class TestDog {

    public static void main(String [] args)
    {
        //overriding
        Dog d1 =new Dog();
        Animal a=new Animal();
        Animal ad = new Dog();
        d1.move();
        a.move();
        ad.move();
    }
}
