package courses;

public class Mammallnt implements IAnimal{
    @Override
    public void eat() {
        System.out.println("Mammal eat");
    }

    @Override
    public void travel() {
        System.out.println("Mammal Travel");

    }

    public static void main(String[] args) {
        Mammallnt obj = new Mammallnt();
        obj.eat();
        obj.travel();
    }
}
