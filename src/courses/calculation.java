package courses;

public class calculation {
    protected int total ;
    public void addition (int firstNum ,int secondNum)
    {
        total=firstNum+secondNum;
        System.out.println("addtional is : "+total);
    }
    public void subtraction(int firstNum ,int secondNum)
    {
        //if condition handel the greate number
        if(firstNum>secondNum)
            total=firstNum-secondNum;
        else
            total=secondNum-firstNum;
        System.out.println("subtraction is : "+total);
    }
    public int returnTotal()
    {
        return total;
    }
}
