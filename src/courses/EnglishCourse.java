package courses;

//ClassName
public class EnglishCourse {

    //declare variable related to courses
    int students ,weeks ,days;
    //Method
    public static void main(String [] args)
    {
           EnglishCourse eng11 =new EnglishCourse();
           int totalDays;
           eng11.students=10;
           eng11.weeks=4;
           eng11.days=3;
           totalDays  = eng11.weeks * eng11.days;
        System.out.println("the total days is :"+totalDays);
    }
}
