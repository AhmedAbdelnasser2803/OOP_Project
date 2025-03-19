package courses;

//ClassName
public class EnglishCourse {

    private int age =60;
    public int testInstanceVar()
    {
        return age;
    }
    public static void main(String [] args)
    {
        EnglishCourse course = new EnglishCourse();
        System.out.println(course.testInstanceVar());
    }

}
