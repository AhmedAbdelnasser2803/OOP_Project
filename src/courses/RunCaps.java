package courses;

public class RunCaps {
    public static void main(String[] args) {
        EncapTest obj1 = new EncapTest();
        obj1.setName("ahmed abdelnasser");
        obj1.setIdnum("192939");
        obj1.setAge(15);
        System.out.println("the name is : "+obj1.getName());
        System.out.println("the id is : "+obj1.getIdnum());
        System.out.println("the age is : "+obj1.getAge());
    }
}
